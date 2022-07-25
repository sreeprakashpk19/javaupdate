package demo;

public class method {
    public void speak(String text) {
        System.out.println(text);
    }
    
    public void jump(int height) {
        System.out.println("Jumping: " + height);
    }
    
    public void move(String direction, double distance) {
        System.out.println("Moving " + distance + " in direction " + direction);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		method m1= new method();
		
		m1.jump(5);
		m1.move("leftward",5.7);
		String greeting ="great job";
		m1.speak(greeting);
	}

}
