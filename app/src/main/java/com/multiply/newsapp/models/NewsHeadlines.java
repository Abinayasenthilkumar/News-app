package com.multiply.newsapp.models;

import java.io.Serializable;

public class NewsHeadlines implements Serializable {
    Source source=null;
    String author="";
    String title="";
    String description="";
    String url="";
    String urlToImage="";
    String publicshedAt="";
    String content="";

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrlToImage() {
        return urlToImage;
    }

    public void setUrlToImage(String urlToImage) {
        this.urlToImage = urlToImage;
    }

    public String getPublicshedAt() {
        return publicshedAt;
    }

    public void setPublicshedAt(String publicshedAt) {
        this.publicshedAt = publicshedAt;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
