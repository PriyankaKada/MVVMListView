package com.example.webwerks.mvvmlistview;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.webwerks.mvvmlistview.Adapter.NewsAdapter;
import com.example.webwerks.mvvmlistview.Model.News;
import com.example.webwerks.mvvmlistview.ViewModel.NewsModel;
import com.example.webwerks.mvvmlistview.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding activityMainBinding;
    private NewsModel newsModel;
    private News news;
    private ArrayList<NewsModel> newsModelArrayList;
    private NewsAdapter newsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        newsModel = new NewsModel();

        newsModelArrayList=newsModel.getArrayList();
        newsAdapter=new NewsAdapter(this,newsModelArrayList);
        activityMainBinding.list.setAdapter(newsAdapter);
    }
}
