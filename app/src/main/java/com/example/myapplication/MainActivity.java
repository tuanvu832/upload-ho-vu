package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private EditText editName,editEmail;
private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editName = findViewById(R.id.name);
        editEmail = findViewById(R.id.phone);
        button = findViewById(R.id.btn_login);
        button.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ActivityPhone.class);
            String strName = editName.getText().toString();
            String strEmail = editName.getText().toString();
            Bundle bundle = new Bundle();
            Phone phone = new Phone(strName,strEmail);
            bundle.putSerializable("obj_user",phone);
            intent.putExtras(bundle);
            startActivity(intent);
        });
    }
}