/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Masodik;

import Elso.*;
import java.util.Date;

/**
 *
 * @author pappg
 */
public class GeometricShape {
    
    private String color;
    private boolean filled;
    Date dateCreated;

    public GeometricShape() {
        this.color="white";
        this.filled=false;
    }

    public GeometricShape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.dateCreated=new Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "GeometricShape{" + "color=" + color + ", filled=" + filled + ", dateCreated=" + dateCreated + '}';
    }
    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof GeometricShape))
            return false;
       
        GeometricShape v = (GeometricShape) obj;
       
        return v.getColor().equals(this.color) && v.getDateCreated().equals(this.dateCreated);
    }
    
    
    
    
    
}
