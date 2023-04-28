/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duke.choice;

/**
 *
 * @author leoatma
 */
public class Customer {

    public String name;
    private String size;
    public Clothing[] items;

    public Customer(String newName, int measurement) {
        this.name = newName;
        setSize(measurement);
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param newName the name to set
     */
    public void setName(String newName) {
        this.name = newName;
    }

    /**
     * s
     *
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

    public void setSize(int measurement) {

        switch (measurement) {
            case 1, 2, 3 -> this.size = "S";
            case 4, 5, 6 -> this.size = "M";
            case 7, 8, 9 -> this.size = "L";
            default -> this.size = "XL";
        }
    }

    public void addItems(Clothing[] newItems) {
        this.items = newItems;
    }

    public Clothing[] getItems() {
        return items;
    }

    public double getTotalClothingCost() {

    double total = 0.0;
        // Calculando o Total
        for (Clothing item : items) {
            if (this.getSize().equals(item.getSize())) {
                total += item.getPrice();
            }
        }
        return total;
    }
}
