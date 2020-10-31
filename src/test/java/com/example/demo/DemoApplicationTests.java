package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.dto.Student;
@SpringBootTest
class DemoApplicationTests {
	@Autowired
	Student std;
	@Test
	void contextLoads() {
		assertThat(std.getName().equals("Hasan Bin Alam"));
	}

}
