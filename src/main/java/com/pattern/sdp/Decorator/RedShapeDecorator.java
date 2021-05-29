/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pattern.sdp.Decorator;

/**
 *
 * @author djoshi
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    /**
     * 
     * @param decoratedShape 
     */
    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }
}
