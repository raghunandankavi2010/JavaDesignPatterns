/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadesignpatterns.DuckExample.main;

import javadesignpatterns.DuckExample.flybeahviors.FlyRocketPowered;

/**
 *
 * @author raghu
 * Strategy Pattern with Duck Example
 */
public class MiniDuckSimulator {
    
    public static void main(String[] args)
    {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        
        Duck model = new ModelDuck();
        /* Model Duck behavior is FlyNoway
           So calling performFly will print no fly
        */
        model.performFly();
        /* Model Duck behavior set via a setter
           Will print flying with rocket
        */
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
