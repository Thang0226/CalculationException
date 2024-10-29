import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class CalculationExampleTest {

	@Test
	@DisplayName("Good cases")
	public void testCalculateGoodCases() {
		int x = 5;
		int y = 5;
		CalculationExample calc = new CalculationExample();
		calc.calculate(x, y);

		x = 0;
		y = 1;
		calc.calculate(x, y);
	}

	@Test
	@DisplayName("Exception cases")
	public void testCalculateExceptionCases() {
		int x = 5;
		int y = 0;
		CalculationExample calc = new CalculationExample();
		calc.calculate(x, y);

		x = 0;
		y = 0;
		calc.calculate(x, y);
	}
}