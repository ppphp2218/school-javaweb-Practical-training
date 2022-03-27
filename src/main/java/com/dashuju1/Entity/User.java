package com.dashuju1.Entity;

public class User {
    private String user_tno;
    private String user_pass;
    private String user_id;

    public User(String user_tno, String user_pass, String user_id) {
        this.user_tno = user_tno;
        this.user_pass = user_pass;
        this.user_id = user_id;
    }

    public User() {

    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_tno() {
        return user_tno;
    }

    public void setUser_tno(String user_tno) {
        this.user_tno = user_tno;
    }

    public String getUser_pass() {
        return user_pass;
    }

    public void setUser_pass(String user_pass) {
        this.user_pass = user_pass;
    }
}
