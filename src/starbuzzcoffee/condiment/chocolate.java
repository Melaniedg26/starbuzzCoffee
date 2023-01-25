/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starbuzzcoffee.condiment;

import starbuzzcoffee.Beverages.beverage;

/**
 *
 * @author melan
 */
public class chocolate extends condiment{

    public chocolate(Beverage beverage) {
        this.beverage= beverage;
    }

    @Override
    public double cost() {
        
		return 5.00;
    }
    
}
