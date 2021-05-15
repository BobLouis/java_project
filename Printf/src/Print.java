import java.text.DecimalFormat;

public class Print {
	public static void main(String[] args) {
		DecimalFormat percent = new DecimalFormat("##000.000%");
		System.out.println(percent.format(0.308));
	}
}
