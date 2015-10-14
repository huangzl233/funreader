package com.example.hahahs.funreader.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.hahahs.funreader.R;
import com.example.hahahs.funreader.beans.News;

import static com.example.hahahs.funreader.R.id.page2;

/**
 * Created by hahahs on 2015/10/12.
 */
public class Fragment2 extends Fragment {
    private TextView textView ;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.page2,container,false);
        textView = (TextView) view.findViewById(page2);
        News news = new News();
        textView.setText("ahha");
        return view;
    }
}
