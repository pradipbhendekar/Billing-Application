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
			System.out.println("1:add the product");
			System.out.println("2:show the all data of ArrayList");
			System.out.println("3:search the product by id");
			System.out.println("4:how many product are present in ArrayList");
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
			case 3:
				System.out.println("enter the id to serch the data");
				int value=sc.nextInt();
				ProdModel pm=produServieces.getProductById(value);	
				System.out.println("============================================================================");
				if(pm!=null) {
					System.out.println("PRODUCT_ID\tPRODUCT_NAME\tPRODUCT_PRICE\tPRODUCT_QUENTITY");
					System.out.println("------------------------------------------------------------");
				System.out.println(pm.getProdId()+"\t\t"+pm.getProdname()+"\t\t"+pm.getPrice()+"\t\t"+pm.getQty());
				}else {
					System.out.println("data are not present in ArrayList......");
				}
				 System.out.println("============================================================================");
				break;
			case 4:
				// this is return the how many produce are present in ArrayList
				int count=produServieces.totalCount();
				if(count<1) {
					System.out.println("the ArrayList is empty");
				}else {
					System.out.println(count);
					
				}
				
				break;
				
			}
		
		}while(true);

	}

}
