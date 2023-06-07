package com.driver;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

import java.util.Objects;

public class User {
    private String name;
    private String mobile;

    //constructors
    public User(){

    }
    public User(String name,String mobile){
        this.name = name;
        this.mobile = mobile;
    }

    //Getters and Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }

    //overriden methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(getName(), user.getName()) && Objects.equals(getMobile(), user.getMobile());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getMobile());
    }
}