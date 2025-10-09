import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String password = scanner.nextLine();

            if (password.equals("end")) return;

            boolean isContainOneVowel = false;
            for (int i = 0; i < password.length(); i++) {
                if (isVowel(password.charAt(i))) {
                    isContainOneVowel = true;
                }
            }

            boolean isSequence = false;
            int vowelSequenceCount = 0;
            int conSequenceCount = 0;
            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);

                if (isVowel(c)) {
                    vowelSequenceCount++;
                    conSequenceCount = 0;
                } else {
                    vowelSequenceCount = 0;
                    conSequenceCount++;
                }

                if (vowelSequenceCount >= 3 ||  conSequenceCount >= 3) {
                    isSequence = true;
                    break;
                }
            }

            boolean isSequence2 = false;
            for (int i = 1; i < password.length(); i++) {
                char previous = password.charAt(i-1);
                char present = password.charAt(i);

                if (present == previous) {
                    if (present == 'o' || present == 'e') {

                    } else {
                        isSequence2 = true;
                        break;
                    }
                }
            }

            if (isContainOneVowel && !isSequence &&  !isSequence2) {
                System.out.println("<" + password + ">" + " is acceptable.");
            } else {
                System.out.println("<" + password + ">" + " is not acceptable.");
            }

        }

    }

    public static boolean isVowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' ||  c == 'u');
    }
}
