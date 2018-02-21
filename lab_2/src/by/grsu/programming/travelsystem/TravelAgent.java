package by.grsu.programming.travelsystem;

import java.util.Scanner;

public class TravelAgent extends APerson {
	private Tour tour;
	private Customer customer;
	private int discount;

	public TravelAgent(String name, String surname) {
		super(name, surname);

	}

	public Tour getTour() {
		return tour;
	}

	public void setTour(Tour tour) {
		this.tour = tour;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public int getDiscount(){
		return discount;
	}
	
	public void setDiscount(int discount){
		this.discount=discount;
	}
	
	public void determineTour(Tour tour){
		if(tour.isBurning()){
			System.out.println("Tour is burning");
		} else {
			System.out.println("Tour is not burning");
		}
	}
	
	public void determineDiscount(Customer customer){
		if(customer.isRegular()){
		System.out.println("determine the discount amount");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		setDiscount(num);
		}
	}
}
