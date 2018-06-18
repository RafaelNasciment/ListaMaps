package com.example.carleanesousa.atividadecasa2monier;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView img_user;
    ImageView img_user1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img_user1=(ImageView) findViewById(R.id.image1);

        img_user=(ImageView) findViewById(R.id.image2);

        img_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("geo:-6.340129, -47.394309"));
                Intent chooser = Intent.createChooser(i, "Launch Maps");
                startActivity(chooser);
            }

        });
        img_user1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,ListaDePessoas.class);
                startActivity(i);
            }

        });
        }

    }


