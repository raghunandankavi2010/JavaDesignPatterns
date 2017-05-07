/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadesignpatterns.DuckExample.main;

import javadesignpatterns.DuckExample.quackbehaviors.Quack;
import javadesignpatterns.DuckExample.flybeahviors.FlywithWings;

/**
 *
 * @author raghu
 */
public class MallardDuck extends Duck{

    public MallardDuck() {
        
        flyBehavior = new FlywithWings();
        quackBehavior = new Quack();
    }

    
    
    @Override
    public void display() {
        System .out.println(" I am a real Mallard duck");
    }
    
}
