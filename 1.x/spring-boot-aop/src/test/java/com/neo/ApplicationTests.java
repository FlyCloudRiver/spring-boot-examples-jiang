package com.neo;

import com.neo.aop.CalcService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootVersion;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.SpringVersion;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest
@ComponentScan("com.neo.aop")
@RunWith(SpringRunner.class)
public class ApplicationTests {

	@Autowired
	private CalcService calcService;

	@Test
	public void testAop4() {
		System.out.println("spring版本：" + SpringVersion.getVersion() + "\t" + "SpringBoot版本：" + SpringBootVersion.getVersion());
		System.out.println();
		calcService.div(10, 0);
		// calcService.div(10, 0);
	}
}
