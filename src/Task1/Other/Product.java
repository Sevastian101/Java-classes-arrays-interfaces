package Task1.Other;

import Task1.Validation.Country;
import Task1.Validation.CountrySupport;


/**
 * Created by sodobescu on 3/28/2017.
 */
public abstract class Product {
	private double price;
	private Task1.Validation.Country countryToDeliver;
	private int count;
	private double weight;
	private double deliveryPrice;
	private Status status=Status.NEW;

	public Product(Country countryToDeliver, double deliveryPrice, double weight, int count, double price) {
		this.countryToDeliver = countryToDeliver;
		this.deliveryPrice = deliveryPrice;
		this.weight = weight;
		this.count = count;
		this.price = price;
	}

	public boolean canBeDelivered(){


		if(new CountrySupport().getSupportedCountries().contains(getCountryToDeliver()))return true;
		return false;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Country getCountryToDeliver() {
		return countryToDeliver;
	}

	public void setCountryToDeliver(Country countryToDeliver) {
		this.countryToDeliver = countryToDeliver;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public double getDeliveryPrice() {
		return deliveryPrice;
	}

	public void setDeliveryPrice(double deliveryPrice) {
		this.deliveryPrice = deliveryPrice;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}


}
