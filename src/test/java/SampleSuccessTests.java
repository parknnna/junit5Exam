import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("성공 테스트")
public class SampleSuccessTests {

	@BeforeAll
	static void setup() {
		System.out.println("@BeforeAll - executes once before all test methods in this class");
	}

	@BeforeEach
	void init() {
		System.out.println("@BeforeEach - executes before each test method in this class");
	}

	@AfterEach
	void tearDown() {
		System.out.println("@AfterEach - executed after each test method.");
	}

	@AfterAll
	static void tearDownAll() {
		System.out.println("@AfterAll - executed after all test methods.");
	}

	@DisplayName("a가 포함되어 있음 🌱")
	@Test
	void successTest1() {
		System.out.println("executes successTest1");
		assumeTrue("abc".contains("a"));
	}

	@DisplayName("b 가 포함되어있음 ╯°□°）╯")
	@Test
	void successTest2() {
		System.out.println("executes successTest2");
		assumeTrue("abc".contains("b"));
	}
}
