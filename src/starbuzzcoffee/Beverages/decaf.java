/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starbuzzcoffee.Beverages;

import starbuzzcoffee.Beverages.beverage;

/**
 *
 * @author melan
 */
public class decaf extends beverage {

    public decaf() {
        description="Decaf";
    }

    @Override
    public double cost() {
        return 11.99;
    }
    
    
}
