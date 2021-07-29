package Week3;

import java.util.Random;
import java.util.Scanner;

public class PegasusReservationSystem extends BaseReservationSystem {

    public PegasusReservationSystem() {
    }

    public PegasusReservationSystem(int seatCount) {
        super(seatCount);
    }

    @Override
    public void createReservation(BaseReservationSystem reservation) {
        boolean[] seats = reservation.getSeats();

        if (reservation.planeIsFull(seats)) {
            System.out.println("\nUçakta boş yer bulunmamaktadır.");
            return;
        }

        System.out.println("\nLütfen bir seçim yapın.\n0 - Business Class     1 - Economy Class");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();

        switch (choice) {
            case 0:
                if (reservation.businessIsFull(seats)) {
                    System.out.println("\nBusiness Class'ta yer bulunmamaktadır.");
                    return;
                }
                System.out.println("\nBusiness Class'ta rezerve etmek istediğiniz koltuk numarasını giriniz: ");
                choice = scan.nextInt();
                if (choice <= 0 || choice > reservation.getBUSINESS_BOUNDARY()) {
                    System.out.println("\nYanlış seçim yaptınız. Lütfen tekrar deneyin");
                    createReservation(reservation);
                } else if (seats[choice - 1]) {
                    System.out.println("\nSeçmiş olduğunuz koltuk doludur. Lütfen tekrar deneyin.");
                    createReservation(reservation);
                } else {
                    seats[choice - 1] = true;
                    System.out.println("\n" + choice + " numaralı koltuk rezerve edildi.");
                }
                break;
            case 1:
                if (reservation.economyIsFull(seats)) {
                    System.out.println("\nEconomy Class'ta yer bulunmamaktadır.");
                    return;
                }
                Random random = new Random();
                int randomSeat = random.nextInt(reservation.getSeatCount() + 1);
                if (!seats[randomSeat]) {
                    seats[randomSeat] = true;
                    System.out.println("\n" + randomSeat + " numaralı koltuk rezerve edildi");
                }
                break;
            default:
                System.out.println("\nYanlış seçim yaptınız. Lütfen Tekrar Deneyin");
                createReservation(reservation);
        }

    }
}
