package CodingBat_Practice.Functional1;

import java.util.List;

public class noX {
    public List<String> noX(List<String> strings) {
        strings.replaceAll(s -> removeX(s));
        return strings;
    }
    public String removeX(String s){
        String sb = "";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != 'x'){
                sb+=String.valueOf(s.charAt(i));
            }
        }
        return sb;
    }
}
