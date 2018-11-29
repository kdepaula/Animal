
public abstract class Animal 
{
	private char gender;
	
	public Animal(char gen)
	{
		gender = gen;
	}
	
//	public String speak()
//	{
//		return "speak";
//	}
	
	//THIS IS AN ABSTRACT METHOD- ENSURES THAT THE SPEAK METHOD EXISTS IN ANY CLASS
	
	public abstract String speak();

}

