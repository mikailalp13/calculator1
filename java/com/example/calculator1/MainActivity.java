package com.example.calculator1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView sonuc, cozum;
    Button sil, pozitifnegatif, yuzde, bolme;
    Button yedi, sekiz, dokuz, carpma;
    Button dort, bes, alti, cikarma;
    Button bir, iki, uc, toplama;
    Button sifir, nokta, esit;

    boolean carp, bol, topla, cikar;

    float deger1, deger2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sonuc = findViewById(R.id.sonuc);
        cozum = findViewById(R.id.cozum);

        sil = findViewById(R.id.sil);
        pozitifnegatif = findViewById(R.id.pozitifnegatif);
        yuzde = findViewById(R.id.yuzde);
        bolme = findViewById(R.id.bolme);
        yedi = findViewById(R.id.yedi);
        sekiz = findViewById(R.id.sekiz);
        dokuz = findViewById(R.id.dokuz);
        carpma = findViewById(R.id.carpma);
        dort = findViewById(R.id.dort);
        bes = findViewById(R.id.bes);
        alti = findViewById(R.id.alti);
        cikarma = findViewById(R.id.cikarma);
        bir = findViewById(R.id.bir);
        iki = findViewById(R.id.iki);
        uc = findViewById(R.id.uc);
        toplama = findViewById(R.id.toplama);
        sifir = findViewById(R.id.sifir);
        nokta = findViewById(R.id.nokta);
        esit = findViewById(R.id.esit);

        bir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sonuc.getText().toString().equals("0")) {
                    sonuc.setText("1");
                } else {
                    sonuc.setText(sonuc.getText() + "1");
                }
                cozum.setText(sonuc.getText());
            }
        });

        iki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sonuc.getText().toString().equals("0")) {
                    sonuc.setText("2");
                } else {
                    sonuc.setText(sonuc.getText() + "2");
                }
                cozum.setText(sonuc.getText());
            }
        });

        uc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sonuc.getText().toString().equals("0")) {
                    sonuc.setText("3");
                } else {
                    sonuc.setText(sonuc.getText() + "3");
                }
                cozum.setText(sonuc.getText());
            }
        });

        dort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sonuc.getText().toString().equals("0")) {
                    sonuc.setText("4");
                } else {
                    sonuc.setText(sonuc.getText() + "4");
                }
                cozum.setText(sonuc.getText());
            }
        });

        bes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sonuc.getText().toString().equals("0")) {
                    sonuc.setText("5");
                } else {
                    sonuc.setText(sonuc.getText() + "5");
                }
                cozum.setText(sonuc.getText());
            }
        });

        alti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sonuc.getText().toString().equals("0")) {
                    sonuc.setText("6");
                } else {
                    sonuc.setText(sonuc.getText() + "6");
                }
                cozum.setText(sonuc.getText());
            }
        });

        yedi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sonuc.getText().toString().equals("0")) {
                    sonuc.setText("7");
                } else {
                    sonuc.setText(sonuc.getText() + "7");
                }
                cozum.setText(sonuc.getText());
            }
        });

        sekiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sonuc.getText().toString().equals("0")) {
                    sonuc.setText("8");
                } else {
                    sonuc.setText(sonuc.getText() + "8");
                }
                cozum.setText(sonuc.getText());
            }
        });

        dokuz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sonuc.getText().toString().equals("0")) {
                    sonuc.setText("9");
                } else {
                    sonuc.setText(sonuc.getText() + "9");
                }
                cozum.setText(sonuc.getText());
            }
        });

        sifir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonuc.setText(sonuc.getText() + "0");
                cozum.setText(sonuc.getText());
            }
        });
        nokta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonuc.setText(sonuc.getText() + ".");
                cozum.setText(sonuc.getText());
            }
        });
        sil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonuc.setText("");
                cozum.setText("");
            }
        });

        toplama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sonuc == null){
                    sonuc.setText("");
                }
                else{
                    deger1 = Float.parseFloat(sonuc.getText() + "");
                    topla = true;
                    sonuc.setText(null);
                }
            }
        });
        cikarma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deger1 = Float.parseFloat(sonuc.getText() + "");
                cikar = true;
                sonuc.setText(null);
            }
        });
        carpma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deger1 = Float.parseFloat(sonuc.getText() + "");
                carp = true;
                sonuc.setText(null);
            }
        });
        bolme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deger1 = Float.parseFloat(sonuc.getText() + "");
                bol = true;
                sonuc.setText(null);
            }
        });
        yuzde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float deger1 = Float.parseFloat(sonuc.getText().toString());
                if (deger1 != 0) {
                    float cevap = deger1 / 100;
                    sonuc.setText(String.valueOf(cevap));
                }
            }
        });
        pozitifnegatif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = sonuc.getText().toString();
                if (!currentText.isEmpty()) {
                    float number = Float.parseFloat(currentText);
                    number = -number;
                    sonuc.setText(String.valueOf(number));
                    cozum.setText(String.valueOf(number));
                }
            }
        });


        esit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deger2 = Float.parseFloat(sonuc.getText() + "");
                if(topla == true){
                    sonuc.setText(deger1 + deger2 +"");
                    cozum.setText(deger1 + " + " + deger2);
                    topla = false;
                }
                if(cikar == true){
                    sonuc.setText(deger1 - deger2 +"");
                    cozum.setText(deger1 + " - " + deger2);
                    cikar = false;
                }
                if(bol == true){
                    sonuc.setText(deger1 / deger2 +"");
                    cozum.setText(deger1 + " ÷ " + deger2);
                    bol = false;
                }
                if(carp == true){
                    sonuc.setText(deger1 * deger2 +"");
                    cozum.setText(deger1 + " X " + deger2);
                    carp = false;
                }

            }
        });

    }
}