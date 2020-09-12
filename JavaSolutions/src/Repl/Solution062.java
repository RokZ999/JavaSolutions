package Repl;

public class Solution062 {
	public static void main(String[] args) {
		 Dog toman = new Dog("Toman","Disabled",80.1);
		 toman = new Dog("Toman", 80.1);
		 System.out.println(toman);
	}
	
}
 class Dog{
	  public String name,breed;
	  public double weight;
	  
	  Dog(String name, String breed, double weight){
	    this.name = name;
	    this.breed = breed;
	    this.weight = weight;
	    
	  }  
	  Dog(String name, double weight){
	    this.name = name;
	    this.breed = "Mutt";
	    this.weight = weight;
	    
	  }
	@Override
	public String toString() {
		return String.format("Object name: %s%nBreed: %s%nWeieght: %.2fkg%n", name,breed,weight);
	}
}