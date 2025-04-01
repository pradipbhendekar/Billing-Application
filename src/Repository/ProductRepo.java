package Repository;

import java.util.ArrayList;
import java.util.Iterator;

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
		//return the ArraylList all data to service class
		return al;
	}
	
	public ProdModel getProductById(int id) {
		ProdModel p = null;
		Iterator i=al.iterator();
		while(i.hasNext()) {
			Object obj=i.next();
			 p=(ProdModel)obj;
			if(p.equals(id)) {
				return p;
			}
		}
		return p;
	}
	
	public int totalCount() {
		int count=0;
		Iterator i=al.iterator();
		while(i.hasNext()) {
			Object obj=i.next();
			count++;
		}
		return count;
	}

}
