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
public class soy extends condiment{

    public soy(String description) {
        super("Soy");
    }

    @Override
    public double cost() {
        return 5.00;
    }
    
}
