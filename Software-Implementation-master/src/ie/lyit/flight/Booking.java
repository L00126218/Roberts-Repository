//Robert Raduta - L00126218

package ie.lyit.flight;

import java.util.ArrayList;

public class Booking {
	private Flight outbound;
	private Flight inbound;
	private ArrayList<Passenger> passengers;
	private double totalPrice;
	private static int count;
	
	public Booking()
	{
		
	}
	
	public Booking(Flight outbound, Flight inbound,ArrayList<Passenger> passengers)
	{
		this.outbound = outbound;
		this.inbound = inbound;
		this.passengers = passengers;
		count++;
		
	}
	
	@Override
	public String toString()
	{
		return "Outbound flight: " + outbound + " inbound flight: " + inbound + " number of assengers on board: " + passengers.size() + " total price: " + totalPrice; 
	}
	
	@Override
	public boolean equals(Object obj)
	{
		Booking bObject;
		if (obj instanceof Booking)
		   bObject = (Booking)obj;
		else
		   return false;
		   
	    return(this.outbound==bObject.outbound && this.inbound==bObject.inbound && this.passengers==bObject.passengers);
	}
	
	public boolean findPassenger(Passenger p)
	{
		for(int i = 0; i<passengers.size(); i++)
		{
			if(p.equals(passengers.get(i)))
			{
				return true;
			}
			
			else
			{
				return false;
			}
			
			
		}
		 return false;
	}
	
	public double calculatePrice()
	{
		totalPrice = ((outbound.getPrice() + inbound.getPrice())*passengers.size());
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice)
	{
		
		 calculatePrice();
		 this.totalPrice = totalPrice;
	}
	
	public double getTotalPrice()
	{
		return totalPrice;
	}
	
	public void setOutbound(Flight outbound)
	{
		this.outbound = outbound;
	}
	
	public Flight getOutbound()
	{
		return outbound;
	}
	
	public void setInbound(Flight inbound)
	{
		this.inbound = inbound;
	}
	
	public Flight getInbound()
	{
		return inbound;
	}
	
	public ArrayList<Passenger> getPassengers()
	{
		
			return passengers;
		
	}
	
	public int getCount()
	{
		return count;
	}
	
}
