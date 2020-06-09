
public class vehicle 
{
	String color;
	private int maxspeed;
	
	public int getMaxspeed() 
	{
		return maxspeed;
	}
	
	public void setMaxspeed(int maxspeed)
	{
		this.maxspeed = maxspeed;
	}
	public void print()
	{
		System.out.println("Vehicle Color : "+color);
		System.out.println("Vehicle speed : "+maxspeed);
	}
}
