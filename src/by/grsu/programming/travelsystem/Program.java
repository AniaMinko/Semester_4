package by.grsu.programming.travelsystem;

public class Program {

	public static void main(String[] args) {
		Customer customer1 = new Customer("Anna", "Minko", "anna@gmail.com", TypeOfCustomer.REGULAR, 500.0);
		Tour tour1 = new Tour(NameOfTour.EXCURSION, 250.50, TypeOfTour.NOT_BURNING_TOUR);
		Tour tour2 = new Tour(NameOfTour.RECREATION, 300.35, TypeOfTour.BURNING_TOUR);
        TravelAgent agent1= new TravelAgent("Petr","Petrov");
        
        customer1.payTour(tour1);
        
        agent1.determineDiscount(customer1);
        agent1.determineTour(tour1);
        agent1.determineTour(tour2);
        
       
	}

}
