package Strings;


	 class Animal{
		   public static void sound(){
		      System.out.println("Animal is making a sound");   
		   }
		}
	

	 public	class Horse extends Animal{
		   
		    public static void sound(){
		        System.out.println("Neigh");
		    }
		    public static void main(String args[]){
		    	Horse obj = new Horse();
		    	obj.sound();
		    }
		}

