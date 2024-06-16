import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;


class Assumptions {

	@Test
	void testOnlyOnDevServer() {
		// DEV 환경 에서만 test 실행
		assumeTrue("DEV".equals(System.getenv("ENV")));
		assertEquals(1, "a".length(), "is always equal");
	}

}
