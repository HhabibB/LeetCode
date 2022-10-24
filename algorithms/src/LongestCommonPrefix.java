import java.util.Arrays;

//Write a function to find the longest common prefix string amongst an array of strings.
//If there is no common prefix, return an empty string "".
public class LongestCommonPrefix{
    public static String longestCommonPrefix(String[] strs){
        
        StringBuilder result = new StringBuilder();

        Arrays.sort(strs);
        
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1 ].toCharArray();
        
        for (int i = 0; i < first.length && i < last.length; i++) {
            if (first[i] == last[i]) {
                result.append(first[i]);                
            }
            else
                return result.toString();
        }
        return result.toString();

    }
}

