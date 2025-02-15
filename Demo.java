 class Vehicle
{
  public abstract int getWheels();

	
	

}

class Cycle extends Vehicle
{
	public int getWheels()
	{
		return 2;

	}

}

class Auto extends Vehicle
{

public int getWheels()
	{
		return 3;

	}

}

class Truck extends Vehicle
{

public int getWheels()
	{
		return 8;

	}

}

class Car extends Vehicle
{

public int getWheels()
	{
		return 4;

	}

}

class Demo
{
		public static void main(String[] args)
		{
			Vehicle v=new Vehicle();
			

		}

}


