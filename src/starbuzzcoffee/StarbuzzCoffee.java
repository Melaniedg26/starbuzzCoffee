/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starbuzzcoffee;
import starbuzzcoffee.Beverages.beverage;
import starbuzzcoffee.Beverages.darkRoast;
import starbuzzcoffee.condiment.chocolate;
/**
 *
 * @author melan
 */
public class StarbuzzCoffee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    beverage beverage1 = new darkRoast ("Dark Roast");
    beverage1=new chocolate("Dark Roast");
    System.out.println(beverage1.getDescription()+ " $" + beverage1.cost());
    }
    
}
