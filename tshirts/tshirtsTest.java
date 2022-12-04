import org.junit.jupiter.api.Test;

class tshirtsTest {

	@Test
	void smallSize() {
		for (int i = 0; i < 10; i++) {
			int small = (int) (Math.random() * 37);
			assert(Tshirts.size(small) == "S");
		}
		assert(Tshirts.size(1) == "S");
		assert(Tshirts.size(15) == "S");
		assert(Tshirts.size(37) == "S");
	}
	
	@Test
	void mediumSize() {
		assert(Tshirts.size(40) == "M");
        assert(Tshirts.size(41) == "M");
        assert(Tshirts.size(38) == "M");
		for (int i = 0; i < 10; i++) {
			int medium = (int) (Math.random() * (41-38) + 38);
			assert(Tshirts.size(medium) == "M");
		}
	}
	
	@Test
	void largeSize() {
		for (int i = 0; i < 10; i++) {
			int large = (int) (Math.random() * (100-42) + 42);
			assert(Tshirts.size(large) == "L");
		}
		    assert(Tshirts.size(42) == "L");
        assert(Tshirts.size(60) == "L");
        assert(Tshirts.size(100) == "L");
	}

}
