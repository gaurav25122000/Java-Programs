import java.util.Scanner;

public class ComplexNumbers
{
	private int real,imag;
	
	public ComplexNumbers(int real,int imag)
	{
		this.real=real;
		this.imag=imag;
	}
	
	public void plus(ComplexNumbers c2)
	{
		this.real+=c2.real;
		this.imag+=c2.imag;
	}
	
	public void multiply(ComplexNumbers c2)
	{
		int Real=this.real;
		int Imag=this.imag;
		this.real=Real*c2.real-Imag*c2.imag;
		this.imag=Real*c2.imag+c2.real*Imag;
	}
	
	public void print()
	{
		System.out.println(real+" "+"+"+" "+"i"+imag);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int real1 = s.nextInt();
		int imaginary1 = s.nextInt();

		int real2 = s.nextInt();
		int imaginary2 = s.nextInt();

		ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
		ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);

		int choice = s.nextInt();
		 
		if(choice == 1) {
			// Add
			c1.plus(c2);
			c1.print();
		}
		else if(choice == 2) {
			// Multiply
			c1.multiply(c2);
			c1.print();
		}
		else {
			return;
		}
	}
}
