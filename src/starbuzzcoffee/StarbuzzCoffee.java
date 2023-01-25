/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starbuzzcoffee;
import starbuzzcoffee.Beverages.beverage;
import starbuzzcoffee.Beverages.darkRoast;
import starbuzzcoffee.condiment.brownSugar;
import starbuzzcoffee.condiment.chocolate;
import starbuzzcoffee.condiment.soy;
import starbuzzcoffee.condiment.whippedCream;
/**
 *
 * @author melan
 */
public class StarbuzzCoffee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    beverage beverage1 = new darkRoast();
    beverage1 = new brownSugar(beverage1);
    beverage1= new brownSugar(beverage1);
    System.out.println("Su pedido es: " +beverage1.getDescription());
    System.out.printf("Total: %.2f", beverage1.cost()); 
    }
    
}
