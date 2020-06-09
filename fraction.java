
public class fraction
{
	private int num,den;
	
	public fraction(int num,int den) throws Exception
	{
		this.num=num;
		if(den==0)
		{
			Exception e=new Exception("Denominator can't be 0");
			throw e;
		}
		this.den=den;
		simplify();
	}
	
	public int getDenominator() 
	{
		return den;
	}
	public int getNumerator()
	{
		return num;
	}
	public void setNumerator(int num)
	{
		this.num=num;
		simplify();
	}
	public void setDenominator(int den) throws Exception
	{
		if(den==0)
		{
			Exception e=new Exception("Denominator can't be 0");
			throw e;
		}
		this.den=den;
		simplify();
	}
	public void print()
	{
		if(den==1)
			System.out.println(num);
		else
			System.out.println(num+"/"+den);
	}
	private void simplify()
	{
		int gcd=1;
		int smaller=Math.min(num, den);
		for(int i=2;i<=smaller;++i)
			if(num%i==0 && den%i==0)
				gcd=i;
		num=num/gcd;
		den=den/gcd;
	}
	public static fraction add(fraction f1, fraction f2)  throws Exception
	{
		int newnum=f1.num*f2.den+f1.den*f2.num;
		int newden=f1.den*f2.den;
		fraction f4=new fraction(newnum,newden);
		return f4;
	}
	public void add(fraction f2)
	{
		this.num=this.num*f2.den+this.den*f2.num;
		this.den=this.den*f2.den;
		simplify();
	}
	public void multiply(fraction f2)
	{
		this.num=this.num*f2.num;
		this.den=this.den*f2.den;
		simplify();
	}
}
