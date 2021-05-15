package lab8_ploymorphism;

public interface Shape extends Drawing{
	int color=1; // => public static final int color=1;
	public abstract double area();
}
