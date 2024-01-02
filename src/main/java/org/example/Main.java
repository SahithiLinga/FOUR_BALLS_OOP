package org.example;

import processing.core.PApplet;
public class Main extends PApplet {

    public static final int WIDTH = 700;
    public static final int HEIGHT = 500;
    public static final int DIAMETER = 12;
    public static void main(String[] args) {
        PApplet.main("org.example.Main",args);
    }
    int Total_Balls=4;
    Balls[] ball = new Balls[Total_Balls];
    public class Balls{
        int x;
        int diameter;
        int height;
        Balls(int x,int height,int diameter){
            this.x=x;
            this.diameter=diameter;
            this.height=height;
        }
        void display(int speed){
            ellipse(x,height,diameter,diameter);
            x=x+speed;
        }
    }
    @Override
    public void settings(){
        super.settings();
        size(WIDTH,HEIGHT);
    }
    @Override
    public void setup(){
        for(int i=0;i<Total_Balls;i++){
            ball[i] = new Balls(0, (HEIGHT/5)*(i+1),DIAMETER);
        }

    }
    public void draw(){
        for(int i=0;i<Total_Balls;i++){
            ball[i].display(i+1);
        }

    }

}