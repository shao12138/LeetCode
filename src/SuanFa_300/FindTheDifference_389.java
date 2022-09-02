package SuanFa_300;

import java.util.Arrays;

public class FindTheDifference_389 {
    public static void main(String[] args) {
        String s = "ihwrdisrhgxwbfevrxbtzgsywhnzleueadikniwyuasflpsviobwvsmydmyzppqjlmzakpbnouyttdigkcdzypvcqxbttmblttehgjlnpjwpzoprntifysfatjboasottnkpyyvmdcafpjicfpgmbwqdsaxdmmdmupnwhkpxixpdwmczntqtushemvavofszomtsrafzmxctpidjadwcwggdbyliqmcvuwscryfsvlvfrhfphmxvcnytbctomicwdwjjmdhmcqtnlqgixxdyjydhwnftkobotbhsgykawhtvnkxoykwkgvtqioqoiilergxlpuujabiug";
        String t = "gyptmtjntxlusjhbzkbgowslthwtytdnflsyfsgfytzrodatykdyvgsmvxsuemijitvodmwrrqmcabhwzyoouorfckhisjpduoxvtmttzvwmicdxsovsabmpcpppzycuwbmpihmxadmvkkwerimhgwdwdtvqwbwtetppkpkbcaifuqbenagycdqatklciaczcpglxmvfaqnwpnssdmnhcmifeyndzttvypwlgpttvhswoiijybchbvzklgngqziyaczowgwiufqyhxxdqjrxolddgnmriijopdsikqwtyhplhubrljfjanexxyfvjmudxsomnfbafntpib";
        findTheDifference(s, t);
    }

    public static char findTheDifference(String s, String t) {
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(tt);
        for (int i = 0; i < s.length(); i++) {
            if (ss[i] != tt[i]) {
                return tt[i];
            }
        }
        return tt[t.length() - 1];
    }
}
