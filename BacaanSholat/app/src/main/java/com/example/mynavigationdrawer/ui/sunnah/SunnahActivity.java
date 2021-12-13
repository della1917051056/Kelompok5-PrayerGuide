package com.example.mynavigationdrawer.ui.sunnah;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mynavigationdrawer.R;

public class SunnahActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnMoveActivity;
    private Button btnMoveQDzuhur;
    private Button btnMoveQAshar;
    private Button btnMoveQMaghrib;
    private Button btnMoveQIsya;
    private Button btnMoveBDzuhur;
    private Button btnMoveBMaghrib;
    private Button btnMoveBIsya;
    private Button btnMoveDhuha;
    private Button btnMoveTahajud;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sunnah);
        btnMoveActivity = (Button)findViewById(R.id.btn_move_qsubuh);
        btnMoveActivity.setOnClickListener(this);
        btnMoveQDzuhur = (Button)findViewById(R.id.btn_move_qdzuhur);
        btnMoveQDzuhur.setOnClickListener(this);
        btnMoveQAshar = (Button)findViewById(R.id.btn_move_qashar);
        btnMoveQAshar.setOnClickListener(this);
        btnMoveQMaghrib = (Button)findViewById(R.id.btn_move_qmaghrib);
        btnMoveQMaghrib.setOnClickListener(this);
        btnMoveQIsya = (Button)findViewById(R.id.btn_move_qisya);
        btnMoveQIsya.setOnClickListener(this);
        btnMoveBDzuhur = (Button)findViewById(R.id.btn_move_bdzuhur);
        btnMoveBDzuhur.setOnClickListener(this);
        btnMoveBMaghrib = (Button)findViewById(R.id.btn_move_bmaghrib);
        btnMoveBMaghrib.setOnClickListener(this);
        btnMoveBIsya = (Button)findViewById(R.id.btn_move_bisya);
        btnMoveBIsya.setOnClickListener(this);
        btnMoveDhuha = (Button)findViewById(R.id.btn_move_dhuha);
        btnMoveDhuha.setOnClickListener(this);
        btnMoveTahajud = (Button)findViewById(R.id.btn_move_tahajud);
        btnMoveTahajud.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_move_qsubuh:
                Intent moveIntent = new Intent(SunnahActivity.this, MoveQsubuh.class);
                startActivity(moveIntent);
                break;
            case R.id.btn_move_qdzuhur:
                Intent moveQdzuhur = new Intent(SunnahActivity.this, MoveQdzuhur.class);
                startActivity(moveQdzuhur);
                break;
            case R.id.btn_move_qashar:
                Intent moveQashar = new Intent(SunnahActivity.this, MoveQashar.class);
                startActivity(moveQashar);
                break;
            case R.id.btn_move_qmaghrib:
                Intent moveQmaghrib = new Intent(SunnahActivity.this, MoveQmaghrib.class);
                startActivity(moveQmaghrib);
                break;
            case R.id.btn_move_qisya:
                Intent moveQisya = new Intent(SunnahActivity.this, MoveQisya.class);
                startActivity(moveQisya);
                break;
            case R.id.btn_move_bdzuhur:
                Intent moveBdzuhur = new Intent(SunnahActivity.this, MoveBdzuhur.class);
                startActivity(moveBdzuhur);
                break;
            case R.id.btn_move_bmaghrib:
                Intent moveBmaghrib = new Intent(SunnahActivity.this, MoveBmaghrib.class);
                startActivity(moveBmaghrib);
                break;
            case R.id.btn_move_bisya:
                Intent moveBisya = new Intent(SunnahActivity.this, MoveBisya.class);
                startActivity(moveBisya);
                break;
            case R.id.btn_move_dhuha:
                Intent moveDhuha = new Intent(SunnahActivity.this, MoveDhuha.class);
                startActivity(moveDhuha);
                break;
            case R.id.btn_move_tahajud:
                Intent moveTahajud = new Intent(SunnahActivity.this, MoveTahajud.class);
                startActivity(moveTahajud);
                break;
        }
    }
}