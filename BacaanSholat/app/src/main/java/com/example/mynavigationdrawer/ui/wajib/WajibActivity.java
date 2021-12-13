package com.example.mynavigationdrawer.ui.wajib;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.navigation.ui.AppBarConfiguration;

import com.example.mynavigationdrawer.R;

public class WajibActivity extends AppCompatActivity implements View.OnClickListener{

    private CardView cardView1, cardView2, cardView3, cardView4, cardView5;
    private AppBarConfiguration appBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wajib);
        cardView1 =  (CardView) findViewById(R.id.card_view1);
        cardView2 =  (CardView) findViewById(R.id.card_view2);
        cardView3 =  (CardView) findViewById(R.id.card_view3);
        cardView4 =  (CardView) findViewById(R.id.card_view4);
        cardView5 =  (CardView) findViewById(R.id.card_view5);


        cardView1.setOnClickListener(this);
        cardView2.setOnClickListener(this);
        cardView3.setOnClickListener(this);
        cardView4.setOnClickListener(this);
        cardView5.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch(view.getId()){
            case R.id.card_view1:
                i=new Intent(WajibActivity.this, IsyaActivity.class);
                startActivity(i);
                break;
            case R.id.card_view2:
                i=new Intent(WajibActivity.this, SubuhActivity.class);
                startActivity(i);
                break;
            case R.id.card_view3:
                i=new Intent(WajibActivity.this, DzuhurActivity.class);
                startActivity(i);
                break;
            case R.id.card_view4:
                i=new Intent(WajibActivity.this, AsharActivity.class);
                startActivity(i);
                break;
            case R.id.card_view5:
                i=new Intent(WajibActivity.this, MaghribActivity.class);
                startActivity(i);
                break;
            default:
                break;
        }
    }


}