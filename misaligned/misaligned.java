public class Misaligned {
    static int printColorMap() {
        String majorColors[] = {"White", "Red", "Black", "Yellow", "Violet"};
        String minorColors[] = {"Blue", "Orange", "Green", "Brown", "Slate"};
        int i = 0, j = 0;
        for(i = 0; i < 5; i++) {
            for(j = 0; j < 5; j++) {
                System.out.println(printAlignment(i,j,minorColors[i],majorColors[i]));
            }
        }
        return i * j;
    }
    
    public static string printAlignment(int i,int j,String minorColor,String majorColor){
        String number = Integer.toString(i * 5 + j);
    	String result = number.concat(" | " + majorColor + " | " + minorColor);
    	return result;
    }
    
    public static void main(String[] args) { 
        int result = printColorMap();
        assert(result == 25);
        String result = printAlignment(2, 5, "White", "Blue");
		assert result.equals("15 | White | Blue");
        System.out.println("All is well (maybe!)");
    }
}
