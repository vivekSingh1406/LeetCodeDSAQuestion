package TwoPointers;

public class ReverseString {

    public static String isReversString(String s) {

        char[] charArray = s.toCharArray();
        int start = 0;
        int end = charArray.length-1;

        while (start < end){
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }

        return String.valueOf(charArray);
    }

    public static void main(String[] args) {

        System.out.println(isReversString("viveksingh"));
    }
}
