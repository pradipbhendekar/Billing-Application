package Services;

import java.util.ArrayList;
import java.util.Iterator;

import Model.ProdModel;
import Repository.ProductRepo;

public class ProduServieces implements ProductServices{
	
	//create the object of the repositry class 
	ProductRepo productRepo=new ProductRepo();
	
	//define the method to add the new priduct
	public boolean isAddNewProducts(ProdModel pm) {
		boolean add=productRepo.isAddNewProducts(pm);
		if(add==true) {
			return true;
		}else
			return false;
			
	}
	
	public ArrayList getAllProducts() {
		//get the all data form the service production class and transfer to the main class
		ArrayList al=productRepo.getAllProducts();
		 Iterator i=al.iterator();
		 if(i.hasNext()) {
			 return al;
		 }
		 else {
			return  null;
		 }
	}
	
	public ProdModel getProductById(int id) {
		ProdModel pm=productRepo.getProductById(id);
		 return pm;
	}
	
	public int totalCount() {
		int count=productRepo.totalCount();
		return count;
	}

}
