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
public class milk extends condiment{

    public milk(beverage beverage) {
		this.beverage = beverage;
	}
    
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";

    }

    @Override
    public double cost() {
    double cost = beverage.cost();
    return cost + 3.00;
    }

    
}
