
public class Obliczenia {
	private double a;
	private double b;
	private double c;
	private double delta = Math.pow(b, 2) - 4*a*c;
	private double x_0;
	private double x_1;
	private double x_2;
	
	public Obliczenia()
	{
		a = 0;
		b = 0;
		c = 0;
		delta = 0;
		x_0 = 0;
		x_1 = 0;
		x_2 = 0;
	}
	public Obliczenia(double a_, double b_, double c_)
	{
		this.a = a_;
		this.b = b_;
		this.c = c_;
	}
	public double delta(Obliczenia ob)
	{
		ob.delta = Math.pow(ob.getb(), 2) - 4*ob.geta()*ob.getc();
		return ob.delta;
	}
	public void pierwiastki(Obliczenia obb)
	{
		if(obb.delta > 0)
		{
			obb.x_1 = (-obb.getb() -Math.sqrt(obb.delta))/(2*obb.geta());
			obb.x_2 = (obb.getb() -Math.sqrt(obb.delta))/(2*obb.geta());
			System.out.println("Pierwiastki: " + obb.x_1 + " " + obb.x_2);
		}
		else if(obb.delta == 0)
		{
			obb.x_0 = (-obb.getb())/(2*obb.geta());
			System.out.println("Pierwiastek: " + obb.x_0);
		}
		else
		{
			System.out.println("Brak pierwiastków.");
		}
	}
	public double geta()
	{
		return a;
	}
	public double getb()
	{

		return b;
	}
	public double getc()
	{
		return c;
	}
	public void seta(double aa)
	{
		a = aa;
	}
	public void setb(double bb)
	{

		b = bb;
	}
	public void setc(double cc)
	{
		c = cc;
	}

}
