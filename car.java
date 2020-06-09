
public class car extends vehicle
{
	int numGears;
	boolean isConvertible;
	
	public void printcar()
	{
		System.out.println("Car Color : "+color);
		System.out.println("Car speed : "+getMaxspeed());
		System.out.println("Car Gears : "+numGears);
		System.out.print("Car Convertible : "+isConvertible);

	}
}
