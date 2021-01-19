package co.edu.unipiloto.lab4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_1= (Button) findViewById(R.id.btn_1);
        Button btn_2= (Button) findViewById(R.id.btn_2);
        Button btn_3= (Button) findViewById(R.id.btn_3);
        Button btn_4= (Button) findViewById(R.id.btn_4);
        Button btn_5= (Button) findViewById(R.id.btn_5);
        Button btn_6= (Button) findViewById(R.id.btn_6);
        Button btn_7= (Button) findViewById(R.id.btn_7);
        Button btn_8= (Button) findViewById(R.id.btn_8);
        Button btn_9= (Button) findViewById(R.id.btn_9);
        Button btn_10= (Button) findViewById(R.id.bnt_10);

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent actividad = new Intent(MainActivity.this, eje1.class);
                startActivity(actividad);
            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent actividad = new Intent(MainActivity.this, eje2.class);
                startActivity(actividad);
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent actividad = new Intent(MainActivity.this, eje3.class);
                startActivity(actividad);
            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent actividad = new Intent(MainActivity.this, eje4.class);
                startActivity(actividad);
            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent actividad = new Intent(MainActivity.this, eje5.class);
                startActivity(actividad);
            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent actividad = new Intent(MainActivity.this, eje6.class);
                startActivity(actividad);
            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent actividad = new Intent(MainActivity.this, eje7.class);
                startActivity(actividad);
            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent actividad = new Intent(MainActivity.this, eje8.class);
                startActivity(actividad);
            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent actividad = new Intent(MainActivity.this, eje9.class);
                startActivity(actividad);
            }
        });
        btn_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent actividad = new Intent(MainActivity.this, eje10.class);
                startActivity(actividad);
            }
        });




    }
}