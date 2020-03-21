package com.example.takehomeassignment07_lingyiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class SecondDisplayWindow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_display_window);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.second_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.share:
                generateToast("shared");
                return true;
            case R.id.save:
                generateToast("saved");
                return true;
            case R.id.toRecycleView:
                phaseToLastWindow();
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void phaseToLastWindow() {
        Intent i = new Intent(this, ThirdDisplayWindow.class);
        startActivity(i);
    }

    private void generateToast(String toast) {
        Toast.makeText(this, toast,Toast.LENGTH_SHORT).show();
    }
}
