package com.uned.programacion;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ){
    	
    	Scanner supermercator=new Scanner(System.in);
    	
    	System.out.println("Hola. Por favor, introduzca su nombre");
    	
    	String nombreUser=supermercator.nextLine();
    	
    	double[] arrayPreciosSeccion=menu(supermercator,nombreUser);
    	
    	double resultadoFinal=precioFinal(arrayPreciosSeccion);
    	
    	System.out.printf("El precio de tu compra es: %.2f€\n", resultadoFinal);

    }
     
   public static double[] menu(Scanner supermercator, String nombreUser) {
	   
	   int option;
	   double totalCarniceria=0;
	   double totalPescaderia=0;
	   double totalFrutería=0;
	   double totalDroguería=0;
	   
	   do {
		   		    
	    	System.out.println("Hola, " + nombreUser + ". Selecciona una de las categorías tecleando su número: \n1.Carnicería \n2.Pescadería \n3.Frutería \n4.Droguería \n5.Finalizar ");
	    	option=supermercator.nextInt();
	    	
	    	switch(option) {
	    	
		    	case 1:
		    		System.out.println("Has seleccionado la carnicería");
		    		totalCarniceria=carniceria(supermercator);
		    		break;
		    	
		    	case 2:
		    		System.out.println("Has seleccionado la pescadería");
		    		totalPescaderia=pescaderia(supermercator);		    		
		    		break;
		    	case 3:
		    		System.out.println("Has seleccionado la frutería");
		    		totalFrutería=fruteria(supermercator);		    		
		    		break;
		    	case 4:
		    		System.out.println("Has seleccionado la droguería");
		    		totalDroguería=drogueria(supermercator);		    		
		    		break;
		    	case 5:
		    		System.out.println("Estupendo, " + nombreUser + ", has finalizado tu compra.");		    		
		    		break;		
	    		    	
	    	}
	    	
    	} while (option!=5);   
	   
	   double categorias[]= {totalCarniceria,totalPescaderia,totalFrutería,totalDroguería};
    	
    	return categorias;
    }

   
   public static double carniceria(Scanner supermercator) {
	   
	   double totalCarnita=0;
	   
	   int carnita;
	   
	   do {		  
		   
		   System.out.println("Seleccione una de las categorías tecleando su número: \n1.Chuletas=5.25 \n2.Filetes=11.99 \n3.Salchichas=4.50 \n4.Finalizar ");
		  
		   carnita=supermercator.nextInt();
		   
		   double precio = 0;
		   
		   switch(carnita) {
		   
			   case 1:
	               precio = 5.25;
	               break;
	           case 2:
	               precio = 11.99;
	               break;
	           case 3:
	               precio = 4.50;
	               break;
	           case 4:
	               System.out.println("Ha finalizado la selección de productos.");
	               break;
	           default:
	               System.out.println("Opción no válida. Por favor, seleccione otra opción del 1 al 4.");
	       }	
		   if(carnita !=4) {
			   totalCarnita += precio;
			   System.out.printf("El importe total actual es de: %.2f€\n", totalCarnita);
			   System.out.println();
		   }
	   } while (carnita!=4);
	   
	   return totalCarnita;
   }
   
	 public static double pescaderia(Scanner supermercator) {
		   
		   double totalPescaito=0;
		   
		   int pescaito;
		   
		   do {		  
			   
			   System.out.println("Seleccione una de las categorías tecleando su número: \n1.Lubina=12.25 \n2.Salmón=23.99 \n3.Atún Salvaje=50.15 \n4.Finalizar ");
			  
			   pescaito=supermercator.nextInt();
			   
			   double precio = 0;
			   
			   switch(pescaito) {
			   
				   case 1:
		               precio = 12.25;
		               break;
		           case 2:
		               precio = 23.99;
		               break;
		           case 3:
		               precio = 50.15;
		               break;
		           case 4:
		               System.out.println("Ha finalizado la selección de productos.");
		               break;
		           default:
		               System.out.println("Opción no válida. Por favor, seleccione otra opción del 1 al 4.");
		       }	
			   if(pescaito !=4) {
				   totalPescaito += precio;
				   System.out.printf("El importe total actual es de: %.2f€\n", totalPescaito);
				   System.out.println();
			   }
		   } while (pescaito!=4);
		   
		   return totalPescaito;
	   }
	 
	 public static double fruteria(Scanner supermercator) {
		   
		   double totalFrutilla=0;
		   
		   int frutilla;
		   
		   do {		  
			   
			   System.out.println("Seleccione una de las categorías tecleando su número: \n1.Aguacate=3.25 \n2.Persimón=3.29 \n3.Mango=4.50 \n4.Finalizar ");
			  
			   frutilla=supermercator.nextInt();
			   
			   double precio = 0;
			   
			   switch(frutilla) {
			   
				   case 1:
		               precio = 3.25;
		               break;
		           case 2:
		               precio = 3.29;
		               break;
		           case 3:
		               precio = 4.50;
		               break;
		           case 4:
		               System.out.println("Ha finalizado la selección de productos.");
		               break;
		           default:
		               System.out.println("Opción no válida. Por favor, seleccione otra opción del 1 al 4.");
			   }	
			   if(frutilla !=4) {
				   totalFrutilla += precio;
				   System.out.printf("El importe total actual es de: %.2f€\n", totalFrutilla);
				   System.out.println();
			   }
		   } while (frutilla!=4);
		   
		   return totalFrutilla;
	 }
	 
	 public static double drogueria(Scanner supermercator) {
		   
		   double totalDrogue=0;
		   
		   int drogue;
		   
		   do {		  
			   
			   System.out.println("Seleccione una de las categorías tecleando su número: \n1.Vitaminas=2.25 \n2.Cepillos de dientes=3.0 \n3.Algodón=1.30 \n4.Finalizar ");
			  
			   drogue=supermercator.nextInt();
			   
			   double precio = 0;
			   
			   switch(drogue) {
			   
				   case 1:
		               precio = 2.25;
		               break;
		           case 2:
		               precio = 3.0;
		               break;
		           case 3:
		               precio = 1.30;
		               break;
		           case 4:
		               System.out.println("Ha finalizado la selección de productos.");
		               break;
		           default:
		               System.out.println("Opción no válida. Por favor, seleccione otra opción del 1 al 4.");
		              // continue;
	     }	
			   if(drogue !=4) {
				   totalDrogue += precio;
				   System.out.printf("El importe total actual es de: %.2f€\n",totalDrogue);
				   System.out.println();
			   }
		   } while (drogue!=4);
		   
		   return totalDrogue;
	 }
    
     public static double precioFinal(double[] array) {
    	 
    	 double sumarTotal=0;
        	
    	 for (int i=0;i<array.length;i++) {
        	
        	sumarTotal += array[i];
        }
    	 
    	 System.out.printf("El precio final en carnicería es:  %.2f€\n", array[0]);
    	 System.out.printf("El precio final en pescadería es:  %.2f€\n", array[1]);
    	 System.out.printf("El precio final en frutería es:  %.2f€\n", array[2]);
    	 System.out.printf("El precio final en droguería es: %.2f€\n", array[3]);
    	 
    	 return sumarTotal;
    }
}
