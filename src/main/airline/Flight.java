package main.airline;

public class Flight {
    private final int maxSeatNumber = 10;
    private boolean[] seatState = new boolean[maxSeatNumber];

    public Flight() {
        for (int i=0; i<maxSeatNumber; i++) {
            seatState[i] = false;
        }
    }

    public boolean isSeatAvailable(int seatType)
    {
        boolean availability = false;
        if(seatType==1)
        {
            for(int i=0; i<5; i++)
            {
                if(!seatState[i]){
                    availability = true;
                    break;
                }
            }
        }
        else
        {
            for(int i=5; i<maxSeatNumber; i++)
            {
                if(!seatState[i]){
                    availability = true;
                    break;
                }
            }
        }

        return availability;
    }

    public int assignSeat(int seatType){
        int seatNumber = -1;
        if(seatType==1){
            for (int i=0; i<5; i++)
            {
                if(!seatState[i]){
                    seatState[i] = true;
                    seatNumber = i+1;
                    break;
                }
            }
        }
        else{
            for (int i=5; i<maxSeatNumber; i++)
            {
                if(!seatState[i]){
                    seatState[i] = true;
                    seatNumber = i+1;
                    break;
                }
            }
        }

        return seatNumber;
    }
}
