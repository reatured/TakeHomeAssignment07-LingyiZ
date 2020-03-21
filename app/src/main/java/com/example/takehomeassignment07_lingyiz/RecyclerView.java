package com.example.takehomeassignment07_lingyiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecyclerView extends AppCompatActivity {
    List<Place> places;
    String TokyoDes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
    }

    void initialData(){
        places = new ArrayList<Place>();
        places.add(new Place("Tokyo", TokyoDes, R.drawable.));
    }
}
