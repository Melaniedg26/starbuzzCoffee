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
public class darkRoast extends beverage{

    public darkRoast(String description) {
        super("Dark Roast");
    }

    @Override
    public double cost() {
        return 15.99;
    }
    
}
