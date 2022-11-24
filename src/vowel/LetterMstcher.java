package vowel;

import vowel.Gui;

public class LetterMstcher  {
    public int compareString(String str){
        String vals = "AEIOUaeiou";
        char[] ch = str.toCharArray();
        char[] v = vals.toCharArray();
        int count = 0;
        for(int i =0; i < str.length(); i++){
            for(int j=0; j < v.length; j++){
                if(ch[i] == v[j]){
                    count += 1;
                }
            }

        }

        return count;
    }
}
