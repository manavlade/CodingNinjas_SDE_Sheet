package Medium.Strings;

public class repeatedStringMatch {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder sb = new StringBuilder();
        sb.append(a);

        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {

                while (a.charAt(i) != b.charAt(j)) {
                    i++;
                }
                sb.append(a);
            }
        }
    }
}
