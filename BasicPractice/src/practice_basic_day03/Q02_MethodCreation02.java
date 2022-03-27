package practice_basic_day03;

public class Q02_MethodCreation02 {
    /*
            Problem tanımı :
            Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
            Test Data:
            input: "aabbcccccddddaaa"
            output: abcd
         */
    public static void main(String[] args) {
        String str = "aabbcccccdaaax";
        System.out.println(checkChars(str));


    }

    private static String checkChars(String str) {

        String newStr ="";
        for (int i = 0; i<=str.length()-1; i++) {
            if (str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))){
                newStr += str.charAt(i);
            } else {
                if (!newStr.contains(str.substring(i,i+1))){
                    newStr += str.charAt(i);
                }
            }
        }
        return newStr;

    }
}
