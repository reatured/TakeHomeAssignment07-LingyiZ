package com.example.takehomeassignment07_lingyiz;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PlaceAdapter extends RecyclerView.Adapter<PlaceViewHolder> {
    List<Place> places;
    Context context;

    private RecyclerView.ViewHolder holder;
    private int position;

    public PlaceAdapter(List<Place> places, Context context) {
        this.places = places;
        this.context = context;
    }

    @NonNull
    @Override
    public PlaceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_place, parent, false);
        return new PlaceViewHolder(view, context);
    }

    @Override
    public void onBindViewHolder(@NonNull PlaceViewHolder holder, int position) {
        Place place = places.get(position);
        holder.placeName.setText(place.name);
        holder.placeDes.setText(place.description);
        holder.placeImg.setImageResource(place.photoID);
    }



    @Override
    public int getItemCount() {
        return places.size();
    }
}
