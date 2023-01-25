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
public class houseBlend extends beverage {
    
    public houseBlend(String description) {
        super("House Blend");
    }

    @Override
    public double cost() {
        return 19.99;
    }
    
    
    
}
