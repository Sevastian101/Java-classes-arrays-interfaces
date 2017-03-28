package Task1.Entity;

import Task1.Validation.Country;

/**
 * Created by sodobescu on 3/28/2017.
 */
public class Food extends Task1.Other.Product implements Task1.Other.ProductionProduct {
	private final String type = "Food";


	public Food(Country countryToDeliver, double deliveryPrice, double weight, int count, double price) {
		super(countryToDeliver, deliveryPrice,  weight, count, price);
	}

	public void printInfo() {

		System.out.println("Food:");
		System.out.println("Price:"+getPrice());
		System.out.println("Country to deliver:"+getCountryToDeliver().getName());
		System.out.println("Count:"+getCount());
		System.out.println("Weight:"+getWeight());
		System.out.println("Delivery Price:"+getDeliveryPrice());
		System.out.println("Status:"+getStatus());
		System.out.println("Supported:"+canBeDelivered());
	}
}
