//program to check an integer repeates an values or not

import java.util.HashSet;

public class _1_ {

    // first approach
    static boolean checkRepeat(int num[]) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    return true;

                }
            }
        }
        return false;

    }

    // second approach
    static boolean checkRepeat2(int num[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < num.length; i++) {
            if (set.contains(num[i])) {
                return true;
            } else {
                set.add(num[i]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] input = { 1, 2, 3, 1 };
        int[] input2 = { 1, 2, 3, 4 };
        int[] input3 = { 1, 1, 1, 3, 3, 4, 3, 2, };
        if (checkRepeat2(input)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        if (checkRepeat2(input2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        if (checkRepeat2(input3)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
