package ui;

import models.Client;
import models.Product;
import models.Recipe;
import models.Table;

public class Main {

	public static void main(String[] args) {
		System.out.println("inició el programa");
		
		//objeto client
		Client newClient = new Client("Diego", "Molina", "1111", false);
		
		System.out.println("El nuevo cliente es: " + newClient.getName() + " " + newClient.getLastName());
		newClient.setName("andres");
		
		System.out.println("El nuevo cliente es: " + newClient.getName() + " " + newClient.getLastName());
		
		newClient.sethasChildren(true);
		System.out.println("El nuevo cliente tiene hijos (true/false): " + " " + newClient.gethasChildren());
		
		System.out.println("--------------------------------------------------------------------------------");
		//object product
		Product insumo = new Product("arroz" , "diana" , 5, 2000.76);
		System.out.println("El producto es: " + insumo.getName() + " ,Marca:" + " "+ insumo.getBrand() + ", cantidad : "+ insumo.getQuantity() + ", precio: " + insumo.getPrice());
		insumo.setName("papa"); insumo.setBrand("el campo");
		System.out.println("El producto es: " + insumo.getName() + " Marca:" + " "+ insumo.getBrand());
		
		System.out.println("----------------------------------------------------------------------------------");
		//object table
		Table free = new Table("4", 6, 4);
		System.out.println("mesa # " + free.getNumber());
		free.setNumber("1");
	    System.out.println("mesa # " + free.getNumber());
	    
	    free.setLocation(7);
	    System.out.println("la mesa en la ubicacion " + free.getLocation() + " necesita limpieza");
	    System.out.println("----------------------------------------------------------------------------------");
	    
	    
	    //object recipe
	    Recipe breakfast = new Recipe("caldo", 5000);
	    System.out.println("para desayuno hay: " + breakfast.getName());
	    breakfast.setName("huevos al gusto");
	    System.out.println("para desayuno hay: " + breakfast.getName());
	    
	    Recipe lunch = new Recipe("arroz con pollo", 7000);
	    System.out.println("para el almuerzo hay: " + lunch.getName());
	    lunch.setName("ensalada");
	    System.out.println("para el almuerzo hay " + lunch.getName());
	    
	    Recipe dinner = new Recipe("calentado", 4000);
	    System.out.println("para la cena hay: " + dinner.getName());
	    dinner.setName("verduras");
	    System.out.println("para la cena hay: " + dinner.getName());

	    
	    

	    


		
		

			

		
		

	}

}
