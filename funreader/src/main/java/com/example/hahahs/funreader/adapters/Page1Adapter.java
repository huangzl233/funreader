package com.example.hahahs.funreader.adapters;

import android.content.Context;
import android.media.Image;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hahahs.funreader.R;
import com.example.hahahs.funreader.beans.News;
import com.squareup.picasso.Picasso;


import java.net.URI;
import java.util.List;

/**
 * Created by hahahs on 2015/10/13.
 */
public class Page1Adapter extends RecyclerView.Adapter<Page1Adapter.ViewHolder> {
    private List<News.ResultEntity> listnews;
    private Context context;
    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView title,content,time,src;
        public ImageView image;

        public ViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.title);
            content = (TextView) itemView.findViewById(R.id.content);
            src = (TextView) itemView.findViewById(R.id.src);
            time = (TextView) itemView.findViewById(R.id.time);
            image = (ImageView) itemView.findViewById(R.id.imageview);
        }
    }
    public Page1Adapter(List<News.ResultEntity> list,Context context){
        this.listnews = list;
        this.context = context;


    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.news_cell,parent,false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        News.ResultEntity news = listnews.get(position);
        if(!TextUtils.isEmpty(news.getImg())) {
            holder.image.setVisibility(View.VISIBLE);
            holder.title.setText(news.getTitle());
            holder.content.setText(news.getContent());
            holder.src.setText(news.getSrc());
            holder.time.setText(news.getPdate_src());
            Picasso.with(context).load(Uri.parse(news.getImg())).into(holder.image);
        }else {
            holder.image.setVisibility(View.GONE);
            holder.title.setText(news.getTitle());
            holder.content.setText(news.getContent());
            holder.src.setText(news.getSrc());
            holder.time.setText(news.getPdate_src());
        }






    }

    @Override
    public int getItemCount() {
        return listnews.size();
    }
}
