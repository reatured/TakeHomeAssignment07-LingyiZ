package com.example.takehomeassignment07_lingyiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class ThirdDisplayWindow extends AppCompatActivity {
    List<Place> places;
    String tokyoDes, parisDes, burjDes;
    PlaceAdapter placeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        generateDescription();
        initialData();
        placeAdapter = new PlaceAdapter(places, this);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycle_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(placeAdapter);
    }


    void initialData() {
        places = new ArrayList<Place>();
        places.add(new Place("Tokyo", tokyoDes, R.drawable.tokyo_tower));
        places.add(new Place("Paris", parisDes, R.drawable.eiffel_tower));
        places.add(new Place("Abu Dhabi", burjDes, R.drawable.burj_khalifa));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.third_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add:
                addRandomPlace((int) (Math.random() * 3));
                placeAdapter.notifyDataSetChanged();
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void addRandomPlace(int num) {
        places.add(places.get(num));
    }

    private void generateDescription() {
        tokyoDes = "A very old city";
        parisDes = "A very big city";
        burjDes = "A very rich city";
    }

}
