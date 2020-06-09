
public class VehicleUse {

	public static void main(String[] args)
	{
		vehicle v=new vehicle();
		v.print();
		
		car c=new car();
		c.numGears=20;
		c.color="BLUE";
		c.print();
		c.setMaxspeed(150);
		
		c.printcar();

	}

}
