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
public class Square implements Shape {
    
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}