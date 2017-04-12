package com.german.cube.model;

/**
 * Created by gvalenncia on 4/11/17.
 */
public class Block{

    private int x;
    private int y;
    private int z;
    private int w = 0;

    public Block(){}

    public Block(int x, int y, int z, int weigth){
        this.setX(x);
        this.setY(y);
        this.setZ(z);
        this.setW(weigth);
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }
}
