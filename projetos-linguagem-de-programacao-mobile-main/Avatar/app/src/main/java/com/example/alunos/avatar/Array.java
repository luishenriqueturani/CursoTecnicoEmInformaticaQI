package com.example.alunos.avatar;

import java.util.ArrayList;

public class Array {
    private ArrayList<String> avatar = new ArrayList<>();

    public ArrayList<String> getSeries() {
        return avatar;
    }

    public void setSeries(ArrayList<String> series) {
        this.avatar = series;
    }

    @Override
    public String toString() {
        return "Características {"+ avatar + '}';
    }



}
