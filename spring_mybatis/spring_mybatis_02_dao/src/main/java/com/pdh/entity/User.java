package com.pdh.entity;

public class User {

    private String id;
    private String psw;

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", psw='" + psw + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }
}
