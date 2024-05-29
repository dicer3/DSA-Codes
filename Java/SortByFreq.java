import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class SortFreqCompare implements Comparator<Map.Entry<Character, Integer>> {
    public int compare(
        Map.Entry<Character, Integer> o1,
        Map.Entry<Character, Integer> o2
      ){
        if(o1.getValue() == o2.getValue())
           return o1.getKey() - o2.getKey();
        else 
           return o2.getValue() - o1.getValue();
      }
}

class SortByFreq {
    public static String frequencySort(String s) {
        
        int n = s.length();
        String ans = "";
        Map<Character, Integer> freq = new HashMap<>();

        for(int i=0;i<n;i++){
           freq.put(s.charAt(i),freq.getOrDefault(s.charAt(i),0)+1);
        }

        List<Map.Entry<Character, Integer>> sortedFreq = new ArrayList<>(freq.entrySet());

        System.out.println("list "+sortedFreq.toString());
        SortFreqCompare sortinFreqCompare = new SortFreqCompare();
        Collections.sort(sortedFreq, sortinFreqCompare);

        System.out.println("list "+sortedFreq.toString());
        for(Map.Entry<Character, Integer> entry : sortedFreq){
                for(int i=0;i<entry.getValue();i++)
                   ans = ans + entry.getKey();
        }

        return ans;
    }

    public static void main(String[] args) {
        frequencySort("eedgdegged");
    }
}