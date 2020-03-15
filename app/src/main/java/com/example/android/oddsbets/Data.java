package com.example.android.oddsbets;

import java.util.List;

public class Data {

    public List<OddsBet> data;

    public Data (List<OddsBet> data){
        this.data =data;
    }
    public  Data (){}

    public List<OddsBet> getData() {
        return data;
    }

    public void setData(List<OddsBet> data) {
        this.data = data;
    }
}
