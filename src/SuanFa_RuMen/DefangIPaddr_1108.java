package SuanFa_RuMen;

public class DefangIPaddr_1108 {
    public String defangIPaddr(String address) {
        char[] c = address.toCharArray();
        String result = "";
        for (int i = 0; i < c.length; i++) {
            if (c[i]=='.'){
                result+="[.]";
            }else {
                result+=c[i];
            }
        }
        return result;
    }
}
