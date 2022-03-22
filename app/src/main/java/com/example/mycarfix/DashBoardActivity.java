package com.example.mycarfix;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DashBoardActivity extends AppCompatActivity {

    @BindView(R.id.purchase) CardView mPurchase;
    @BindView(R.id.garage) CardView mGarage;
    @BindView(R.id.service) CardView mService;
    @BindView(R.id.mechanic) CardView mMechanic;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
        ButterKnife.bind(this);

        mPurchase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DashBoardActivity.this,"Purchase Part",Toast.LENGTH_LONG).show();
            }
        });

        mGarage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DashBoardActivity.this,"Auto Garage",Toast.LENGTH_LONG).show();
            }
        });

        mService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DashBoardActivity.this,"Book Service",Toast.LENGTH_LONG).show();
            }
        });

        mMechanic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DashBoardActivity.this,"Mechanic",Toast.LENGTH_LONG).show();
            }
        });
    }
}