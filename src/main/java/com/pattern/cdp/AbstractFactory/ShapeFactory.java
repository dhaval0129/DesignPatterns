/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pattern.cdp.AbstractFactory;

/**
 *
 * @author djoshi
 */
public class ShapeFactory extends AbstractFactory {
    
    //use getShape method to get object of type shape 
    @Override
    public Shape getShape(String shapeType){
        
        if(shapeType == null){
            return null;
        }
        
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        
        return null;
    }
    
    @Override
    Color getColor(String color) {
        return null;
    }
}
