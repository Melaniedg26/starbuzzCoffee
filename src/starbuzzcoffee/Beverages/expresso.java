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
public class expresso extends beverage{

    public expresso() {
        description="Expresso";
    }


    @Override
    public double cost() {
        return 15.99;
    }
    
}
