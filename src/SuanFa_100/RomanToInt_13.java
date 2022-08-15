package SuanFa_100;

public class RomanToInt_13 {
    public static void main(String[] args) {
        romanToInt("MCMXCIV");
    }

    public static int romanToInt(String s) {
        int result = 0;
        s=s.replaceAll("IV", "A");
        s=s.replaceAll("IX", "B");
        s=s.replaceAll("XL", "O");
        s=s.replaceAll("XC", "N");
        s=s.replaceAll("CD", "E");
        s=s.replaceAll("CM", "F");
        for (int i = 0; i < s.length(); i++) {
            String temp = String.valueOf(s.charAt(i));
            switch (temp){
                case "I":result+=1;break;
                case "V":result+=5;break;
                case "X":result+=10;break;
                case "L":result+=50;break;
                case "C":result+=100;break;
                case "D":result+=500;break;
                case "M":result+=1000;break;
                case "A":result+=4;break;
                case "B":result+=9;break;
                case "O":result+=40;break;
                case "N":result+=90;break;
                case "E":result+=400;break;
                case "F":result+=900;break;
            }
        }
        return result;
    }
}
