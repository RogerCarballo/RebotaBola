package com.example.tnb_20.rebotabolas;

import android.widget.ImageView;

public class Bola {
    private float posX;
    private float posY;
    private float velX;
    private float velY;
    private float height;
    private float width;


    public Bola(float posX, float posY, float velX, float velY, float height, float width) {

        this.posX = posX;
        this.posY = posY;
        this.velX = velX;
        this.velY = velY;
        this.height = height;
        this.width = width;

    }

    public float getPosX() {
        return posX;
    }

    public void setPosX(float posX) {
        this.posX = posX;
    }

    public float getPosY() {
        return posY;
    }

    public void setPosY(float posY) {
        this.posY = posY;
    }

    public float getVelX() {
        return velX;
    }

    public void setVelX(float velX) {
        this.velX = velX;
    }

    public float getVelY() {
        return velY;
    }

    public void setVelY(float velY) {
        this.velY = velY;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }
}
