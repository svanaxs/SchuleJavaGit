package ApiPackage;

import java.util.List;

import com.google.gson.Gson;

public class BySummoner {
    private List<SubBySummoner> SubBySummoners;

    // Getter and setter for subObjects
    
    
public static BySummoner fromJson(String json) {
    	
    	Gson gson = new Gson();
    	return gson.fromJson(json, BySummoner.class);
    }
}

