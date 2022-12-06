package fhtw.imperialAPI;

import fhtw.imperialAPI.service.ServiceImperial;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ImperialApiApplicationTests {

	ServiceImperial testService = new ServiceImperial();

	@Test
	void contextLoads() {
	}

	@Test
	void testService(){
		assertEquals(0, testService.getZahl());
		assertEquals(0, testService.getInchZahl());
		assertEquals(0, testService.getYardZahl());

		testService.setZahl(1);
		testService.calcInch(1);
		testService.calcYard(1);
		assertEquals(2.54, testService.getInchZahl());
		assertEquals(0.9140767824497257, testService.getYardZahl());


	}

}
