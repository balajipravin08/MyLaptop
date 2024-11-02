import src.*;	
import java.util.ArrayList;
import java.util.Scanner;

public class BusDemo {
    public static void main(String[] args) {
        ArrayList<Bus> buses = new ArrayList<Bus>();
        ArrayList<Booking> bookings = new ArrayList<Booking>();
        buses.add(new Bus(1, true, 2));
        buses.add(new Bus(2, true, 2));
        for (Bus bus : buses) {
            bus.display();
        }
        int userOption = 1;
        Scanner sc = new Scanner(System.in);
        while (userOption==1) {
            System.out.println("1 - to Book\n2 - Exit");
            userOption = sc.nextInt();
                if (userOption==1) {
                   Booking booking = new Booking();
                   if (booking.isAvailable(bookings,buses)) {
                        bookings.add(booking);
                        System.out.println("Your Booking is Confirmed");
                   }
                   else{
                        System.out.println("Sorry Bus is full Try another bus.");
                   }
                } 
        }
    }
}
