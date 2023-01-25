/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starbuzzcoffee.condiment;

/**
 *
 * @author melan
 */
public class milk extends condiment{

    public milk(String description) {
        super("Milk");
    }

    @Override
    public double cost() {
        return 3.00;
    }
    
}
