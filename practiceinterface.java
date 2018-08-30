import java.io.*;
interface animal
{
	void speak();
	
	void eat();
}
 class cat implements animal
{
	public void eat()
{
System.out.println("cat  food");
}
	public void speak()
{
System.out.println("meow");
}

}
class dog implements animal
{
		public void speak()
{
System.out.println("barks");
}
public void eat()
{
System.out.println("dog food");
}
}
class interfaces 
{
	public static void main(String args[])
	{
          cat c=new cat();
          c.speak();
          c.eat();

          dog d=new dog();
          d.speak();
          d.eat();
	}
}