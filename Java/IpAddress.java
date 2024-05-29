public class IpAddress {
    public boolean checkValidIpPart(String ipPart){
        System.out.println("ok "+ipPart);
        if(ipPart == null || ipPart == ""){
            System.out.println("ok nkt");
           return false;
        }   
           
        int n = ipPart.length(); 
        if(n > 3)
           return false;
        
        if(ipPart.indexOf('0') == 0 && n >1)
           return false;
           
        for(int i=0;i<n;i++){
            if(!(ipPart.charAt(i) >='0' && ipPart.charAt(i)<='9')){
                //System.out.println("coming here");
                return false;
            }    
        }   
        
        int k  = Integer.parseInt(ipPart);
        
        if(!(k>=0 && k<=255))
           return false;
        return true;   
    }

    public boolean isValid(String ipStr) {
        // Write your code here
        if(ipStr == null || ipStr == "")
           return false;
        
        String[] ipParts = ipStr.split("\\.");
        
        if(ipParts.length !=4)
           return false;
        
        for(String ipPart: ipParts){
            if(!checkValidIpPart(ipPart))
               return false;
        }
        
        return true;
    }
}
