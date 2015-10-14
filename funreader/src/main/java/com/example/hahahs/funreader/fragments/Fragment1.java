package com.example.hahahs.funreader.fragments;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.hahahs.funreader.R;
import com.example.hahahs.funreader.adapters.Page1Adapter;
import com.example.hahahs.funreader.beans.News;
import com.example.hahahs.funreader.utils.HttpUtil;
import com.google.gson.Gson;
import com.orangegangsters.github.swipyrefreshlayout.library.SwipyRefreshLayout;
import com.orangegangsters.github.swipyrefreshlayout.library.SwipyRefreshLayoutDirection;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

//import static com.example.hahahs.funreader.R.id.recyclerview;

/**
 * Created by hahahs on 2015/10/12.
 */
public class Fragment1 extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private Page1Adapter adapter;
    private List<News.ResultEntity> list;
    private SwipyRefreshLayout swipyRefreshLayout;
    Gson gson;


    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case 1:
                    list = (List<News.ResultEntity>) msg.obj;
                    adapter = new Page1Adapter(list,getContext());
                    recyclerView.setAdapter(adapter);
                    adapter.notifyDataSetChanged();


                    break;
                default:
                    break;
            }
        }
    };


    public static final String KEY = "977172adfe655c5813d1cea96e66ef42";

    @Override
    public void onStart() {
        super.onStart();
        getList();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.page1, container, false);
        swipyRefreshLayout = (SwipyRefreshLayout) view.findViewById(R.id.swipyrefreshlayout);
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(container.getContext()));

        swipyRefreshLayout.setOnRefreshListener(new SwipyRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh(SwipyRefreshLayoutDirection swipyRefreshLayoutDirection) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        getList();
                        swipyRefreshLayout.setRefreshing(false);


                    }
                },2500);

            }
        });



        return view;
    }

    private void getList() {


//        list = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        String url = "http://op.juhe.cn/onebox/news/query";

        try {
            stringBuilder.append(url).append("?q=").append(URLEncoder.encode("习近平", "utf-8"))
                    .append("&key=").append(KEY);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        HttpUtil.getJSON(stringBuilder.toString(), new HttpUtil.RequestListener() {
            @Override
            public void onSuccess(String result) {

//                JSONObject jsonObject = null;
//                try {
//                    jsonObject = new JSONObject(result);
//
//                    JSONArray jsonArray = jsonObject.getJSONArray("result");
//
//                    for (int i=0;i<jsonArray.length();i++){
//                        JSONObject jsonObject1 = jsonArray.getJSONObject(i);
//                        News.ResultEntity result1 = new News.ResultEntity();
//                        result1.setTitle(jsonObject1.getString("title"));
//                        result1.setContent(jsonObject1.getString("content"));
//                        result1.setSrc(jsonObject1.getString("src"));
//                        result1.setPdate_src(jsonObject1.getString("pdate_src"));
//                        list.add(result1);
//                    }
//                } catch (JSONException e) {
//                    e.printStackTrace();
//                }
                gson = new Gson();
                News news = gson.fromJson(result, News.class);
                List<News.ResultEntity> list1 = news.getResult();
                Message message = new Message();
                message.what = 1;
                message.obj = list1;
                handler.sendMessage(message);


            }

            @Override
            public void onError(Exception e) {

            }
        });


    }
/*        RequestQueue requestQueue = Volley.newRequestQueue(getContext());
        StringRequest stringRequest = new StringRequest(stringBuilder.toString(), new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {
                gson = new Gson();
                News_item news_item = gson.fromJson(s, News_item.class);
                list = news_item.getResult();

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {

            }
        });
        requestQueue.add(stringRequest);*/


}



