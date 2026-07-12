public class CheckPangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        boolean[] seen = new boolean[26];
        if (sentence.length()<26) {
            System.out.println("Not Pangram.");

        } else {
            for (int i = 0; i < sentence.length(); i++) {
                char c = sentence.charAt(i);
                int index = c-'a';
                seen[index]=true;
            }

            for (int i = 0; i < seen.length; i++) {
                if (!seen[i]) {
                    System.out.println("not paragram");
                    return;


                }

            }
            System.out.println("pangram");
        }

    }
}
