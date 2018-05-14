package com.example.webwerks.mvvmlistview.Adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.webwerks.mvvmlistview.R;
import com.example.webwerks.mvvmlistview.ViewModel.NewsModel;
import com.example.webwerks.mvvmlistview.databinding.ListRowBinding;

import java.util.ArrayList;

public class NewsAdapter extends ArrayAdapter<NewsModel> {
    Context context;
    private ArrayList<NewsModel> newsModelArrayList;

    public NewsAdapter(@NonNull Context context, ArrayList<NewsModel> newsModelArrayList) {
        super(context, R.layout.list_row, newsModelArrayList);
        this.context = context;
        this.newsModelArrayList = newsModelArrayList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        ListRowBinding listRowBinding= DataBindingUtil.inflate(layoutInflater,R.layout.list_row,parent,false);
        listRowBinding.setNewsList(newsModelArrayList.get(position));

        return listRowBinding.getRoot();

    }
}
