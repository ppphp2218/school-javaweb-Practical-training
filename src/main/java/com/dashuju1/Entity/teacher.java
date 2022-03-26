package com.dashuju1.Entity;

public class teacher {
    private int tid;
    private String tname;
    private String tsdept;
    private int tscore;
    private int trank;

    public teacher(int tid, String tname, String tsdept, int tscore, int trank) {
        this.tid = tid;
        this.tname = tname;
        this.tsdept = tsdept;
        this.tscore = tscore;
        this.trank = trank;
    }

    public teacher() {

    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getTsdept() {
        return tsdept;
    }

    public void setTsdept(String tsdept) {
        this.tsdept = tsdept;
    }

    public int getTscore() {
        return tscore;
    }

    public void setTscore(int tscore) {
        this.tscore = tscore;
    }

    public int getTrank() {
        return trank;
    }

    public void setTrank(int trank) {
        this.trank = trank;
    }
}
