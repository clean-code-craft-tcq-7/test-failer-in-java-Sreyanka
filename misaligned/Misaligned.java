public class Misaligned {
   static int printColorMap() {
        String majorColors[] = {"White", "Red", "Black", "Yellow", "Violet"};
        String minorColors[] = {"Blue", "Orange", "Green", "Brown", "Slate"};
        int i = 0, j = 0;
        for(i = 0; i < 5; i++) {
            for(j = 0; j < 5; j++) {
            	if (i * 5 + j < 10) {
            		System.out.println(singlePrintAlignment(i,j, majorColors[i], minorColors[j]));
            	} else {
            		System.out.println(doublePrintAlignment(i,j, majorColors[i], minorColors[j]));
            	}
            }
        }
        return i * j;
    }
    
    public static String doublePrintAlignment(int i,int j,String minorColor,String majorColor){
        String number = Integer.toString(i * 5 + j);
    	String result = number.concat(" | " + majorColor + " | " + minorColor);
    	return result;
    }
	
 public static String singlePrintAlignment(int i,int j,String minorColor,String majorColor){
        String number = Integer.toString(i * 5 + j);
    	String result = number.concat("  | " + majorColor + " | " + minorColor);
    	return result;
    }		
    
    public static void main(String[] args) { 
        int result = printColorMap();
        assert(result == 25);
	String resultDouble = doublePrintAlignment(2, 5, "White", "Blue");
    	String resultAlignedSingle = singlePrintAlignment(0, 5, "White", "Blue");
	System.out.println(resultDouble+"\n"+resultAlignedSingle)
	assert resultDouble.equals("15 | White | Blue");    
	assert resultAlignedSingle.equals("5  | White | Blue");
        System.out.println("All is well (maybe!)");
    }
}
