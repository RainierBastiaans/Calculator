package org.example;

public class Geometry {

    public int area(int length, int height){
        return length * height;
    }

    public int perimeter(int length, int height){
        return 2 * (length + height);
    }

    public boolean isTriangle(int a , int b, int c){
        if(a<b+c && b<a+c && c<a+b){
            return true;
        } else {
            return false;
        }
    }
}
