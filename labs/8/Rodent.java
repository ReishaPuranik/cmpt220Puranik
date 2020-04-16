class Mouse extends Rodent {
	@Override
	public void eating() {
    System.out.println("Mouse eats the cheese");
  }
	@Override
	public void running() {
    System.out.println("The mouse runs away from the cat");
  }
}

class Gerbil extends Rodent {
	@Override
	public void eating() {
    System.out.println("The gerbil eats seeds");
  }
	@Override
  public void running() {
    System.out.println("The gerbil runs away from the snake");
  }
}

class Hamster extends Rodent {
	@Override
	public void eating() {
    System.out.println("The hamster eats broccoli");
  }
	@Override
	public void running() {
    System.out.println("The hamster runs away from the bird");
  }
}
public class Rodent {
	public void eating() {
		System.out.println("Rodent is eating");
	}
	public void running() {
		System.out.println("Rodent is running");
	}
	
	public static void main(String[] args) {
		Rodent[] r = new Rodent[3];
		r[0] = new Mouse();
		r[1] = new Gerbil();
		r[2] = new Hamster();
    
    for (int i = 0; i < r.length; i++) {
      r[i].eating();
    }
    for (int i = 0; i < r.length; i++) {
      r[i].running();
    } 
    
	}
}