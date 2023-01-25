/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starbuzzcoffee.Beverages;

/**
 *
 * @author melan
 */
public abstract class beverage {
    private String description;

    public beverage(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

  public abstract double cost();
    
}
