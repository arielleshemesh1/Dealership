package com.wyz.ariellesdealership;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

// Car View Holder Class To Mirror Car Data Instances
public class CarViewHolder extends RecyclerView.ViewHolder {

    // Declare View Variables
    public CardView card;
    public ImageView avatar;
    public TextView brand;
    public TextView model;
    public TextView year;
    public TextView price;

    public CarViewHolder(@NonNull View itemView) {
        super(itemView);

        // Get Items By ID
        card = itemView.findViewById(R.id.card);
        avatar = itemView.findViewById(R.id.avatar);
        brand = itemView.findViewById(R.id.brand);
        model = itemView.findViewById(R.id.model);
        year = itemView.findViewById(R.id.year);
        price = itemView.findViewById(R.id.price);

    }
}
