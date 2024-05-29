import java.util.HashMap;
import java.util.Map;

final class Student {
    private final String name;
    private final int regNo;
    private final Map<String, String> metadata;

    public Student(String name, int regNo, Map<String,String> metaData){
        this.name = name;
        this.regNo = regNo;
        
        Map<String, String> tempMap = new HashMap<>();

        for(Map.Entry<String,String> entry : metaData.entrySet()){
            tempMap.put(entry.getKey(), entry.getValue());
        };

        this.metadata = tempMap;
    }

    public String getName() { return name; }
 
    public int getRegNo() { return regNo; }

    public Map<String, String> getMetaData() {
        Map<String, String> tempMap2 = new HashMap<>();

        for(Map.Entry<String,String> entry : metadata.entrySet()){
            tempMap2.put(entry.getKey(), entry.getValue());
        };

        return tempMap2;
    }

}