/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duke.choice;

/**
 *
 * @author leoatma
 */
public class Clothing implements Comparable<Clothing> {

    private String description; 
    private String size;
    private double price;
    
    public final static double MIN_PRICE = 10.0;
    public final static double TAX_RATE = 0.2;

    public Clothing(String newDescription, double newPrice, String newSize) {
        this.description = newDescription;
        this.price = newPrice;
        this.size = newSize;
    }
    @Override
    public String toString() {
        return getDescription() + ", U$" + getPrice() + ", Size: " + getSize();
    }

    @Override
    public int compareTo(Clothing clothing) {
        return this.description.compareTo(clothing.description);
    }

    /**
     * @return the description
     */
    
    public String getDescription() {
        return description;
    }

    /**
     * @param newDescription the description to set
     */
    public void setDescription(String newDescription) {
        this.description = newDescription;
    }

    /**
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * @param newSize the size to set
     */
    public void setSize(String newSize) {
        this.size = newSize;
    }

    /**
     * @return the price with tax 
     */
    public double getPrice() {
       return price + (price * TAX_RATE);
    }

    /**
     * @param newPrice the price to set
     */
    public void setPrice(double newPrice) {
        this.price = (newPrice > MIN_PRICE) ? newPrice : MIN_PRICE;
    }
    
}

