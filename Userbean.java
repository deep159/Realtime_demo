package com.example.hi.realtimedemo;

/**
 * Created by Hi on 20-04-2017.
 */

public class Userbean {
    String id;
    String name;
    String job;

    Userbean(String userid,String username,String job){
        this.id=userid;
        this.name=username;
        this.job=job;
    }
    Userbean(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
