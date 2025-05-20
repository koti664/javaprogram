import java.util.*;
public class FirstNonRepeatingCharacter {
    public static void main(String args[]){
        String str="swiss";
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(hm.containsKey(c)){
                hm.put(c,hm.get(c)+1);
            }
            else{
                hm.put(c,1);
            }
        }
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(hm.get(c)==1){
                System.out.print(c);
                break;
                
            }
        
        }
    }
    
}
