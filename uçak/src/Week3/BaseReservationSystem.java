package Week3;

public abstract class BaseReservationSystem implements BaseReservationService {

    private int seatCount;
    private boolean[] seats;
    private final int BUSINESS_BOUNDARY = 5;

    public BaseReservationSystem() {
    }

    public BaseReservationSystem(int seatCount) {
        setSeatCount(seatCount);
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        if (seatCount < 10) {
            seatCount = 10;
        }
        this.seatCount = seatCount;
    }

    public boolean[] getSeats() {
        return seats;
    }

    public void setSeats(boolean[] seats) {
        this.seats = seats;
    }

    public int getBUSINESS_BOUNDARY() {
        return BUSINESS_BOUNDARY;
    }

    public boolean economyIsFull(boolean[] seats) {
        for (int i = BUSINESS_BOUNDARY - 1; i < seats.length; i++) {
            if (!seats[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean businessIsFull(boolean[] seats) {
        for (int i = 0; i < BUSINESS_BOUNDARY; i++) {
            if (!seats[i]) {
                return false;
            }
        }
        return true;

    }

    public boolean planeIsFull(boolean[] seats) {
        for (int i = 0; i < seats.length; i++) {
            if (!seats[i]) {
                return false;
            }
        }
        return true;
    }

}