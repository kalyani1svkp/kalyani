package org.tnsif.camgemini.c2tc.oops;

public class KIA_motors {

	      int  noCar;
	      String model;
	      String engine;
	      int speed;
		
	      void display()
	      {
	    	  System.out.println("This is KIA Motors , Welcome to our show room");
	    	  
	      }
		 void welcome()
		 {
			 System.out.println("Welcome");
		 }
		public static void main(String[] args) {
			KIA_motors obj=new KIA_motors();
			obj.display();
			obj.welcome();
			obj.noCar=1888;
			obj.model="KIA";
			obj.engine="Petrol stream";
			obj.speed=60;
			System.out.println(obj.noCar);
			System.out.println(obj.model);
			System.out.println(obj.engine);
			System.out.println(obj.speed);
			

		}

	}

