/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadesignpatterns.DuckExample.quackbehaviors;

import javadesignpatterns.DuckExample.quackbehaviors.QuackBehavior;

/**
 *
 * @author raghu
 */
public class Squeak implements QuackBehavior{
    
    @Override
    public void quack() {
       System.out.println("Squeak");
    }
    
}
