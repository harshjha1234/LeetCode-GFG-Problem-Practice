import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Solution {
    public String countAndSay(int n) {
        StringBuilder s = new StringBuilder("1");
        Pattern p = Pattern.compile("(.)\\1*");
        for (int i = 1; i < n; ++i) {
            Matcher m = p.matcher(s);
            StringBuilder sb = new StringBuilder();
            while (m.find())
                sb.append(m.group().length() + String.valueOf(m.group().charAt(0)));
            s = sb;
        }
        return s.toString();
    }
}