

import java.util.HashMap;

public class FrequencyCount {
    public static void main(String[] args) {
        String str="ram sharma";
        //str.charAt(0)
        //str.substring(0)
     HashMap<Character,Integer>map=new HashMap<>();
       for(int i=0;i<str.length();i++){
       char singlechar=str.charAt(i);
       if (singlechar==' '){
        continue;

       }
       if (map.get(singlechar)==null){
        map.put(singlechar,1);
       } 
       else{
        int prevCount=map.get(singlechar);
        map.put(singlechar,prevCount+1);
       }
    }
    System.out.println(map);
    }
}
