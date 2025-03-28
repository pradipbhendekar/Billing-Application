package Repository;

import java.util.ArrayList;

import Model.ProdModel;

public class ProductRepo implements ProductRepository{
	
	// create the ArrayList to Store the data 
	ArrayList al=new ArrayList();
	public boolean isAddNewProducts( ProdModel pm) {
		// add the data 
		al.add(pm);
		
		//check condition to check the data is null or not
		if(al!=null) {
			return true;
		}
		return false;
		
	}
	
public ArrayList getAllProducts() {
		
		return al;
	}
	
	public ProdModel getProductById(int id) {
		return null;
	}
	
	public int totalCount() {
		return 0;
	}

}
