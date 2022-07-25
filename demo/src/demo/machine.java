package demo;

public class machine {
	 private String name;
	 private int code;
	public machine() {
		 this("Arnie", 0);
		System.out.println("constructor running");
	}
	public machine(String name) {
        this(name, 0);

		System.out.println("2constructor running");
	}
	public machine(String name, int code) {
		System.out.println("3constructor running");
		this.name = name;
        this.code = code;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		machine m1 = new machine();
		machine m2 = new machine("pk");
		machine m3 = new machine("pk1",5);
		
	}

}