import org.junit.jupiter.api.Test;

class tshirtsTest {

	@Test
	void testSmallSize() {
		System.out.println("Small Tests");
		for (int i = 0; i < 10; i++) {
			int smallSize = (int) (Math.random() * 37);
			assert(tshirts.size(smallSize) == "S");
		}
		assert(tshirts.size(1) == "S");
		assert(tshirts.size(15) == "S");
		assert(tshirts.size(37) == "S");
	}
	
	@Test
	void testMediumSize() {
		assert(tshirts.size(40) == "M");
        assert(tshirts.size(41) == "M");
        assert(tshirts.size(38) == "M");
		for (int i = 0; i < 10; i++) {
			int mediumSize = (int) (Math.random() * (41-38) + 38);
			assert(tshirts.size(mediumSize) == "M");
		}
	}
	
	@Test
	void testLargeSize() {
		for (int i = 0; i < 10; i++) {
			int mediumSize = (int) (Math.random() * (100-42) + 42);
			assert(tshirts.size(mediumSize) == "L");
		}
		assert(tshirts.size(42) == "L");
        assert(tshirts.size(60) == "L");
        assert(tshirts.size(100) == "L");
	}

}
