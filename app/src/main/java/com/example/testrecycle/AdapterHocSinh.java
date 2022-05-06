package com.example.testrecycle;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class  AdapterHocSinh extends RecyclerView.Adapter<AdapterHocSinh.MyViewHolder> {
    private Context context;
    private List<HocSinh> mListHS;

    public AdapterHocSinh(Context context) {
        this.context = context;
    }

    public void setData(List<HocSinh> list){
        this.mListHS = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public AdapterHocSinh.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.oneobject_layout, parent ,false);
        return new AdapterHocSinh.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterHocSinh.MyViewHolder holder, int position) {
        HocSinh hocSinh = mListHS.get(position);
        if (hocSinh == null){
            return;
        }
        holder.textView_id.setText(mListHS.get(position).getId());
        holder.textView_name.setText(mListHS.get(position).getTen());
        holder.textView_age.setText(mListHS.get(position).getTuoi());

    }

    @Override
    public int getItemCount() {
        if (mListHS != null){
            return mListHS.size();
        }
        return 0;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textView_name, textView_age, textView_id;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView_id = itemView.findViewById(R.id.text_id);
            textView_name = itemView.findViewById(R.id.text_name);
            textView_age = itemView.findViewById(R.id.text_age);

        }
    }

}
