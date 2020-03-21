package com.example.takehomeassignment07_lingyiz;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class PlaceViewHolder extends RecyclerView.ViewHolder {

    CardView cardView;
    TextView placeName, placeDes;
    ImageView placeImg;

    public PlaceViewHolder(@NonNull View itemView, final Context context) {
        super(itemView);
        cardView = (CardView) itemView.findViewById(R.id.card_view);
        placeName = (TextView) itemView.findViewById(R.id.name);
        placeDes = (TextView) itemView.findViewById(R.id.description);
        placeImg = (ImageView) itemView.findViewById(R.id.photo);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, placeName.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
