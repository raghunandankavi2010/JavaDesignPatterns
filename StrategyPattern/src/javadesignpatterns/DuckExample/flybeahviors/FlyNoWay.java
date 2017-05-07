/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadesignpatterns.DuckExample.flybeahviors;

import javadesignpatterns.DuckExample.flybeahviors.FlyBehavior;

/**
 *
 * @author raghu
 */
public class FlyNoWay implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I can't flying ");
    }
    
}
