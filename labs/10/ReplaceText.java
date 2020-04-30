import java.io.*; 
import java.util.*;
public class ReplaceText {
	public static void main(String[] args) throws Exception {
		// Check command-line parameter usage 
		if (args.length != 3) {
			System.out.println("Usage: java Replace_Text file oldString newString");
			System.exit(1);
		}
		// Check if source file exists
		File sourceFile = new File(args[0]); 
		if (!sourceFile.exists()) {
			System.out.println("Source file " + args[0] + " does not exist");
		  System.exit(2);
		}


		List<String> outputContents = new ArrayList<>();		
		// Create a Scanner for input and a PrintWriter for output 
		Scanner input = new Scanner(sourceFile);
		while (input.hasNext()) {
            outputContents.add(input.nextLine().replaceAll(args[1], args[2]));
		}
        input.close();
		sourceFile.delete();
    
        File targetFile = new File(args[0]);
        PrintWriter output = new PrintWriter(targetFile);
        for (int i = 0; i < outputContents.size(); i++) {
            output.println(outputContents.get(i));  
        }
		output.close();
  }
}