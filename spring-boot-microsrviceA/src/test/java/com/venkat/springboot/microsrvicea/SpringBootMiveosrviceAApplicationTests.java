package com.venkat.springboot.microsrvicea;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

@SpringBootTest
@ComponentScan(value = "com.venkat.springboot.restcontroller")
class SpringBootMiveosrviceAApplicationTests {

	@Test
	void contextLoads() {
	}

}
