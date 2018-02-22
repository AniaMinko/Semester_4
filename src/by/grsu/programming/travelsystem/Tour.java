package by.grsu.programming.travelsystem;

public class Tour {
	private NameOfTour kindOfTour;
	private Double price;
	private TypeOfTour type;

	public Tour(NameOfTour kindOfTour, Double price, TypeOfTour type) {
		this.kindOfTour = kindOfTour;
		this.price = price;
		this.type=type;
	}

	public NameOfTour getKindOfTour() {
		return kindOfTour;
	}

	public void setKindOfTour(NameOfTour kindOfTour) {
		this.kindOfTour = kindOfTour;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public TypeOfTour getType() {
		return type;
	}

	public void setTypeOfTour(TypeOfTour type){
		this.type=type;
	}
	
	public boolean isBurning(){
		if(getType().equals(TypeOfTour.BURNING_TOUR)){
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return  kindOfTour + " " + price + " " + type;
	}
}
