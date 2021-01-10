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

public class OrderCompleteActivity extends Activity {
    Drinks drinks;
    ArrayList<Drinks> drinklist = new ArrayList<Drinks>();
    Foods foods;
    ArrayList<Foods> foodlist = new ArrayList<Foods>();
    Snacks snacks;
    ArrayList<Snacks> snacklist = new ArrayList<Snacks>();
    ListView drinkscompletelv, foodscompletelv, snackscompletelv;
    Button btn_mainmenu;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_complete);

        int totalpricecomplete = 0;
        TextView totalPriceComplete = (TextView) findViewById(R.id.totalPriceComplete);

        //drink
        Intent intent = getIntent();
        String drink = intent.getStringExtra(DisplayDrinksActivity.EXTRA_DRINKS);
        int drinkprice = intent.getIntExtra(DisplayDrinksActivity.EXTRA_PRICE, 0);
        int drinkqty = intent.getIntExtra(OrderDrinksActivity.EXTRA_QTY, 0);

        totalpricecomplete = totalpricecomplete + (drinkprice * drinkqty);

        drinks = new Drinks(drink, drinkprice, drinkqty);
        drinklist.add(drinks);

        drinkscompletelv = (ListView) findViewById(R.id.lv_drinksComplete);
        ArrayAdapter ad = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1 ,drinklist);
        drinkscompletelv.setAdapter(ad);

        //food
        String food = intent.getStringExtra(DisplayFoodsActivity.EXTRA_FOODS);
        int foodprice = intent.getIntExtra(DisplayFoodsActivity.EXTRA_PRICE, 0);
        int foodqty = intent.getIntExtra(OrderFoodsActivity.EXTRA_QTY, 0);

        totalpricecomplete = totalpricecomplete + (foodprice * foodqty);

        foods = new Foods(food, foodprice, foodqty);
        foodlist.add(foods);

        foodscompletelv = (ListView) findViewById(R.id.lv_foodsComplete);
        ArrayAdapter ad2 = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1 ,foodlist);
        foodscompletelv.setAdapter(ad2);

        //snack
        String snack = intent.getStringExtra(DisplaySnacksActivity.EXTRA_SNACKS);
        int snackprice = intent.getIntExtra(DisplaySnacksActivity.EXTRA_PRICE, 0);
        int snackqty = intent.getIntExtra(OrderSnacksActivity.EXTRA_QTY, 0);

        totalpricecomplete = totalpricecomplete + (snackprice * snackqty);

        snacks = new Snacks(snack, snackprice, snackqty);
        snacklist.add(snacks);

        snackscompletelv = (ListView) findViewById(R.id.lv_snacksComplete);
        ArrayAdapter ad3 = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1 ,snacklist);
        snackscompletelv.setAdapter(ad3);

        totalPriceComplete.setText("" + totalpricecomplete);

        ad.notifyDataSetChanged();
        ad2.notifyDataSetChanged();
        ad3.notifyDataSetChanged();

    }

    public void onMainMenu(View view){
        btn_mainmenu = (Button) findViewById(R.id.btn_mainmenu);
        Intent intent = new Intent(OrderCompleteActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
