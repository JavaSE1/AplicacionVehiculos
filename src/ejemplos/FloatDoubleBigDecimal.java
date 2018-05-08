package ejemplos;

import java.math.BigDecimal;
import java.math.BigInteger;

public class FloatDoubleBigDecimal {

	public static void main(String[] args) {

	    double a = 0.02;
	    double b = 0.03;
	    double c = b - a;
	    System.out.println(c);

	    BigDecimal _a = new BigDecimal("0.02");
	    BigDecimal _b = new BigDecimal("0.03");
	    BigDecimal _c = _b.subtract(_a);
	    System.out.println(_c);
	    
	}

}
