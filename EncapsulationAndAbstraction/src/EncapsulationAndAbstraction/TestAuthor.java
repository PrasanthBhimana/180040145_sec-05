package EncapsulationAndAbstraction;

public class TestAuthor {
	public static void main(String[] args) {
	      Author a= new Author("Ram", "Ram@c.com", 'm');
	      System.out.println(a);  
	      a.setEmail("Ram@c.com");
	      System.out.println(a);  
	      System.out.println("name is: " + a.getName());
	      System.out.println("gender is: " + a.getGender());
	      System.out.println("email is: " + a.getEmail());
	   }

}

