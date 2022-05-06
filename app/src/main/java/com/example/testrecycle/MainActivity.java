package com.example.testrecycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private AdapterHocSinh adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.Recycler_view);
        adapter = new AdapterHocSinh(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        adapter.setData(setUpData());
        recyclerView.setAdapter(adapter);

    }

    private List<HocSinh> setUpData(){
        List<HocSinh> arrayList = new ArrayList<>();
        arrayList.add(new HocSinh("1", "Văn Ninh Nguyễn", "3"));
        arrayList.add(new HocSinh("1", "Văn Ninh Nguyễn", "3"));
        arrayList.add(new HocSinh("1", "Văn Ninh Nguyễn", "3"));
        arrayList.add(new HocSinh("1", "Văn Ninh Nguyễn", "3"));
        arrayList.add(new HocSinh("1", "Văn Ninh Nguyễn", "3"));
        arrayList.add(new HocSinh("1", "Văn Ninh Nguyễn", "3"));
        arrayList.add(new HocSinh("1", "Văn Ninh Nguyễn", "3"));
        arrayList.add(new HocSinh("1", "Văn Ninh Nguyễn", "3"));
        arrayList.add(new HocSinh("1", "Văn Ninh Nguyễn", "3"));
        arrayList.add(new HocSinh("1", "Văn Ninh Nguyễn", "3"));
        arrayList.add(new HocSinh("1", "Văn Ninh Nguyễn", "3"));
        arrayList.add(new HocSinh("1", "Văn Ninh Nguyễn", "3"));
        arrayList.add(new HocSinh("1", "Văn Ninh Nguyễn", "3"));
        arrayList.add(new HocSinh("1", "Văn Ninh Nguyễn", "3"));
        arrayList.add(new HocSinh("1", "Văn Ninh Nguyễn", "3"));
        arrayList.add(new HocSinh("1", "Văn Ninh Nguyễn", "3"));
        arrayList.add(new HocSinh("1", "Văn Ninh Nguyễn", "3"));
        arrayList.add(new HocSinh("1", "Văn Ninh Nguyễn", "3"));
        arrayList.add(new HocSinh("1", "Văn Ninh Nguyễn", "3"));
        arrayList.add(new HocSinh("1", "Văn Ninh Nguyễn", "3"));
        arrayList.add(new HocSinh("1", "Văn Ninh Nguyễn", "3"));
        arrayList.add(new HocSinh("1", "Văn Ninh Nguyễn", "3"));
        arrayList.add(new HocSinh("1", "Văn Ninh Nguyễn", "3"));
        arrayList.add(new HocSinh("1", "Văn Ninh Nguyễn", "3"));
        arrayList.add(new HocSinh("1", "Văn Ninh Nguyễn", "3"));
        arrayList.add(new HocSinh("1", "Văn Ninh Nguyễn", "3"));
        arrayList.add(new HocSinh("1", "Văn Ninh Nguyễn", "3"));
        arrayList.add(new HocSinh("1", "Văn Ninh Nguyễn", "3"));
        arrayList.add(new HocSinh("1", "Văn Ninh Nguyễn", "3"));
        arrayList.add(new HocSinh("1", "Văn Ninh Nguyễn", "3"));


        return arrayList;
    }
}