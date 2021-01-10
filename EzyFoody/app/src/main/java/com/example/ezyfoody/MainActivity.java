package com.example.ezyfoody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn_myOrder, btn_maps;
    TextView drinks_text, foods_text, snacks_text, topup_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onDisplayDrinksMenu(View view){
        drinks_text = (TextView) findViewById(R.id.drinks);
        Intent intent = new Intent(MainActivity.this, DisplayDrinksActivity.class);
        startActivity(intent);
    }

    public void onDisplayFoodsMenu(View view){
        foods_text = (TextView) findViewById(R.id.foods);
        Intent intent = new Intent(MainActivity.this, DisplayFoodsActivity.class);
        startActivity(intent);
    }

    public void onDisplaySnacksMenu(View view){
        snacks_text = (TextView) findViewById(R.id.snacks);
        Intent intent = new Intent(MainActivity.this, DisplaySnacksActivity.class);
        startActivity(intent);
    }

    public void onDisplayTopUpMenu(View view){
        topup_text = (TextView) findViewById(R.id.topup);
        Intent intent = new Intent(MainActivity.this, TopUpActivity.class);
        startActivity(intent);
    }

    public void onMyOrder(View view){
        btn_myOrder = (Button) findViewById(R.id.btn_myOrder);
        Intent intent = new Intent(MainActivity.this, MyOrderActivity.class);
        startActivity(intent);
    }

    public void onMaps(){
        btn_maps = (Button) findViewById(R.id.btn_maps);
        Intent intent = new Intent(MainActivity.this, MapActivity.class);
        startActivity(intent);
    }
}