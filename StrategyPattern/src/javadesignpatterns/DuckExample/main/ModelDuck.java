/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadesignpatterns.DuckExample.main;

import javadesignpatterns.DuckExample.quackbehaviors.Quack;
import javadesignpatterns.DuckExample.flybeahviors.FlyNoWay;

/**
 *
 * @author raghu
 */
public class ModelDuck extends Duck {
    
      public ModelDuck() {
        
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }


    @Override
    public void display() {
       
    }
    
}
