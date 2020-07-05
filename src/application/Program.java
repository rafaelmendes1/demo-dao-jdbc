package application;


import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
	
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("TEST 1: Seller findById =====");
		Seller seller = sellerDao.findById(7);
		System.out.println(seller);
		
		System.out.println("TEST 2: Seller findByDepartment =====");
		Department dep = new Department(4, null);
		List<Seller> list = sellerDao.findByDepartment(dep);
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("TEST 3: Seller findByAll =====");
		List<Seller> listAll = sellerDao.findAll();
		for(Seller obj : listAll) {
			System.out.println(obj);
		
		}
		
		System.out.println("TEST 4: Seller insert =====");
		Seller sellerInsert = new Seller(null, "Franky", "franky@ciborg.com", new Date(), 300000.0, dep);
		sellerDao.insert(sellerInsert);
		System.out.println("Inserted! New id = " + sellerInsert.getId());
		
		System.out.println("TEST 5: Seller update =====");
		seller = sellerDao.findById(1);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		System.out.println("Update completed");
	}
}
