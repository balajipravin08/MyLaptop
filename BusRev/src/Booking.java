package src;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Booking {
    String passenger;
    int busNo;
    Date date;

    public Booking(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a passenger name : ");
        passenger = sc.nextLine();
        System.out.println("Enter a bus no : ");
        busNo = sc.nextInt();
        System.out.println("Enter a date dd-mm-yyyy : ");
        String dateInput = sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy"); 
        try {
            date = sdf.parse(dateInput);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
        int capacity = 0 ;
        for (Bus bus : buses) {
            if (bus.getBusNo() == busNo) {
                capacity = bus.getCapacity();
            }
        }
        int booked = 0;
        for (Booking b : bookings) {
            if (b.busNo == busNo && b.date.equals(date)) {
                booked++;
            }
        }
        return booked < capacity ? true : false;
    }
}
