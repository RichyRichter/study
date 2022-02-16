package Stage1_1;

public class Bonus {
    public static boolean checkBoolean(boolean a, boolean b, boolean c, boolean d) {
        return ((a ? 1 : 0) + (b ? 1 : 0) + (c ? 1 : 0) + (d ? 1 : 0)) == 2;
    }
    public static boolean checkBooleanAlternative(boolean a, boolean b, boolean c, boolean d) {
        return  a ^ b && c ^ d || c ^ a && d ^ b;
    }
}
