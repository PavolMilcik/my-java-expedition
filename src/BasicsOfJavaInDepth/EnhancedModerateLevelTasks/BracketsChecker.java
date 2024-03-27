package BasicsOfJavaInDepth.EnhancedModerateLevelTasks;


public class BracketsChecker {

    public static boolean validBrackets(String brackets) {

        char currentBrackets;
        int openBracketsA = 0;
        int closeBracketsA = 0;
        int openBracketsB = 0;
        int closeBracketsB = 0;
        int openBracketsC = 0;
        int closeBracketsC = 0;

        for (int i = 0; i < brackets.length(); i++) {
            currentBrackets = brackets.charAt(i);

            if (currentBrackets == '(' || currentBrackets == ')') {
                if (currentBrackets == '(') {
                    openBracketsA++;
                } else {
                    closeBracketsA++;
                }
            }

            if (currentBrackets == '[' || currentBrackets == ']') {
                if (currentBrackets == '[') {
                    openBracketsB++;
                } else {
                    closeBracketsB++;
                }
            }

            if (currentBrackets == '{' || currentBrackets == '}') {
                if (currentBrackets == '{') {
                    openBracketsC++;
                } else {
                    closeBracketsC++;
                }
            }

            if (openBracketsA < closeBracketsA || openBracketsB < closeBracketsB ||
                    openBracketsC < closeBracketsC) {
                return false;
            }
        }

        return openBracketsA == closeBracketsA && closeBracketsB == openBracketsB &&
                closeBracketsC == openBracketsC;
    }


    public static void main(String[] args) {
        System.out.println("\n1. ------------- Check that the brackets are correctly closed. ---------");

        System.out.println("() - " + validBrackets("()"));              // true
        System.out.println("()() - " + validBrackets("()()"));          // true
        System.out.println("(()) - " + validBrackets("(())"));          // true
        System.out.println("(()()) - " + validBrackets("(()())"));      // true

        System.out.println("\n)( - " + validBrackets(")("));            // false
        System.out.println("()) - " + validBrackets("())"));            // false
        System.out.println("((() - " + validBrackets("((()"));          // false
        System.out.println("((() - " + validBrackets("())(()"));        // false
        System.out.println("(()))) - " + validBrackets("(())))"));      // false

        System.out.println("\n2. ------------- Check that the brackets are correctly closed. ---------");

        System.out.println("[{]} - " + validBrackets("[{]}"));                                 // true
        System.out.println("'' - " + validBrackets(""));                                       // true
        System.out.println("([][]{()}) - " + validBrackets("([][]{()})"));                     // true
        System.out.println("({([()()])}) - " + validBrackets("({([()()])})"));                 // true
        System.out.println("({([()()])})()[][{]} - " + validBrackets("({([()()])})()[][{]}")); // true

        System.out.println("\n}{ - " + validBrackets("}{"));                         // false
        System.out.println("{) - " + validBrackets("{)"));                           // false
        System.out.println("[}]{ - " + validBrackets("[}]{"));                       // false
        System.out.println("[{]{ - " + validBrackets("[{]{"));                       // false
        System.out.println("[ - " + validBrackets("["));                             // false
        System.out.println("[) - " + validBrackets("[)"));                           // false
        System.out.println("({([()()])})) - " + validBrackets("({([()()])}))"));     // false
    }
}
