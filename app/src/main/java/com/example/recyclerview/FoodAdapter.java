package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.Collection;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ViewHolder> {
    private Context context;
    private ArrayList<FoodModel> foodModels;

    public FoodAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<FoodModel> getFoodModels() {
        return foodModels;
    }

    public void setFoodModels(ArrayList<FoodModel> foodModels) {
        this.foodModels = foodModels;
    }


    @NonNull
    @Override
    public FoodAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_food,parent,false);
        return new ViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodAdapter.ViewHolder holder, int position) {
        Glide.with(context).load(getFoodModels().get(position).getFoodPic()).into(holder.ivFoodPic);
        holder.tvFoodName.setText(getFoodModels().get(position).getFoodName());
    }

    @Override
    public int getItemCount() {
        return getFoodList().size();
    }

    private Collection<Object> getFoodList() {
        return null;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView ivFoodPic;
        private TextView tvFoodName;

        public ViewHolder (@NonNull View itemView) {
            super(itemView);
            ivFoodPic = itemView.findViewById(R.id.pic);
            tvFoodName = itemView.findViewById(R.id.tv1);
        }
    }
}
