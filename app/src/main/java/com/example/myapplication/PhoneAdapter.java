package com.example.myapplication;

import android.graphics.Color;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.Random;

public class PhoneAdapter extends RecyclerView.Adapter<PhoneAdapter.PhoneViewHolder> {
    private List<Phone> phoneList;

    public PhoneAdapter(List<Phone> phoneList) {
        this.phoneList = phoneList;
    }


    @NonNull
    @Override
    public PhoneViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);
        return new PhoneViewHolder(view);
    }



    @Override
    public void onBindViewHolder(@NonNull PhoneViewHolder holder, int position) {
        Phone phone = phoneList.get(position);
        if (phone == null) return;
        holder.txtName.setText(phone.getName());
        holder.txtPhone.setText(phone.getPhone());
    }


    @Override
    public int getItemCount() {
        if (phoneList != null) return phoneList.size();
        return 0;
    }

    public class PhoneViewHolder extends RecyclerView.ViewHolder {
        private TextView txtName,txtPhone;


        public PhoneViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.name);
            txtPhone = itemView.findViewById(R.id.phone);

        }

    }
}
