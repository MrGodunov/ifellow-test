public class TaskTwo {

//    Написать программу, которая должна найти и вывести
//    повторяющийся символ в слове «Hello»

    public static void main(String[] args) {
        String str = "Hello";
        String strLow = str.toLowerCase();
        String result = "";
        char[] chars = strLow.toCharArray();

        for (int i = 0; i <= strLow.length(); i++) {
            for (int j = i + 1; j < strLow.length(); j++) {
                if (chars[i] == chars[j]) {
                    result = result + chars[i];
                }
            }
        }

        System.out.println("The string is: " + str);
        System.out.println("Dublicate character: " + result);
    }
}

//    Вариант, который проверяет только соседние буквы
//
//    public static void main(String[] args) {
//        String str = "Hello";
//        String result = "";
//        char[] chars = str.toCharArray();
//
//        for (int i = 1; i < str.length(); i++) {
//            if (chars[i] == chars[i - 1]) {
//                result = result + chars[i];
//            }
//        }
//
//        System.out.println("The string is: " + str);
//        System.out.println("Dublicate character: " + result);
//    }
//}
