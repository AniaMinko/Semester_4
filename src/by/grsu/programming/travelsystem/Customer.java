package by.grsu.programming.travelsystem;


public class Customer extends APerson {
	private Tour tour;
	private String eMail;
	private TypeOfCustomer type;
	private Double score;

	public Customer(String name, String surname, String eMail, TypeOfCustomer type, Double score) {
		super(name, surname);
		this.eMail = eMail;
		this.type=type;
		this.score=score;
	}

	public Tour getTour() {
		return tour;
	}

	public void setTour(Tour tour) {
		this.tour = tour;
	}

	public String getEMail() {
		return eMail;
	}

	public void setEMail(String eMail) {
		this.eMail = eMail;
	}

	public TypeOfCustomer getType() {
		return type;
	}

	public void setType(TypeOfCustomer type) {
		this.type = type;
	}
	
	public Double getScore(){
		return score;
	}
	
	public void setScore(Double score){
		this.score=score;
	}

	public boolean isRegular() {
		if (getType().equals(TypeOfCustomer.REGULAR)) {
			return true;
		} else {
			return false;
		}
	}
	
	public void payTour(Tour tour){
		System.out.println("The price for tour is: " + tour.getPrice());
		if(tour.getPrice()>getScore()){
			System.out.println("You can't pay the tour, because your score is: " + getScore());
		}else{
			System.out.println("The tour paid");
		}
		
	}

	
}
