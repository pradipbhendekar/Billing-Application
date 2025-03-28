package Services;

import java.util.ArrayList;

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
		
		ArrayList al=productRepo.getAllProducts();
		 if(al!=null){
			return al;
		 }else{
			 System.out.println("Data is not present in ArrayList.....");
		 }
		 
	}
	
	public ProdModel getProductById(int id) {
		return null;
	}
	
	public int totalCount() {
		return 0;
	}

}
