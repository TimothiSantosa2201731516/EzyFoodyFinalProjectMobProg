package com.example.ezyfoody;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class DisplayDrinksActivity extends Activity {
    public static final String EXTRA_DRINKS = "com.example.ezyfoody.EXTRA_DRINKS";
    public static final String EXTRA_PRICE = "com.example.ezyfoody.EXTRA_PRICE";
    Button btn_myOrder;

    String drinkstring;
    String drinkpricestr;
    int drinkprice;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_drinks);
    }

    public void onMyOrder(View view) {
        btn_myOrder = (Button) findViewById(R.id.btn_myOrder);
        Intent intent = new Intent(DisplayDrinksActivity.this, MyOrderActivity.class);
        startActivity(intent);
    }

    public void onPlaceOrderAirMineral(View view) {
        TextView airmineral = (TextView) findViewById(R.id.AirMineral);
        TextView airmineralprice = (TextView) findViewById(R.id.AirMineralPrice);
        drinkstring = airmineral.getText().toString();
        drinkpricestr = airmineralprice.getText().toString();
        drinkprice = Integer.parseInt(drinkpricestr);

        Intent intent = new Intent(DisplayDrinksActivity.this, OrderDrinksActivity.class);
        intent.putExtra(EXTRA_DRINKS, drinkstring);
        intent.putExtra(EXTRA_PRICE, drinkprice);
        startActivity(intent);
    }

    public void onPlaceOrderJusApel (View view){
        TextView jusapel = (TextView) findViewById(R.id.JusApel);
        TextView jusapelprice = (TextView) findViewById(R.id.JusApelPrice);
        drinkstring = jusapel.getText().toString();
        drinkpricestr = jusapelprice.getText().toString();
        drinkprice = Integer.parseInt(drinkpricestr);

        Intent intent = new Intent(DisplayDrinksActivity.this, OrderDrinksActivity.class);
        intent.putExtra(EXTRA_DRINKS, drinkstring);
        intent.putExtra(EXTRA_PRICE, drinkprice);
        startActivity(intent);
    }

    public void onPlaceOrderJusMangga (View view){
        TextView jusmangga = (TextView) findViewById(R.id.JusMangga);
        TextView jusmanggaprice = (TextView) findViewById(R.id.JusManggaPrice);
        drinkstring = jusmangga.getText().toString();
        drinkpricestr = jusmanggaprice.getText().toString();
        drinkprice = Integer.parseInt(drinkpricestr);

        Intent intent = new Intent(DisplayDrinksActivity.this, OrderDrinksActivity.class);
        intent.putExtra(EXTRA_DRINKS, drinkstring);
        intent.putExtra(EXTRA_PRICE, drinkprice);
        startActivity(intent);
    }

    public void onPlaceOrderJusAlpukat (View view){
        TextView jusalpukat = (TextView) findViewById(R.id.JusAlpukat);
        TextView jusalpukatprice = (TextView) findViewById(R.id.JusAlpukatPrice);
        drinkstring = jusalpukat.getText().toString();
        drinkpricestr = jusalpukatprice.getText().toString();
        drinkprice = Integer.parseInt(drinkpricestr);

        Intent intent = new Intent(DisplayDrinksActivity.this, OrderDrinksActivity.class);
        intent.putExtra(EXTRA_DRINKS, drinkstring);
        intent.putExtra(EXTRA_PRICE, drinkprice);
        startActivity(intent);

    }

}
