package com.example.ahmadthariqsyauqi.score;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView skora;
    TextView skorb;
    TextView fta;
    TextView ftb;
    TextView duaa;
    TextView duab;
    TextView tigaa;
    TextView tigab;
    TextView hasil_akhir;
    int skorA=0;
    int skorB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        skora=(TextView)findViewById(R.id.skor_a);
        skorb=(TextView)findViewById(R.id.skor_b);
        fta=(Button)findViewById(R.id.ft_a);
        ftb=(Button)findViewById(R.id.ft_b);
        duaa=(Button)findViewById(R.id.dua_a);
        duab=(Button)findViewById(R.id.dua_b);
        tigaa=(Button)findViewById(R.id.tiga_a);
        tigab=(Button)findViewById(R.id.tiga_b);
        hasil_akhir=(Button)findViewById(R.id.hasil);
    }

    public void tampilSkorA(){skora.setText(skorA+"");
    }
    public void plus_ft_a(View v){
        skorA=skorA+1;
        tampilSkorA();
    }
    public void plus_dua_a(View v){
        skorA=skorA+2;
        tampilSkorA();
    }
    public void plus_tiga_a(View v){
        skorA=skorA+3;
        tampilSkorA();
    }

    public void tampilSkorB(){
        skorb.setText(skorB+"");
    }
    public void plus_ft_b(View v){
        skorB=skorB+1;
        tampilSkorB();
    }
    public void plus_dua_b(View v){
        skorB=skorB+2;
        tampilSkorB();
    }
    public void plus_tiga_b(View v){
        skorB=skorB+3;
        tampilSkorB();
    }


    public void tampil_hasil(View v){
        Intent i=new Intent(MainActivity.this,HasilActivity.class);
        i.putExtra("ScoreA",skorA);
        i.putExtra("ScoreB",skorB);
        startActivity(i);


    }
    public void ulangi(View v){
        skorA=0;
        skorB=0;
        tampilSkorA();
        tampilSkorB();
    }

}
