
public class AddStars {
    public static String addStars(String s) {
        System.out.println("l "+s);
		// Write your code here
		if(s.isEmpty())
		    return "";
        if(s.length() >= 2 && s.charAt(0)==s.charAt(1)){
			System.out.println("s "+s);
            System.out.println("ok "+s.charAt(0)+'*');
		     String k = addStars(s.substring(2));
             String k1 = s.charAt(0)+"*";
             String p = s.charAt(0)+"*";
             System.out.println("k1 "+k1);
             System.out.println("p "+p);
             System.out.println("k "+k+" "+p);
             return k + p;
				}		else {
                  String d = s.charAt(0)+"";
                  String d2 = addStars(s.substring(1));
                  System.out.println("d "+d+" "+d2);
                    return d + d2;
                }

		     
	}
    public static void main(String[] args) {
        System.err.println( "two "+addStars("hello"));
    }
}
