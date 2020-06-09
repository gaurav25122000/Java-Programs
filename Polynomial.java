
public class Polynomial 
{
	DynamicArray coef;
	
	public Polynomial()
	{
		
	}
	
	
	public void setCoefficient(int deg,int coeff)
	{
		coef.set(deg, coeff);
	}
	
	public int getCoefficient(int deg)
	{
		return coef.get(deg);
	}
	
	public int degree()
	{
		int deg=0;
		for(int i=0;i<coef.size();++i)
			if(coef.get(i)!=0)
				deg=coef.get(i);
		return deg;
	}
	
	public void print()
	{
		for(int i=0;i<coef.size();++i)
		{
			if(coef.get(i)!=0)
				System.out.print(coef.get(i)+"x"+i);
		}
	}
	
	public Polynomial add(Polynomial p)
	{
		int m=degree(),i;
		int n=p.degree();
		Polynomial result=new Polynomial();
		for(i=0;i<Math.min(m, n);++i)
			result.setCoefficient(i,getCoefficient(i)+p.getCoefficient(i));
		if(i<n)
			for(;i<=n;++i)
				result.setCoefficient(i, p.getCoefficient(i));
		else
			for(;i<=m;++i)
				result.setCoefficient(i, getCoefficient(i));
		return result;
	}
	
	public Polynomial subtract(Polynomial p)
	{
		int m=degree(),i;
		int n=p.degree();
		Polynomial result=new Polynomial();
		for(i=0;i<Math.min(m, n);++i)
			result.setCoefficient(i,getCoefficient(i)-p.getCoefficient(i));
		if(i<n)
			for(;i<=n;++i)
				result.setCoefficient(i, -p.getCoefficient(i));
		else
			for(;i<=m;++i)
				result.setCoefficient(i, getCoefficient(i));
		return result;
	}
	
//	public Polynomial multiply(Polynomial p)
//	{
//		
//	}
//	
//	public int evaluate(int x)
//	{
//		
//	}
//	
//	public static Polynomial add(Polynomial p1,Polynomial p2)
//	{
//		
//	}
} 
