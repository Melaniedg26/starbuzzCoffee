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
public class whippedCream extends condiment{

    public whippedCream(String description) {
        super("Whipped Cream");
    }

    @Override
    public double cost() {
        return 5.00;
    }
    
}
