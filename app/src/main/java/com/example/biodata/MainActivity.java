package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    Button email, telp, map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.email);
        telp = findViewById(R.id.telp);
        map = findViewById(R.id.map);

        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mail = new Intent(Intent.ACTION_VIEW);
                Uri data = Uri.parse("mailto:?subject=" + ""+ "&body=" + "" + "&to=" + "fauzanyamani7@gmail.com");
                mail.setData(data);
                startActivity(Intent.createChooser(mail, "Send mail..."));
            }
        });

        telp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telpon = new Intent(Intent.ACTION_DIAL);
                telpon.setData(Uri.parse("tel:081235928086"));
                startActivity(telpon);
            }
        });

        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent peta = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("http://maps.google.com/maps?saddr=&daddr=-7.024745, 110.495554"));
                startActivity(peta);
            }
        });
    }
}