package Task1.Validation;

import java.util.ArrayList;

/**
 * Created by sodobescu on 3/28/2017.
 */
public class CountrySupport {
	private ArrayList<Country> supportedCountries;
	private  ArrayList<Country> unsupportedCountries;

	public CountrySupport() {
		supportedCountries=new ArrayList<>();
		unsupportedCountries=new ArrayList<>();
		this.supportedCountries.add(new Country("Russia"));
		this.supportedCountries.add(new Country("Canada"));
		this.supportedCountries.add(new Country("China"));
		this.supportedCountries.add(new Country("United States"));
		this.supportedCountries.add(new Country("Brazil"));
		this.supportedCountries.add(new Country("Moldova"));
		this.supportedCountries.add(new Country("Romania"));
		this.supportedCountries.add(new Country("Great Britaine"));

		this.unsupportedCountries.add(new Country("Australia"));
		this.unsupportedCountries.add(new Country("Sudan"));
		this.unsupportedCountries.add(new Country("Sudan"));
		this.unsupportedCountries.add(new Country("Kazakhstan"));
		this.unsupportedCountries.add(new Country("India"));
		this.unsupportedCountries.add(new Country("Argentina"));

	}

	public ArrayList<Country> getSupportedCountries() {
		return supportedCountries;
	}

	public void setSupportedCountries(ArrayList<Country> supportedCountries) {
		this.supportedCountries = supportedCountries;
	}

	public ArrayList<Country> getUnsupportedCountries() {
		return unsupportedCountries;
	}

	public void setUnsupportedCountries(ArrayList<Country> unsupportedCountries) {
		this.unsupportedCountries = unsupportedCountries;
	}
}
