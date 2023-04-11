package Leetcode;

//Given two binary strings a and b, return their sum as a binary string.
// sample 1 
// Input: a = "11", b = "1"
// Output: "100"

public class AddBinary {
    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry > 0) {
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
    
    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        String sum = addBinary(a, b);
        System.out.println(sum);  // Output: "100"
    }
    
}
