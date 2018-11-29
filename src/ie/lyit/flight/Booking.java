package ie.lyit.flight;

import java.util.*;

public class Booking extends Flight{
	public Flight outbound ;
	public Flight inbound;
	public ArrayList<Passenger> passengers = new ArrayList();
	private double totalPrice = 0;
	private static int count;
	Flight flight = new Flight();
	
	public Booking()
	{
		Passenger pass = new Passenger();
		passengers.add(pass);
		count ++;
	}
	
	public Booking(Flight oF, Flight iF, ArrayList<Passenger> p)
	{
		
		outbound = oF;
		inbound = iF;
		Passenger pass = new Passenger();
		passengers.add(pass);
		count ++;
	}
	
	@Override
	public String toString()
	{
		return "OutBound Flight: " + outbound + " " + " Inbound Flight: " + inbound + " " + "Number of Passengers: " + passengers.size();
	}
	
	public boolean findPassenger(Passenger p)
	{
		for(int i =0; i< passengers.size(); i++)
		{
			if(passengers.get(i).equals(p))
			{
				return true;
			}
			
		}
		return false;
	}
	public double calculatePrice()
	{
		double price;
		price = flight.getPrice();
		totalPrice = price * passengers.size();
		return totalPrice;
		
	}
	
	//set and get methods
	public void setTotalPrice(double input)
	{
		totalPrice = input;
	}
	public double getTotalPrice()
	{
		return totalPrice;
	}
}
