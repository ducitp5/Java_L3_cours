package Map;

import java.util.HashMap;
import java.util.Map;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        System.out.println("App Output Directory: " + 1);

        Map<String, String> appConfigs = new HashMap<String, String>();
        
        appConfigs.put("INPUT_DIRECTORY", "C:/App/input");
        appConfigs.put("IMAGE_DIRECTORY", "C:/App/image");
       
       
        String outputDir = appConfigs.getOrDefault("OUTPUT_DIRECTORY", "C:/App/output");
       
        System.out.println("App Output Directory: " + outputDir);
	}

}
