/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pattern.j2ee.FrontController;

/**
 *
 * @author djoshi
 */
public class FrontControllerPatternDemo {

    public static void main(String[] args) {

        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
    }
}
