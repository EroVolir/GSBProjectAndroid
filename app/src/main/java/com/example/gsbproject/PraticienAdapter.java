package com.example.gsbproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.http.GET;

public class PraticienAdapter extends RecyclerView.Adapter<PraticienAdapter.RecyclerViewHolder> {
private List<Praticien> dataModelList;

    public PraticienAdapter(List<Praticien> dataModelList) {this.dataModelList = dataModelList; }
    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        RecyclerViewHolder viewHolder;
        View view = LayoutInflater.from((parent.getContext())).inflate(R.layout.recyclerview_list_praticien, parent, false);
        viewHolder = new RecyclerViewHolder(view);
        return  viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position){
        holder.tvId.setText(String.valueOf(dataModelList.get(position).getId()));
        holder.tvNom.setText(dataModelList.get(position).getNom());
        holder.tvPrenom.setText(dataModelList.get(position).getPrenom());
        holder.tvVille.setText(dataModelList.get(position).getVille());
    }

    public long getItemId(int position) {return super.getItemId(position);}

    @Override
    public int getItemCount() {return dataModelList.size();}

    public class RecyclerViewHolder extends RecyclerView.ViewHolder{
        TextView tvId;
        TextView tvNom;
        TextView tvPrenom;
        TextView tvVille;
        LinearLayout llItemView;

        public RecyclerViewHolder(@NonNull View itemview){
            super(itemview);
            llItemView = itemview.findViewById(R.id.llItemViewPraticien);
            tvId = itemview.findViewById(R.id.tvPraticienID);
            tvNom = itemview.findViewById(R.id.tvPraticienNom);
            tvPrenom = itemview.findViewById(R.id.tvPraticienPrenom);
            tvVille = itemview.findViewById(R.id.PraticienVille);
        }
    }
}
