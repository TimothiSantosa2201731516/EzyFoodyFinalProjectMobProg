package com.example.ezyfoody;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DisplaySnacksActivity extends Activity {
    public static final String EXTRA_SNACKS = "com.example.ezyfoody.EXTRA_SNACKS";
    public static final String EXTRA_PRICE = "com.example.ezyfoody.EXTRA_PRICE";
    Button btn_myOrder;

    String snackstring;
    String snackpricestr;
    int snackprice;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_snacks);
    }

    public void onMyOrder(View view) {
        btn_myOrder = (Button) findViewById(R.id.btn_myOrder);
        Intent intent = new Intent(DisplaySnacksActivity.this, MyOrderActivity.class);
        startActivity(intent);
    }

    public void onPlaceOrderKentangGoreng(View view){
        TextView kentanggoreng = (TextView) findViewById(R.id.KentangGoreng);
        TextView kentanggorengprice = (TextView) findViewById(R.id.KentangGorengPrice);
        snackstring = kentanggoreng.getText().toString();
        snackpricestr = kentanggorengprice.getText().toString();
        snackprice = Integer.parseInt(snackpricestr);

        Intent intent = new Intent(DisplaySnacksActivity.this, OrderDrinksActivity.class);
        intent.putExtra(EXTRA_SNACKS, snackstring);
        intent.putExtra(EXTRA_PRICE, snackprice);
        startActivity(intent);
    }

    public void onPlaceOrderBiskuit(View view){
        TextView biskuit = (TextView) findViewById(R.id.Biskuit);
        TextView biskuitprice = (TextView) findViewById(R.id.BiskuitPrice);
        snackstring = biskuit.getText().toString();
        snackpricestr = biskuitprice.getText().toString();
        snackprice = Integer.parseInt(snackpricestr);

        Intent intent = new Intent(DisplaySnacksActivity.this, OrderDrinksActivity.class);
        intent.putExtra(EXTRA_SNACKS, snackstring);
        intent.putExtra(EXTRA_PRICE, snackprice);
        startActivity(intent);
    }

    public void onPlaceOrderPopcorn(View view){
        TextView popcorn = (TextView) findViewById(R.id.Popcorn);
        TextView popcornprice = (TextView) findViewById(R.id.PopcornPrice);
        snackstring = popcorn.getText().toString();
        snackpricestr = popcornprice.getText().toString();
        snackprice = Integer.parseInt(snackpricestr);

        Intent intent = new Intent(DisplaySnacksActivity.this, OrderDrinksActivity.class);
        intent.putExtra(EXTRA_SNACKS, snackstring);
        intent.putExtra(EXTRA_PRICE, snackprice);
        startActivity(intent);
    }

}
