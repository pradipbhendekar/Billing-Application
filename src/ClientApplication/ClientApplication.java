package ClientApplication;

import java.util.Scanner;

import Model.ProdModel;
import Services.ProduServieces;

public class ClientApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		ProduServieces produServieces=new ProduServieces();

		do {
			System.out.println("1:enter the product");
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
				}
			case 2:
				break;
				
		}while(true);

	}

}
