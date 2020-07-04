package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Department obj = new Department(1, "Cooking");
		Seller seller = new Seller(7, "Sanji", "namiswan@robin.chwan",
				new Date(), 300000000.0, obj);
		System.out.println(seller);
	}

}
