package Week3;

import java.util.Scanner;

public class THYReservationSystem extends BaseReservationSystem {
    public THYReservationSystem() {
    }

    public THYReservationSystem(int seatCount) {
        super(seatCount);
    }

    @Override
    public void createReservation(BaseReservationSystem reservation) {

        boolean[] seats = reservation.getSeats();

        if (reservation.planeIsFull(seats)) {
            System.out.println("\nUçakta boş yer bulunmamaktadır.");
            return;
        }

        System.out.print("\nİlk " + reservation.getBUSINESS_BOUNDARY() + " koltuk Business Class'tır. " +
                "Rezervasyon yapmak istediğiniz koltuk numarası giriniz: ");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();

        if (choice <= 0 || choice > reservation.getSeatCount()) {
            System.out.println("\nYanlış giriş yaptınız. Lütfen tekrar deneyin.");
            createReservation(reservation);
        } else if (choice <= reservation.getBUSINESS_BOUNDARY()) {
            if (reservation.businessIsFull(seats)) {
                System.out.println("\nBusiness Class'ta yer bulunmamaktadır.");
                return;
            }
            if (seats[choice - 1]) {
                System.out.println("\nSeçmiş olduğunuz koltuk doludur. Lütfen tekrar deneyin.");
                createReservation(reservation);
            } else {
                seats[choice - 1] = true;
                System.out.println("\n" + choice + " numaralı koltuk rezerve edildi.");
            }
        } else {
            if (reservation.economyIsFull(seats)) {
                System.out.println("\nEkonomi Class'ta yer bulunmamaktadır.");
                return;
            }
            if (seats[choice - 1]) {
                System.out.println("\nSeçmiş olduğunuz koltuk doludur. Lütfen tekrar deneyin.");
                createReservation(reservation);
            } else {
                seats[choice - 1] = true;
                System.out.println("\n" + choice + " numaralı koltuk rezerve edildi.");
            }
        }

    }
}
