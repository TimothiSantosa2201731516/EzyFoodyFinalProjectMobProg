package com.example.ezyfoody;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TopUpActivity extends Activity {
    Button btn_myOrder, btn_topUp;
    public static final String EXTRA_BALANCE = "com.example.ezyfoody.EXTRA_BALANCE";
    User user = new User();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_topup);

        TextView balancetext = (TextView) findViewById(R.id.amountbalance);
        balancetext.setText(user.getBalance());
    }

    public void onMyOrder(View view) {
        btn_myOrder = (Button) findViewById(R.id.btn_myOrder);
        Intent intent = new Intent(TopUpActivity.this, MyOrderActivity.class);
        startActivity(intent);
    }

    public void onTopUp(View view){
        EditText balancetext = (EditText) findViewById(R.id.balance);
        String balancestr = balancetext.getText().toString();
        int balance = Integer.parseInt(balancestr);

        user.setBalance(balance);

        btn_topUp = (Button) findViewById(R.id.btn_TopUp);
        Intent intent = new Intent(TopUpActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
