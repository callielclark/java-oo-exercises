public class Fraction 
{
	private int num;
	private int denom;
	
	public Fraction(int num, int denom) 
	{
		this.num = num;
		this.denom = denom;
	}
	
	public String Add(Fraction x) 
	{
		Fraction f = new Fraction( (this.num * x.denom) + (this.denom * x.num), (this.denom * x.denom) );
		return f.num + "/" + f.denom;
	}
	
	public String Multiply(Fraction x) 
	{
		Fraction f = new Fraction( (this.num * x.num), (this.denom * x.denom));
		return f.num + "/" + f.denom;
	}
	
	public String Reciprocal() 
	{
		Fraction f = new Fraction(this.denom, this.num);
		return f.num + "/" + f.denom;
	}
	
	public int comDenom() 
	{
		int s;
		if (num > denom) s = denom;
		else s = num;
		
		for (int i = s; i > 0; i--) 
		{
			if ((num % i == 0) && (denom % i == 0)) return i;
		}
		return -1;
	}
	
	public String Simplify() 
	{
		int comDenom = comDenom();
		if (comDenom > 1) 
		{
			num = num/comDenom;
			denom = denom/comDenom;
			Fraction f = new Fraction(num, denom);
			if (f.denom == 1) return num +"";
			else return f.num + "/" + f.denom;
		}
		else if (denom == 1) return num + "";
		else return num + "/" + denom;
	}
	
	public static void main(String[] args) 
	{
		Fraction f1 = new Fraction(3, 4);
		Fraction f2 = new Fraction(1, 2);
		Fraction f3 = new Fraction(10, 5);
		
		System.out.println(f1.Add(f2));
		System.out.println(f1.Multiply(f2));
		System.out.println(f1.Reciprocal());
		System.out.println(f3.Simplify());
	}
}