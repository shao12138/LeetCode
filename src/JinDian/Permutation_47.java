package JinDian;

import java.util.ArrayList;
import java.util.List;

public class Permutation_47 {
    List<String> res = new ArrayList<>();
    public String[] permutation(String s) {
        boolean[] isVisited = new boolean[s.length()];
        trackback(s,isVisited,new StringBuffer());
        String[] strs = new String[res.size()];
        for(int i=0;i<res.size();i++){
            strs[i] = res.get(i);
        }
        return strs;
    }
    public void trackback(String s,boolean[] isVisited,StringBuffer stringbuffer){
        if(stringbuffer.length()==s.length()){
            res.add(stringbuffer.toString());
            return;
        }
        for(int i=0;i<s.length();i++){
            if(isVisited[i]==false){
                stringbuffer.append(s.charAt(i));
                isVisited[i]=true;
                trackback(s,isVisited,stringbuffer);
                stringbuffer.deleteCharAt(stringbuffer.length()-1);
                isVisited[i] = false;
            }
        }
    }
}
