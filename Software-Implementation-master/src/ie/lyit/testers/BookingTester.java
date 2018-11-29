//Robert Raduta - L00126218


package ie.lyit.testers;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import ie.lyit.flight.Booking;
import ie.lyit.flight.Flight;
import ie.lyit.flight.Passenger;

public class BookingTester {

	private Booking b1;	
	private Flight oF;
	private Flight iF;
	private ArrayList<Passenger> p;
	private double totalPrice;
	private static int count;
	
	@Before
	public void setUp() throws Exception {
		b1 = new Booking();
	}
	
	@Test
	public void testBooking() {
		
		// Constructor tester
		
		b1 = new Booking(oF, iF, p);
	    assertEquals(b1,  );
	    
	}
		
		// findPassenger() tester
		
		b1.findPassenger(p);
		
		// calculatePrice() tester
		b1.calculatePrice();
		
		// toString() tester
		
		public void testToString() {
			
		
		
		b1.toString();
		
		
		}
		
		// setTotalPrice() tester
		
		@Test
		public void testSetTotalPrice() {
		b1.setTotalPrice(450.00);
		assertEquals(b1.getTotalPrice(), 450.00, 0.00);
		}
		
		// setOutbound() tester
		
		b1.setOutbound(oF);
		
		// setInbound() tester
		
		b1.setInbound(iF);
		
		
		
		
		
		
		
	
}
