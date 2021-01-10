package com.example.ezyfoody;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class OrderFoodsActivity extends Activity {

    Button btn_myOrder;
    Button btn_OrderMore;
    public static final String EXTRA_QTY = "com.example.ezyfoody.EXTRA_QTY";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_foods);

        Intent intent = getIntent();
        String foodorder = intent.getStringExtra(DisplayFoodsActivity.EXTRA_FOODS);
        TextView foodOrder = (TextView) findViewById(R.id.foodOrder);
        foodOrder.setText(foodorder);
        int priceorder = intent.getIntExtra(DisplayFoodsActivity.EXTRA_PRICE, 0);
        TextView priceOrder = (TextView) findViewById(R.id.priceOrder);
        priceOrder.setText("" + priceorder);
    }

    public void onMyOrder(View view){
        btn_myOrder = (Button) findViewById(R.id.btn_myOrder);

        EditText quantitytext = (EditText) findViewById(R.id.qty);
        String quantitystr = quantitytext.getText().toString();
        int quantity = Integer.parseInt(quantitystr);
        Intent intent = new Intent(OrderFoodsActivity.this, MyOrderActivity.class);
        intent.putExtra(EXTRA_QTY, quantity);
        startActivity(intent);
    }

    public void onOrderMore (View view){
        btn_OrderMore = (Button) findViewById(R.id.btn_OrderMore);

//        EditText quantitytext = (EditText) findViewById(R.id.qty);
//        String quantitystr = quantitytext.getText().toString();
//        int quantity = Integer.parseInt(quantitystr);
        Intent intent = new Intent(OrderFoodsActivity.this, DisplayDrinksActivity.class);
//        intent.putExtra(EXTRA_QTY, quantity);
        startActivity(intent);
    }

}
