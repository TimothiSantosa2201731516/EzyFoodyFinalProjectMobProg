package com.example.ezyfoody;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DisplayFoodsActivity extends Activity {
    public static final String EXTRA_FOODS = "com.example.ezyfoody.EXTRA_FOODS";
    public static final String EXTRA_PRICE = "com.example.ezyfoody.EXTRA_PRICE";
    Button btn_myOrder;

    String foodstring;
    String foodpricestr;
    int foodprice;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_foods);
    }

    public void onMyOrder(View view) {
        btn_myOrder = (Button) findViewById(R.id.btn_myOrder);
        Intent intent = new Intent(DisplayFoodsActivity.this, MyOrderActivity.class);
        startActivity(intent);
    }

    public void onPlaceOrderNasiGoreng(View view){
        TextView nasigoreng = (TextView) findViewById(R.id.NasiGoreng);
        TextView nasigorengprice = (TextView) findViewById(R.id.NasiGorengPrice);
        foodstring = nasigoreng.getText().toString();
        foodpricestr = nasigorengprice.getText().toString();
        foodprice = Integer.parseInt(foodpricestr);

        Intent intent = new Intent(DisplayFoodsActivity.this, OrderDrinksActivity.class);
        intent.putExtra(EXTRA_FOODS, foodstring);
        intent.putExtra(EXTRA_PRICE, foodprice);
        startActivity(intent);
    }

    public void onPlaceOrderNasiUduk(View view){
        TextView nasiuduk = (TextView) findViewById(R.id.NasiUduk);
        TextView nasiudukprice = (TextView) findViewById(R.id.NasiUdukPrice);
        foodstring = nasiuduk.getText().toString();
        foodpricestr = nasiudukprice.getText().toString();
        foodprice = Integer.parseInt(foodpricestr);

        Intent intent = new Intent(DisplayFoodsActivity.this, OrderDrinksActivity.class);
        intent.putExtra(EXTRA_FOODS, foodstring);
        intent.putExtra(EXTRA_PRICE, foodprice);
        startActivity(intent);

    }

    public void onPlaceOrderNasiKuning(View view){
        TextView nasikuning = (TextView) findViewById(R.id.NasiKuning);
        TextView nasikuningprice = (TextView) findViewById(R.id.NasiKuningPrice);
        foodstring = nasikuning.getText().toString();
        foodpricestr = nasikuningprice.getText().toString();
        foodprice = Integer.parseInt(foodpricestr);

        Intent intent = new Intent(DisplayFoodsActivity.this, OrderDrinksActivity.class);
        intent.putExtra(EXTRA_FOODS, foodstring);
        intent.putExtra(EXTRA_PRICE, foodprice);
        startActivity(intent);

    }

    public void onPlaceOrderNasiCampur(View view){
        TextView nasicampur = (TextView) findViewById(R.id.NasiCampur);
        TextView nasicampurprice = (TextView) findViewById(R.id.NasiCampurPrice);
        foodstring = nasicampur.getText().toString();
        foodpricestr = nasicampurprice.getText().toString();
        foodprice = Integer.parseInt(foodpricestr);

        Intent intent = new Intent(DisplayFoodsActivity.this, OrderDrinksActivity.class);
        intent.putExtra(EXTRA_FOODS, foodstring);
        intent.putExtra(EXTRA_PRICE, foodprice);
        startActivity(intent);

    }
}
