package com.example.webwerks.mvvmlistview.Model;

import com.example.webwerks.mvvmlistview.ViewModel.NewsModel;

import java.util.ArrayList;

public class News {
    public String header;
    public String desc;

    public News(String header, String desc) {
        this.header = header;
        this.desc = desc;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
