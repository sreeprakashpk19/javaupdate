package demo;

public class stanonsta {
	    public String name;
	    public static String description;
	    public int id;
        public static int count = 0;
        public final static int LUCKY_NUMBER = 7;
    public static void showinfo() {
    	System.out.println((description));
    }
  public stanonsta() {
        
        id = count;
        
        count++;
    }
    public void showName() {
        System.out.println("Object id: " + id + ", " + description + ": " + name);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		stanonsta.description="i am in static";
		stanonsta.showinfo();
		 System.out.println("Before creating objects, count is: " + stanonsta.count);
		stanonsta s1= new stanonsta();
		stanonsta s2= new stanonsta();
		stanonsta s3= new stanonsta();
		 
		s1.name = "Bob";
		s2.name = "Sue";
		 System.out.println(Math.PI);
	        
	     System.out.println(stanonsta.LUCKY_NUMBER);
		s1.showName();
		s2.showName();
		s3.showName();
	}

}
