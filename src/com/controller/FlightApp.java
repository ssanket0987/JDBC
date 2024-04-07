package com.controller;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import com.dao.FlightServiceImpl;
import com.model.Flight;
import com.Services.FlightService;

public class FlightApp 

{

	public static void main(String args[]) throws ParseException
	{

		FlightService service = new FlightServiceImpl();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Unique flight id :");
		int fId = sc.nextInt();

		System.out.println("Enter the flight bus type :");
		String fBus = sc.next();

		System.out.println("Enter Price of the flight:");
		double fPrice = sc.nextDouble();

		System.out.println("Enter Flight source :");
		String src = sc.next();

		System.out.println("Enter the flight destination :");
		String dest = sc.next();

		System.out.println("Enter fly date:");
		String fDate1 = sc.next();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date flyDate = sdf.parse(fDate1);

		Flight flight = new Flight(fId, fBus, fPrice, src, dest, flyDate);

		System.out.println(flight);

		Flight fObj = service.addFlight(flight);
		if (fObj != null) 
		{
			System.out.println("data has been inserted");
		}
		else
		{
			System.out.println("NOt able to store the data");
		}
		try {
			service.getAllFlight().forEach(f->System.out.println(f));
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
