/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pattern.j2ee.CompositeEntity;

/**
 *
 * @author djoshi
 */
public class Client {

    private CompositeEntity compositeEntity = new CompositeEntity();

    public void printData() {

        for (String data : compositeEntity.getData()) {
            System.out.println("Data: " + data);
        }
    }

    public void setData(String data1, String data2) {
        compositeEntity.setData(data1, data2);
    }
}
