/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pattern.j2ee.InterceptingFilter;

/**
 *
 * @author djoshi
 */
public class Target {

    public void execute(String request) {
        System.out.println("Executing request: " + request);
    }
}
