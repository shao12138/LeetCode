package JinDian;

public class NumberToWords_69 {
    String[] low = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    String[] mid = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    String[] high = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};


    public String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }
        return help(num);
    }

    public String help(int number) {
        String res = new String();
        if (number < 10) {
            res = low[number];
        } else if (number < 20) {
            res = mid[number % 10];
        } else if (number < 100) {
            res = high[number / 10] + " " + help(number % 10);
        } else if (number < 1000) {
            res = help(number / 100) + " Hundred " + help(number % 100);
        } else if (number < 1000000) {
            res = help(number / 1000) + " Thousand " + help(number % 1000);
        } else if (number < 1000000000) {
            res = help(number / 1000000) + " Million " + help(number % 1000000);
        } else {
            res = help(number / 1000000000) + " Billion " + help(number % 1000000000);
        }
        return res.trim();
    }
}
