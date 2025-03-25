package Repository;

import java.util.ArrayList;

import Model.ProdModel;

public interface ProductRepository {
	
	//defind method to add a new product 
		public boolean isAddNewProducts( ProdModel pm);
		
		//Define method to dispaly all the product
		public ArrayList getAllProducts();
		
		//Define this method to search the product using the id of the product
		public ProdModel getProductById(int id);
		
		//Define method to count the product
		
		public int totalCount();

}
