package com.example.tnb_20.rebotabolas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.ImageView;


import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    private int width;
    private int height;
    private float inicioX,inicioY;
    int velocidadX,velocidadY;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DisplayMetrics display = this.getBaseContext().getResources().getDisplayMetrics();
        width = display.widthPixels;
        height = display.heightPixels;
        final ImageView bola = findViewById(R.id.imageView);
        inicioX = inicioY = 10;
        velocidadX = 50;
        velocidadY = 50;
        final Bola bolita = new Bola(inicioX,inicioY,velocidadX,velocidadY,bola.getWidth(),bola.getHeight());
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                if(!(inicioX >= width-bola.getWidth()) &&!(inicioX<=0)) {
                    inicioX += velocidadX;
                    inicioY += velocidadY;
                    bola.setX(inicioX);
                    bola.setY(inicioY);
                }else{
                    bola.setX(inicioX);
                    velocidadX = velocidadX * -1;
                    inicioX += velocidadX;
                }
                if(!(inicioY >= height-bola.getHeight()) &&!(inicioY<=0)) {
                    inicioX += velocidadX;
                    inicioY += velocidadY;
                    bola.setX(inicioX);
                    bola.setY(inicioY);
                }else{
                    velocidadY = velocidadY * -1;
                    inicioY += velocidadY;

                }
            }
        };
        Timer t = new Timer();
        t.schedule(tt,100,30);






    }
}