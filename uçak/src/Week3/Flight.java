package Week3;

import java.util.Scanner;

public class Flight {

    static boolean[] seats;

    public static void createFlights() {

        BaseReservationSystem thyReservation = new THYReservationSystem(5);
        seats = new boolean[thyReservation.getSeatCount()];
        thyReservation.setSeats(seats);

        BaseReservationSystem pegasusReservation = new PegasusReservationSystem(4);
        seats = new boolean[pegasusReservation.getSeatCount()];
        pegasusReservation.setSeats(seats);

        while (true) {
            System.out.print("\n1 - THY     2 - Pegasus   0 - Çıkış\nRezervasyon yapmak istediğiniz hava yolunu seçiniz: ");
            Scanner scan = new Scanner(System.in);
            int choice = scan.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Sistemden çıkılıyor.");
                    return;
                case 1:
                    BaseReservationService thyReservationService = thyReservation;
                    thyReservationService.createReservation(thyReservation);
                    break;
                case 2:
                    BaseReservationService pegasusReservationService = pegasusReservation;
                    pegasusReservationService.createReservation(pegasusReservation);
                    break;
                default:
                    System.out.println("Yanlış seçim. Tekrar Deneyin");
            }
        }
    }
}
