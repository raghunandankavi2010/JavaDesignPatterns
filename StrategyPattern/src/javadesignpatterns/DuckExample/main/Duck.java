/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadesignpatterns.DuckExample.main;

import javadesignpatterns.DuckExample.quackbehaviors.QuackBehavior;
import javadesignpatterns.DuckExample.flybeahviors.FlyBehavior;

/**
 *
 * @author raghu
 */
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }
    
     public void performQuack() {
        quackBehavior.quack();
    }
     
     public void swim () {
     
         System.out.println("All Duck float, even decoys");
     }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
     
     
}
