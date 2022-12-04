import org.junit.jupiter.api.Test;

class TshirtsTest {

	@Test
	void testSmallSize() {
		for (int i = 0; i < 10; i++) {
			int smallSize = (int) (Math.random() * 37);
			assert(Tshirts.size(smallSize) == "S");
		}
		assert(Tshirts.size(1) == "S");
		assert(Tshirts.size(15) == "S");
		assert(Tshirts.size(37) == "S");
	}
	
	@Test
	void testMediumSize() {
		assert(Tshirts.size(40) == "M");
        assert(Tshirts.size(41) == "M");
        assert(Tshirts.size(38) == "M");
		for (int i = 0; i < 10; i++) {
			int mediumSize = (int) (Math.random() * (41-38) + 38);
			assert(Tshirts.size(mediumSize) == "M");
		}
	}
	
	@Test
	void testLargeSize() {
		for (int i = 0; i < 10; i++) {
			int mediumSize = (int) (Math.random() * (100-42) + 42);
			assert(Tshirts.size(mediumSize) == "L");
		}
		assert(Tshirts.size(42) == "L");
        assert(Tshirts.size(60) == "L");
        assert(Tshirts.size(100) == "L");
	}

}
