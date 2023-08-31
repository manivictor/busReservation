package busrev;
import java.util.Scanner;
import java.util.ArrayList;
public class BusDemo {

	public static void main(String[] args) {
		
		ArrayList<Bus> buses = new ArrayList<Bus>();
		ArrayList<Booking> bookings = new ArrayList<Booking>();
		
		buses.add(new Bus(1,true,2));
		buses.add(new Bus(2,false,50));
		buses.add(new Bus(3,true,48));
		
		int userOpt=1;
		Scanner scanner=new Scanner(System.in);
	
		for(Bus b:buses) {
			 b.displayBusInfo();
		}
		while (userOpt==1) {
		System.out.println("PEeSs 1 tO bOok aNd PrESs 2 eXit ");
		userOpt =scanner.nextInt();
		if(userOpt==1) {
			Booking booking =new Booking();
			if(booking.isAvailable(bookings,buses))
				bookings.add(booking);
			System.out.println("yoUr bOOkiNg Is cOnFiRmEd");
		}
		else
			System.out.println("sorry, bus is Full. try another bus or date");
		}

		}
  
	  }