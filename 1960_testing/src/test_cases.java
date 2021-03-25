import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test_cases {

	@Test
	void test() {
		register user1 = new register("RochelleVaz", "abc12345", "vaz123@gmail.com");
		Boolean value = user1.registration("RochelleVaz", "abc12345", "vaz123@gmail.com");
		Boolean actual_value = true;
		assertEquals(actual_value, value);
	}
}
