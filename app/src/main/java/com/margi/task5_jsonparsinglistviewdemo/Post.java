package com.margi.task5_jsonparsinglistviewdemo;

import android.widget.BaseAdapter;

/**
 * Created by Margi on 08-Feb-17.
 */
public class Post{
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int userId,id;
    public String title,body;
}