/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pattern.j2ee.BusinessDelegate;

/**
 *
 * @author djoshi
 */
public class BusinessLookUp {

    public BusinessService getBusinessService(String serviceType) {

        if (serviceType.equalsIgnoreCase("EJB")) {
            return new EJBService();
        } else {
            return new JMSService();
        }
    }
}
