package Week2.CinemaTicket;

import java.util.Scanner;

public class TicketSales {
    public static void calculate(Customer customer) {
        double amount;
        if (customer.age < 18) {
            amount = customer.selectedMovie.price - customer.selectedMovie.price * 0.1;
        } else if (customer.age < 25) {
            amount = customer.selectedMovie.price - customer.selectedMovie.price * 0.05;
        } else {
            amount = customer.selectedMovie.price;
        }
        if (customer.selectedMovie.kind.equals("Horror")) {
            amount = amount - amount * 0.1;
        }
        System.out.println("Ödenecek toplam tutar: " + amount + " TL");
    }

}
