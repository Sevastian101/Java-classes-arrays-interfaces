package Task1.Validation;

/**
 * Created by sodobescu on 3/28/2017.
 */
public class Country {

	private String name;
	private int taxFee;

	public Country(String name) {
		this.name=name;
		this.taxFee=100;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Country && this.name.equals(((Country) obj).name)) return true;
		else return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTaxFee() {
		return taxFee;
	}

	public void setTaxFee(int taxFee) {
		this.taxFee = taxFee;
	}
}
