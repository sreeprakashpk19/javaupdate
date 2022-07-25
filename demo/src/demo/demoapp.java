package demo;

public class demoapp {
	String name;
	int age;
    
   
    int calculateYearsToRetirement() {
        int yearsLeft = 65 - age;
        
        return yearsLeft;
    }
    int getAge() {
        return age;
    }
    
    String getName() {
        return name;
    }
    
    
    
	public static void main(String[] args) {
		demoapp person1 = new demoapp();
	        
	        person1.name = "Joe";
	        person1.age = 25;
	  
	        int years = person1.calculateYearsToRetirement();
	        
	        System.out.println("Years till retirements " + years);
	        int getages=person1.getAge();
	        String getnames=person1.getName();
	        System.out.println("my name is " + getnames);
	        System.out.println("my age is " + getages);
}}
