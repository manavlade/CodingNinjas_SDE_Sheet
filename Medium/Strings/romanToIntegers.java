package Medium.Strings;

public class romanToIntegers {
    /*
     * Question
     * Roman numerals are represented by seven different symbols: I, V, X, L, C, D
     * and M.
     * Symbol Value
     * I 1
     * V 5
     * X 10
     * L 50
     * C 100
     * D 500
     * M 1000
     * For example, 2 is written as II in Roman numeral, just two ones added
     * together. 12 is written as XII, which is simply X + II. The number 27 is
     * written as XXVII, which is XX + V + II.
     * Roman numerals are usually written largest to smallest from left to right.
     * However, the numeral for four is not IIII. Instead, the number four is
     * written as IV. Because the one is before the five we subtract it making four.
     * The same principle applies to the number nine, which is written as IX. There
     * are six instances where subtraction is used:
     * 
     * I can be placed before V (5) and X (10) to make 4 and 9.
     * X can be placed before L (50) and C (100) to make 40 and 90.
     * C can be placed before D (500) and M (1000) to make 400 and 900.
     * Given a roman numeral, convert it to an integer.
     */
    public int romanToInt(String s) {
        int romanToIntVal = 0;
        char[] ca = s.toCharArray();

        for (int i = 0; i < ca.length; i++) {
            switch (ca[i]) {
                case 'I':
                    romanToIntVal++;
                    break;

                case 'V':
                    if (i > 0 && ca[i - 1] == 'I') {
                        romanToIntVal += 3;
                    } else {
                        romanToIntVal += 5;
                    }
                    break;

                case 'X':
                    if (i > 0 && ca[i - 1] == 'I') {
                        romanToIntVal += 8;
                    } else {
                        romanToIntVal += 10;
                    }
                    break;

                case 'L':
                    if (i > 0 && ca[i - 1] == 'X') {
                        romanToIntVal += 30;
                    } else {
                        romanToIntVal += 50;
                    }
                    break;

                case 'C':
                    if (i > 0 && ca[i - 1] == 'X') {
                        romanToIntVal += 80;
                    } else {
                        romanToIntVal += 100;
                    }
                    break;

                case 'D':
                    if (i > 0 && ca[i - 1] == 'C') {
                        romanToIntVal += 300;
                    } else {
                        romanToIntVal += 500;
                    }
                    break;

                case 'M':
                    if (i > 0 && ca[i - 1] == 'C') {
                        romanToIntVal += 800;
                    } else {
                        romanToIntVal += 1000;
                    }
                    break;
            }
        }
        return romanToIntVal;
    }

}
