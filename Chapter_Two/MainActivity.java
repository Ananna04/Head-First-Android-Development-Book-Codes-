package com.example.user.beeradvisorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class FindBeerActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);

    }
    public void onClickFindBeer(View view){

        TextView brands=findViewById(R.id.brands);
        Spinner color=findViewById(R.id.color);

        String beerType=String.valueOf(color.getSelectedItem());

        brands.setText(beerType);


    }
}
