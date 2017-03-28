package Task1;

import Task1.Entity.Furniture;
import Task1.Entity.Toys;
import Task1.Entity.Food;
import Task1.Other.ProductionProduct;
import Task1.Validation.Country;

/**
 * Created by sodobescu on 3/28/2017.
 */
public class AppMain {

	public static void main(String args[]){

		ProductionProduct[] stuff =new ProductionProduct[5];
		stuff[0]= new Toys(new Country("Russia"),53.,3.3,2,54.5);
		stuff[1]= new Furniture(new Country("Canada"),53.,3.3,2,54.5);
		stuff[2]= new Food(new Country("Russia"),53.,3.3,2,54.5);
		stuff[3]= new Furniture(new Country("Cuba"),53.,3.3,2,54.5);
		stuff[4]= new Toys(new Country("Moldova"),53.,3.3,2,54.5);


	  for(int i=0;i<stuff.length;i++){
		  System.out.println("************************");
		  stuff[i].printInfo();

	  }

	}
}
