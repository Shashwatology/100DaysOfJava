// final method
class Calc
{
	// final method
	public final void show()
	{
		System.out.println("By Navin");
	}
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
}

class AdvCalc extends Calc
{
	public void show()
	{
		System.out.println("By John"); // <-- will get error here
	
}
public class  Demo{
    public static void main(String[] args) {  	
    	AdvCalc obj= new AdvCalc();
    	obj.show();
    	obj.add(4, 5);
    }
}
