package RecipeManager.logic;

import java.util.Map;
import java.util.TreeMap;

public class recipeSaveStructure {
    String recipeName;
    String websiteName;
    String instructions;
    public  recipeSaveStructure(String recipeName, String websiteName, String instructions){
        this.recipeName = recipeName;
        this.websiteName = websiteName;
        this.instructions = instructions;
    }

    public static recipeSaveStructure fromJSON(Map<String,String> json){
        return new recipeSaveStructure(json.get("recipieName"),json.get("websiteName"),json.get("instructions"));
    }

    public Map<String,String> toJson(){
        Map<String,String> returnVal = new TreeMap<>();
        returnVal.put("recipeName",this.recipeName);
        returnVal.put("websiteName",this.websiteName);
        returnVal.put("instructions",this.instructions);
        return returnVal;
    }

    public String getRecipeName(){
        return this.recipeName;
    }
    public String getWebsiteName(){
        return this.recipeName;
    }
    public String getInstructions(){
        return this.instructions;
    }

    public void setRecipeName(String recipeName){
        this.recipeName = recipeName;
    }
    public void setWebsiteName(String websiteName){
        this.websiteName = websiteName;
    }
    public void setInstructions(String instructions){
        this.instructions = instructions;
    }
}