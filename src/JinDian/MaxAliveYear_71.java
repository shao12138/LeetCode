package JinDian;

import java.util.Map;
import java.util.TreeMap;

public class MaxAliveYear_71 {
    public static void main(String[] args) {
        int[] birth = {1927,1954,1903,1928,1956,1929,1929,1928,1958,1902,1953,1912,1923,1937,1915,1942,1964,1954,1924,1936,1963,1950,1904,1931,1951,1953,1922,1970,1986,1947,1911,1965,1913,1920,1947,1962,1903,1905,1978,1974,1950,1921,1929,1901,1925,1929,1951,1944,1945};
        int[] death = {1987,1992,1967,1997,1963,1970,1944,1986,1997,1937,1971,1982,1980,1992,1995,1992,1991,1964,1985,1938,1975,1964,1975,1961,1995,1985,1946,1989,1999,1994,1956,1984,1999,1966,1950,1993,1960,1939,1990,1975,1982,1921,1964,1998,1969,1970,1965,1973,1958};
        maxAliveYear(birth, death);
    }

    public static int maxAliveYear(int[] birth, int[] death) {
        TreeMap<Integer, Integer> map = new TreeMap();
        for (int i = 0; i < birth.length; i++) {
            for (int j = birth[i]; j <= death[i]; j++) {
                map.put(j, map.getOrDefault(j, 0) + 1);
            }
        }
        int result = 0;
        int temp = 0;
        for (Map.Entry entry : map.entrySet()) {
            int value = (int) entry.getValue();
            if (value>temp){
                temp = value;
                result = (int) entry.getKey();
            }
        }
        return result;
    }
}
