package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		
		System.out.println("\n TEST 1: Department findById =====");
		Department dep = depDao.findById(4);
		System.out.println(dep);
		
		System.out.println("\n TEST 2: Department findAll =====");
		List<Department> list = depDao.findAll();
		for(Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n TEST 3: Department insert =====");
		Department depInsert = new Department(null, "Music");
		depDao.insert(depInsert);
		System.out.println("Inserted! New id =" + depInsert.getId());
		
		System.out.println("\n TEST 4: Department update =====");
		Department depUpdate = depDao.findById(4);
		depUpdate.setName("Food");
		depDao.update(depUpdate);
		System.out.println("Update completed!");
		
		System.out.println("\n TEST 5: Department delete =====");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		depDao.deleteById(id);
		System.out.print("Deleted! id: " + id);
		
		sc.close();
	}

}
