class Solution {
    public boolean isPalindrome(int x) {
        // use the reverse half method
        // set condition for false palindrome
        if (x % 10 == 0 && x != 0){
            return false;
        }

        // create a variable to store the revered half number
        int reversedHalf = 0;

        // start getting value to reversedHalf variable
        // get the last digit value of x first then, then append it to reversedHalf
        // then remove the last digit, by usign division, then continue to get more digits to reversedHalf
        while (x > reversedHalf){
            reversedHalf = (reversedHalf * 10) + (x % 10); //get the last digit
            x = x / 10; //remove the last digit
        }

        // for odd digits number, ignore the middle digit by (reversedHalf / 10)
        return x == reversedHalf || x == reversedHalf/10;
    }
}