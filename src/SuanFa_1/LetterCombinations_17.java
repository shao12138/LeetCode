package SuanFa_1;

import java.util.List;

public class LetterCombinations_17 {
    public static void main(String[] args) {
        System.out.println('2');
    }
    public List<String> letterCombinations(String digits) {
        String number[][]=new String[][]{{"a","b","c"},{"d","e","f"},{"g","h","i"},{"j","k","l"},{"m","n","o"},{"p","q","r","s"},{"t","u","v"},{"w","x","y","z"},};
        char[] a = digits.toCharArray();
        for (int i=0;i<a.length;i++){
            int index = (int)a[i] - (int)('0');
            if (index==7||index==9){

            }
        }
        return null;
    }
}
