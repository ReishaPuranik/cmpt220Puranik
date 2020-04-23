public class Three {
	public static int bin2Dec(String binaryString) throws NumberFormatException {
		int dec = 0;
		for (int i = 0; i < binaryString.length(); i++) {
			char curChar = binaryString.charAt(i);
				if (curChar == '1') {
					dec += Math.pow(2, i);
				} else if (curChar != '0') {
					throw new NumberFormatException();
				}
		}
		return dec;
	}   
	public static void main(String[] args) {
		System.out.println(bin2Dec("1001"));
		System.out.println(bin2Dec("11111111"));
		System.out.println(bin2Dec("111111ff1"));	
	}	
}