package com.example.ezyfoody;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class OrderSnacksActivity extends Activity {

    Button btn_myOrder;
    Button btn_OrderMore;
    public static final String EXTRA_QTY = "com.example.ezyfoody.EXTRA_QTY";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_snacks);

        Intent intent = getIntent();
        String snackorder = intent.getStringExtra(DisplaySnacksActivity.EXTRA_SNACKS);
        TextView snackOrder = (TextView) findViewById(R.id.snackOrder);
        snackOrder.setText(snackorder);
        int priceorder = intent.getIntExtra(DisplaySnacksActivity.EXTRA_PRICE, 0);
        TextView priceOrder = (TextView) findViewById(R.id.priceOrder);
        priceOrder.setText("" + priceorder);
    }

    public void onMyOrder(View view){
        btn_myOrder = (Button) findViewById(R.id.btn_myOrder);

        EditText quantitytext = (EditText) findViewById(R.id.qty);
        String quantitystr = quantitytext.getText().toString();
        int quantity = Integer.parseInt(quantitystr);
        Intent intent = new Intent(OrderSnacksActivity.this, MyOrderActivity.class);
        intent.putExtra(EXTRA_QTY, quantity);
        startActivity(intent);
    }

    public void onOrderMore (View view){
        btn_OrderMore = (Button) findViewById(R.id.btn_OrderMore);

//        EditText quantitytext = (EditText) findViewById(R.id.qty);
//        String quantitystr = quantitytext.getText().toString();
//        int quantity = Integer.parseInt(quantitystr);
        Intent intent = new Intent(OrderSnacksActivity.this, DisplayDrinksActivity.class);
//        intent.putExtra(EXTRA_QTY, quantity);
        startActivity(intent);
    }

}
