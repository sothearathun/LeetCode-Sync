class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        // substring: a new string that is shorter than String s and is next to each other 
        // initial thought:get the length of string s then access each index with for loop
        // get the current character of String s
        // set condition for the substring: if the character i and i + 1 is different, add i + 1 to the subS with i, but if i and i + 1 is the same, then remove character i, then proceed to add i + 1 in the subS

        String subStringOfS = "";
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++){

            // access current index character
            char currentChar = s.charAt(i);

            if (subStringOfS.contains(String.valueOf(currentChar))){
                // get the value of the character in subString that is equal to currentChar value
                int subStringChar = subStringOfS.indexOf(currentChar);
                // below means remove the index that is equal to currentChar and any indexes that is before it, and basically only get the whole string of the index + 1 to be in subString
                subStringOfS = subStringOfS.substring(subStringChar + 1);
            }
            
            // if it is not true to the above conditions
            subStringOfS = subStringOfS + currentChar;

            // get the maxlength
            if (subStringOfS.length() > maxLength){
                maxLength = subStringOfS.length();
            }
        }
        return maxLength;

    }
}