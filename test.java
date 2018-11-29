import java.util.ArrayList;

public class test {

	public static void main(String[] args) 
	{
	//	Animal animal = new Animal('f');
		Dog dog = new Dog('f');
		Bird bird = new Bird('m');
		Animal yes = new Bird('m');
		// Bird no = new Animal('f');
		//an animal is not a bird
	
		ArrayList<Animal> myAnimals = new ArrayList<Animal>();
		myAnimals.add(dog);
		myAnimals.add(bird);
		myAnimals.add(yes);
	//	myAnimals.add(animal);
		
	
		for(Animal anim : myAnimals)
		{
			System.out.print(anim.speak());
			
//			OR YOU CAN TYPE CAST IT IF not every subclass has a speak  method
//			(it has to be written eventually)!!!
//			if(anim instanceof Bird)
//				System.out.println(((Bird)anim).speak());
		}
	}
}
