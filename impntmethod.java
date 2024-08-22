package javaprogram;

public class impntmethod {
	public int single (int x)
	{
		return (x);
	}
	public int multiple (int x , int y , int z)
	{
		return(x+y+z);
	}
	public double different( int x,double y) {
		return(x+y);
	}

	public static void main(String[] args) {
		impntmethod s = new impntmethod();
		System.out.println(s.single(10));
		System.out.println(s.multiple(10,20,30));
		System.out.println(s.different(1,2));

	}

}
