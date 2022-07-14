public class BuildString {

    static StringBuilder anonymize(String notAnon) {
        StringBuilder sb = new StringBuilder();
        sb.append(notAnon.charAt(0));

        for (int j = 1; j < notAnon.length(); j++) {
            if (j < notAnon.length() - 3) {
                sb.append("*");
            } else {
                sb.append(notAnon.charAt(j));
            }
        }
        return sb;
    }
}
