package com.hiepsummer.firebaseexample;

public class User {
    String ten;
    boolean gioiTinh;
    String tuoi;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public User() {
    }

    public User(String ten, boolean gioiTinh, String tuoi) {
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.tuoi = tuoi;
    }
}
