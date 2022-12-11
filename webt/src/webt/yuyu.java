package webt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class yuyu {
	
	int a;

	@BeforeAll
	public void setUpBeforeClass() throws Exception {
		a=1;
		System.out.println("beforclass"+a);
	}

	@AfterAll
	public void tearDownAfterClass() throws Exception {
		
		System.out.println("afterallclass"+a);
	}

	@BeforeEach
	void setUp() throws Exception {
		a=2;
		System.out.println("beforeachclass"+a);
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Aftereachclass"+a);
	}

	@Test
	void test() {
		System.out.println("testclass");
		
	}

}
