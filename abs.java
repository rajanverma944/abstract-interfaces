abstract class animal
{ 
	String name,breed,color;
	abstract void eat();
	void speak()
	{
		System.out.println("meoooow");
	}
}
class base extends animal 
{
 public void eat()
	{
		System.out.println("meoooow");
	}
}
class abs
{
	public static void main(String args[])
	{
		animal a=new base();
		a.name="doggo";
		a.breed="germanshephered";
        a.color="black";
		a.speak();
		a.eat();
		
	}
}