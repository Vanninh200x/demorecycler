package com.example.testrecycle;

public class HocSinh {
    private String id;
    private String ten;
    private String tuoi;

    public HocSinh() {
    }

    public HocSinh(String id, String ten, String tuoi) {
        this.id = id;
        this.ten = ten;
        this.tuoi = tuoi;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }
}
