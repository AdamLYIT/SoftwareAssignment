package ie.lyit.testers;
import ie.lyit.flight.*;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class BookingTester {
	private Booking b1;
	private Flight fout = new Flight ("BR215","Derry", "Stanstead", 25, 12, 2018, 12, 40, 16.99);
	private Flight fin = new Flight ("BR216", "Stanstead", "Burnfoot", 26,12,2018,12,40,16.99);
	private ArrayList<Passenger> p = new ArrayList();
	private Passenger pass = new Passenger();
	private Passenger pass2 = new Passenger("mr", "derek", "dickson", 24,06,1985,2, false);
	Booking bewk;
	@Before
	public void setUp() throws Exception {
		p.add(pass);
		bewk = new Booking(fout, fin, p);
		b1 = new Booking();
	}

	@Test
	public void testToString() {
		assertEquals(b1.toString(), "OutBound Flight: " + null + " " + " Inbound Flight: " + null + " " + "Number of Passengers: " + p.size());
		
	}

	@Test 
	public void testBooking() {
		
		assertEquals(bewk.inbound, fin);
		assertEquals(bewk.outbound, fout);
		assertEquals(bewk.passengers, p);
		
		
	}

	@Test
	public void testFindPassenger() {
		assertEquals(bewk.findPassenger(pass), true);
		assertEquals(bewk.findPassenger(pass2), false);
	}

	@Test
	public void testCalculatePrice() {
		assertEquals(bewk.calculatePrice(), 0.0,0.0);
		
	}

	@Test
	public void testSetTotalPrice() {
		bewk.setTotalPrice(4);
		assertEquals(bewk.getTotalPrice(), 4,4);
	}

	@Test
	public void testGetTotalPrice() {
		assertEquals(bewk.getTotalPrice(), 0.0,0.0);
	}

}
