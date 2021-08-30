package exo.rotation;

public class Main {
    public static void main(String[] args) {
        System.out.println(isRotation("bonjour", "jourbon")); // true
        System.out.println(isRotation("abc123", "c123ab")); // true
        System.out.println(isRotation("chaise", "seicha")); // false
        System.out.println(isRotation("123456789", "891234567")); // true
    }

    public static boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        return (s1+s1).contains(s2);
    }
}


