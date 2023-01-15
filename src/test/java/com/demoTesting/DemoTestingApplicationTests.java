package com.demoTesting;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
@SpringBootTest(classes = Calculator.class)
class DemoTestingApplicationTests {
	Calculator calculator = new Calculator();

	@Test
	void contextLoads() {

	}

	@Test
	void testSum() {
		// aspected
		int aspectedResult = 17;

		// actual
		int actualResult = calculator.doSum(12, 3, 2);

		assertThat(actualResult).isEqualTo(aspectedResult);

	}

	@Test
	@Disabled
	void testProduct() {
		// aspected
		int aspectedResult = 6;

		// actualResult
		int actualResult = calculator.doMulti(2, 3);

		assertThat(actualResult).isEqualTo(aspectedResult);
	}

	@Test
	void testCompair() {
		
		//actualResult 
		Boolean actualResult=calculator.compairNumber(8, 8);
		assertThat(actualResult).isEqualTo(true);
		
	}
}
