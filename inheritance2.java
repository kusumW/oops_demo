
class Square
{
    public int l;
	/*public void constructor(int l)
	{
		this.l=l;
	}*/
	public void area(int l)
	{
        this.l=l;
		System.out.println("Area is:"+(this.l*this.l));
	}
}
class Rectangle extends Square
{
	/*constructor(l,b)
	{
		super(l);
		this.b=b;
	}*/
    public int b;
	
    public void area(int l, int b)
	{
        super(l);
        this.b=b;
		System.out.println("Area is:"+(this.l*this.b));
	}
}
public class inheritance2{
    public static void main(String[] arguments){
Square s=new Square();
Rectangle a=new Rectangle();
s.area(2);
a.area(2,3);

}}
