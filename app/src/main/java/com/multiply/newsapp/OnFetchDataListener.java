package com.multiply.newsapp;

import com.multiply.newsapp.models.NewsHeadlines;

import java.util.List;

public interface OnFetchDataListener<Newsapiresponse> {
    void onFetchData(List<NewsHeadlines>list,String message);
    void onError(String message);
}
