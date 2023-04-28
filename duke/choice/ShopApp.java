/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package duke.choice;

import java.util.Arrays;

import io.helidon.webserver.Routing;
import io.helidon.webserver.ServerConfiguration;
import io.helidon.webserver.WebServer;
import java.net.InetAddress;
import java.net.UnknownHostException;


/**
 * @author leoatma
 */
public class ShopApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Customer c1 = new Customer("Pinky", 5);

        System.out.println("The costumer's name is " + c1.getName() + " and his size is \"" + c1.getSize() + "\".");

        System.out.printf("Minimum price value = %.2f. \n", Clothing.MIN_PRICE);

        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-shirt", 10.5, "S");

        Clothing[] items = {item1, item2, new Clothing("Green Scarf", 5, "S"), new Clothing("Blue T-Shirt", 10.5, "S")};


        try {
            ItemList list = new ItemList(items);
            Routing routing = Routing.builder().get("/items", list).build();
            ServerConfiguration config = ServerConfiguration.builder().bindAddress(InetAddress.getLocalHost()).port(8888).build();
            WebServer ws = WebServer.create(config, routing);
            ws.start();
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }

        c1.addItems(items);

        // ordenando o array de items do cliente c1, a partir de sua descriçao (ver override em Clothing Comparable)
        Arrays.sort(c1.getItems());

        for (Clothing item : c1.getItems()) {
            System.out.println("Item: " + item);

        }

        System.out.println("Total is $" + c1.getTotalClothingCost());


        int amountPrice = 0;
        int counter = 0;
        for (Clothing item : c1.getItems()) {
            if (item.getSize().equals("L")) {
                counter++;
                amountPrice += item.getPrice();
            }
        }

        try {
            double averagePrice = (counter == 0) ? 0 : amountPrice / counter; // forma de evitar a geraçao da exceçao
            System.out.println("Average value = " + averagePrice);

        } catch (ArithmeticException e) {
            System.out.println("\nAverage Error: Don't divide by zero");
        }

    }

}
