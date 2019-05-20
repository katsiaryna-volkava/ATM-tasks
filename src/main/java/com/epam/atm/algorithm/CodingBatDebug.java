package com.epam.atm.algorithm;

public class CodingBatDebug {

    /*  public String stringBits(String str) {
          String result = "";
          for (int i = 0; i < str.length(); i++) {
              if (str.charAt(i) % 2 == 0 ) {
                  result += str.charAt(i);
              }
          }
          return result;
      }
  */
    public static void main (String [] args) {
        int [] nums = new int[] {9,2,3};
            int arrayLength = 4;
            if (nums.length < 4) {
                arrayLength = nums.length;
            }

            for (int i = 0; i < arrayLength; i++) {
                if (nums[i] == 9) {
                    System.out.println("true");
                }
                else System.out.println("false");
            }
    }
}
