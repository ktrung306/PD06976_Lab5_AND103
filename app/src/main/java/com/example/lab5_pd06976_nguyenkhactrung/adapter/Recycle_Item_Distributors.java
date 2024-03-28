package com.example.lab5_pd06976_nguyenkhactrung.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.lab5_pd06976_nguyenkhactrung.R;
import com.example.lab5_pd06976_nguyenkhactrung.databinding.ItemDistributorBinding;
import com.example.lab5_pd06976_nguyenkhactrung.model.Distributor;

import java.util.ArrayList;

public class Recycle_Item_Distributors extends RecyclerView.Adapter<Recycle_Item_Distributors.ViewHolder> {
    private ArrayList<Distributor> list;
    private Context context;
    private DistributorClick distributorClick;

    public Recycle_Item_Distributors(ArrayList<Distributor> list, Context context, DistributorClick distributorClick) {
        this.list = list;
        this.context = context;
        this.distributorClick = distributorClick;
    }

    public interface DistributorClick {
        void delete(Distributor distributor);
        void edit(Distributor distributor);
    }


    @NonNull
    @Override
    public Recycle_Item_Distributors.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemDistributorBinding binding = ItemDistributorBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull Recycle_Item_Distributors.ViewHolder holder, int position) {
        Distributor distributor = list.get(position);
        holder.binding.tvName.setText(distributor.getName());
        holder.binding.btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                distributorClick.delete(distributor);
            }
        });
        holder.binding.btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                distributorClick.edit(distributor);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemDistributorBinding binding;
        public ViewHolder( ItemDistributorBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
