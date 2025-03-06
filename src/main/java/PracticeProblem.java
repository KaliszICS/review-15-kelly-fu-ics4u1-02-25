
import java.util.HashMap;

public class PracticeProblem {

public static int goodString(String s){
    int amount = -1;
    int length = s.length();
    int checker = 0;
    int amountOne =100, amountTwo =100;
    
    HashMap <Character,Integer> map = new HashMap<Character, Integer>();
    for (int i = 0; i < length; i ++){
        map.put((s.charAt(i)),i);
    }
    for (int index = 0; index < length; index++){
        if (map.get(s.charAt(index)) != index && checker == 0){
            amountOne = (s.length()-1) - map.get(s.charAt(index)) + index;
            checker = index;
        }
        if (map.get(s.charAt(index)) != index && index > checker){
            amountTwo = (s.length()-1) - map.get(s.charAt(index)) + index;
            length = 0;
        }
    }
        
    if (amountOne<amountTwo){
        amount = amountOne;
    }
    else if (amountOne+amountTwo==200){
        amount = -1;
    }
    else{
    amount = amountTwo;
    }

    return amount;

}


}