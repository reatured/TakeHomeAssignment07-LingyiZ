package com.example.takehomeassignment07_lingyiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ThirdDisplayWindow extends AppCompatActivity {
    List<Place> places;
    String tokyoDes, parisDes, burjDes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        initialData();

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycle_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new PlaceAdapter(places, this));
    }

    void initialData(){
        places = new ArrayList<Place>();
        places.add(new Place("Tokyo", tokyoDes, R.drawable.tokyo_tower));
        places.add(new Place("Paris", parisDes, R.drawable.eiffel_tower));
        places.add(new Place("Tokyo", burjDes, R.drawable.burj_khalifa));
    }
}
