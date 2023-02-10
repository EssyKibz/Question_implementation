package com;

public class Rectangle implements Calculations{
    public float l;
    public float w;
    public Rectangle(float l, float w){
        this.l=l;
        this.w=w;
    }

    @Override
    public double getArea() {
        return(l*w);
    }
    public double getPerimeter(){
        return(2*(l+w));
    }
    public void showDetails(){
        System.out.println("Length: "+l+"\n Width: "+w +"\n Area: "+getArea()+"\n Perimeter: "+getPerimeter());
    }
}
