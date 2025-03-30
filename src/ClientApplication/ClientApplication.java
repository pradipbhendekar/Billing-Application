package ClientApplication;

import java.util.*;


import Model.ProdModel;
import Services.ProduServieces;

public class ClientApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		ProduServieces produServieces=new ProduServieces();

		do {
			System.out.println("1:enter the product");
			System.out.println("2:enter show the all data of ArrayList");
			int choice=sc.nextInt();
			switch(choice) {
			
			case 1:
				//add the product 
				
				//create the object of the prodModel class to set and get a data 
				ProdModel product=new ProdModel();
				System.out.println("enter the id,name,price,qty");
				product.setProdId(sc.nextInt());
				product.setProdname(sc.next());
				product.setPrice(sc.nextDouble());
				product.setQty(sc.nextInt());
				
				//pass the product to the produService class
				boolean add=produServieces.isAddNewProducts(product);
				if(add==true) {
					System.out.println("data added successfully............");
					}else {
						System.out.println("oops somthing is worng...data not added.....");
					}
				break;
			case 2:
				System.out.println("=========================================================================");
				//get the data form the service class 
				 ArrayList al=produServieces.getAllProducts();
				 //chek the data are present in the ArrayList or not
				 if(al!=null) {
					 System.out.println("PRODUCT_ID\tPRODUCT_NAME\tPRODUCT_PRICE\tPRODUCT_QUENTITY");
					 System.out.println("------------------------------------------------------------");
					 for(Object obj:al) {
						 ProdModel pm=(ProdModel)obj;
						 System.out.println(pm.getProdId()+"\t\t"+pm.getProdname()+"\t\t"+pm.getPrice()+"\t\t"+pm.getQty()); 
					 }
					 
				 }
				 else {
					 System.out.print("no data available in ArrayList.......");
				 }
				 System.out.println("==========================================================================");
				break;
				
				
				
			}
		
		}while(true);

	}

}
