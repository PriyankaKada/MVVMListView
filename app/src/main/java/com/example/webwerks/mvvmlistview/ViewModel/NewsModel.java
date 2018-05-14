package com.example.webwerks.mvvmlistview.ViewModel;

import com.example.webwerks.mvvmlistview.Model.News;

import java.util.ArrayList;

public class NewsModel {
public String header;
public String desc;

    public NewsModel(News news) {
        this.header=news.header;
        this.desc=news.desc;
    }

    public NewsModel() {

    }
    public ArrayList<NewsModel> getArrayList(){
        ArrayList<NewsModel> newsModelArrayList=new ArrayList<>();

        NewsModel newsModel=new NewsModel(new News("First Header","Description 1"));
        NewsModel newsModel1=new NewsModel(new News("Second Header","Description 2"));
        NewsModel newsModel2=new NewsModel(new News("Third Header","Description 3"));
        NewsModel newsModel3=new NewsModel(new News("Fourth Header","Description 4"));
        NewsModel newsModel4=new NewsModel(new News("Fifth Header","Description 5"));
        newsModelArrayList.add(newsModel);
        newsModelArrayList.add(newsModel1);
        newsModelArrayList.add(newsModel2);
        newsModelArrayList.add(newsModel3);
        newsModelArrayList.add(newsModel4);

        return newsModelArrayList;
    }
}
