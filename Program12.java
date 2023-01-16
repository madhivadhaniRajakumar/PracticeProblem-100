import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.math.RoundingMode;
import java.text.DecimalFormat;
public class Program12 {
	
	public static void main(String[] args) {
		float f1 = 7.50f;
       
 
        NumberFormat numberFormat= NumberFormat.getInstance();
        numberFormat.setMaximumFractionDigits(2);
 
        // Print float to 2 decimal places using NumberFormat
        System.out.println(numberFormat.format(f1));

        
	}
}
