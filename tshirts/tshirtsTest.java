import org.junit.jupiter.api.Test;

class tshirtsTest {

	@Test
	void smallSize() {
		for (int i = 0; i < 10; i++) {
			int small = (int) (Math.random() * 37);
			assert(tshirts.size(small) == "S");
		}
		assert(tshirts.size(1) == "S");
		assert(tshirts.size(15) == "S");
		assert(tshirts.size(37) == "S");
	}
	
	@Test
	void mediumSize() {
		assert(tshirts.size(40) == "M");
        assert(tshirts.size(41) == "M");
        assert(tshirts.size(38) == "M");
		for (int i = 0; i < 10; i++) {
			int medium = (int) (Math.random() * (41-38) + 38);
			assert(tshirts.size(medium) == "M");
		}
	}
	
	@Test
	void largeSize() {
		for (int i = 0; i < 10; i++) {
			int large = (int) (Math.random() * (100-42) + 42);
			assert(tshirts.size(large) == "L");
		}
		    assert(tshirts.size(42) == "L");
        assert(tshirts.size(60) == "L");
        assert(tshirts.size(100) == "L");
	}

}
