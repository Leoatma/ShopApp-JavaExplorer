/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package duke.choice;

/**
 *
 * @author leoatma
 */
public class ShopApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double tax = 1.2;
        int measurement = 3;
        double total = 0;

        final int numTeste = 20; // cria uma constante, cujo valor não pode ser alterado

        Customer c1 = new Customer();
        c1.name = "Pinky";
        c1.size = "S";

        System.out.println("The costumer's name is " + c1.name);

        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        

        Clothing[] items = {item1, item2, new Clothing(), new Clothing()};

        item1.description = "Blue Jacket";
        item1.price = 20.9;
        item1.size = "M";

        item2.description = "Orange T-Shirt";
        item2.price = 10.5;
        item2.size = "S";

        items[2].description = "Green Scarf";
        items[2].price = 5;
        items[2].size = "S";

        items[3].description = "Blue T-Shirt";
        items[3].price = 10.5;
        items[3].size = "S";

        // double totalItem1 = item1.price * tax;
        //double totalItem2 = item2.price * tax;
        //  System.out.println("The first item is a " + item1.description + " of '"
        //         + item1.size + "' size. It's price is $" + totalItem1 + ".");
        //  System.out.println("The second item is a " + item2.description + " of '"
        //        + item2.size + "' size. It's price is $" + totalItem2 + ".");
        switch (measurement) {
            case 1, 2, 3:
                c1.size = "S";
                break;
            case 4, 5, 6:
                c1.size = "M";
                break;
            case 7, 8, 9:
                c1.size = "L";
                break;
            default:
                c1.size = "X";
        }

        // Calculando o Total
        //  double total = totalItem1 + (2 * totalItem2);
        for (Clothing item : items) {
            if (c1.size == item.size) {
                System.out.println("Item " + item.description + ", it's price is $" + item.price + ".");
                total += item.price;
                if (total*tax > 15){break;}
            }
        }

        System.out.println("The total amount is $" + total + ".");

    }
}
