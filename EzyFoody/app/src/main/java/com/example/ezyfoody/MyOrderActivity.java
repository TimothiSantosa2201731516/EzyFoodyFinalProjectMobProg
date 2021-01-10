package com.example.ezyfoody;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyOrderActivity extends Activity {
    Drinks drinks;
    ArrayList<Drinks> drinklist = new ArrayList<Drinks>();
    Foods foods;
    ArrayList<Foods> foodlist = new ArrayList<Foods>();
    Snacks snacks;
    ArrayList<Snacks> snacklist = new ArrayList<Snacks>();
    Button btn_PayNow;
    ListView drinkslv, foodslv, snackslv;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_activity);
        int totalprice = 0;
        TextView totalPrice = (TextView) findViewById(R.id.totalPrice);

        //drink
        Intent intent = getIntent();
        String drink = intent.getStringExtra(DisplayDrinksActivity.EXTRA_DRINKS);
        int drinkprice = intent.getIntExtra(DisplayDrinksActivity.EXTRA_PRICE, 0);
        int drinkqty = intent.getIntExtra(OrderDrinksActivity.EXTRA_QTY, 0);

        totalprice = totalprice + (drinkprice * drinkqty);

        drinks = new Drinks(drink, drinkprice, drinkqty);
        drinklist.add(drinks);

        drinkslv = (ListView) findViewById(R.id.lv_drinks);
        ArrayAdapter ad = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1 ,drinklist);
        drinkslv.setAdapter(ad);

        //food
        String food = intent.getStringExtra(DisplayFoodsActivity.EXTRA_FOODS);
        int foodprice = intent.getIntExtra(DisplayFoodsActivity.EXTRA_PRICE, 0);
        int foodqty = intent.getIntExtra(OrderFoodsActivity.EXTRA_QTY, 0);

        totalprice = totalprice + (foodprice * foodqty);

        foods = new Foods(food, foodprice, foodqty);
        foodlist.add(foods);

        foodslv = (ListView) findViewById(R.id.lv_foods);
        ArrayAdapter ad2 = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1 ,foodlist);
        foodslv.setAdapter(ad2);

        //snack
        String snack = intent.getStringExtra(DisplaySnacksActivity.EXTRA_SNACKS);
        int snackprice = intent.getIntExtra(DisplaySnacksActivity.EXTRA_PRICE, 0);
        int snackqty = intent.getIntExtra(OrderSnacksActivity.EXTRA_QTY, 0);

        totalprice = totalprice + (snackprice * snackqty);

        snacks = new Snacks(snack, snackprice, snackqty);
        snacklist.add(snacks);

        snackslv = (ListView) findViewById(R.id.lv_snacks);
        ArrayAdapter ad3 = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1 ,snacklist);
        snackslv.setAdapter(ad3);

        totalPrice.setText("" + totalprice);

        ad.notifyDataSetChanged();
        ad2.notifyDataSetChanged();
        ad3.notifyDataSetChanged();

    }

    public void onPayButton(View view){
        btn_PayNow = (Button) findViewById(R.id.btn_PayNow);
        Intent intent = new Intent(MyOrderActivity.this, OrderCompleteActivity.class);
        startActivity(intent);
    }
}
