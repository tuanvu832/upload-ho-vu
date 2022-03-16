package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class ActivityPhone extends AppCompatActivity {
    private RecyclerView recyclerView;
private FloatingActionButton buttonFloat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone);
        buttonFloat = findViewById(R.id.fab);

        recyclerView = findViewById(R.id.rcv_data);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
            PhoneAdapter phoneAdapter = new PhoneAdapter(getListCaptial());
            recyclerView.setLayoutManager(linearLayoutManager);
            RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
            recyclerView.addItemDecoration(itemDecoration);
            recyclerView.setAdapter(phoneAdapter);
        buttonFloat.setOnClickListener(view -> {
            Intent intent = new Intent(ActivityPhone.this,MainActivity.class);
            startActivity(intent);
        });

    }



    private List<Phone> getListCaptial() {
        List<Phone> list = new ArrayList<>();
        list.add(new Phone("Ha Noi","01221212112"));
        list.add(new Phone("Ha Noi","01221212112"));
        list.add(new Phone("Ha Noi","01221212112"));
        list.add(new Phone("Ha Noi","01221212112"));
        list.add(new Phone("Ha Noi","01221212112"));

        return list;
    }
}