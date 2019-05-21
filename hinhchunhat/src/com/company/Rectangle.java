package com.company;

public class Rectangle {
    private double Width;
    private double height;

    public Rectangle(){

    }
    public Rectangle(double width,double height){
        this.Width=width;
        this.height=height;
    }
    public double getWidth(){
        return this.Width;
    }
    public void setWidth(double width){
        this.Width=width;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public double getArea(){
        return (this.Width*this.height);
    }
    public double getPerimeter(){
        return (this.Width+this.height)*2;
    }
    public String disPlay(){
        return "Retangle : width "+this.Width+", Height "+this.height;
    }

}
