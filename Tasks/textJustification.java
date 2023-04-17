package Tasks;

import java.util.ArrayList;
import java.util.List;

public class textJustification {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int i = 0, n = words.length;
        
        while (i < n) {
            int j = i, len = 0;
            while (j < n && len + words[j].length() + (j - i) <= maxWidth) {
                len += words[j].length();
                j++;
            }
            
            StringBuilder sb = new StringBuilder();
            int spaces = maxWidth - len;
            int gaps = j - i - 1;
            
            if (gaps == 0 || j == n) { // left-justified
                for (int k = i; k < j; k++) {
                    sb.append(words[k]);
                    if (k < j - 1) {
                        sb.append(" ");
                    }
                }
                while (sb.length() < maxWidth) {
                    sb.append(" ");
                }
            } else { // fully-justified
                int spacesPerGap = spaces / gaps;
                int extraSpaces = spaces % gaps;
                for (int k = i; k < j; k++) {
                    sb.append(words[k]);
                    if (k < j - 1) {
                        int numSpaces = spacesPerGap + (extraSpaces-- > 0 ? 1 : 0);
                        for (int s = 0; s < numSpaces; s++) {
                            sb.append(" ");
                        }
                    }
                }
            }
            
            result.add(sb.toString());
            i = j;
        }
        
        return result;
    }
    
}
    
