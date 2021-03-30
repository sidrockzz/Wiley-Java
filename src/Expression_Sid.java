import java.util.Scanner;

public class Expression_Sid {
    public static boolean isAnOperator(char c) {
        switch (c) {
            case '*':
            case '/':
            case '+':
            case '-':
            case '%':
                return true;
            default:
                return false;
        }
    }
    public static boolean isANumber(char c){
        return ((int)c) >= 48 && ((int)c) <= 57;
    }

    public static boolean isValidExpression2(String expression) {
        if (isAnOperator(expression.charAt(0)) || isAnOperator(expression.charAt(expression.length() - 1))) {
            return false;
        }
        int openParenthCount = 0;
        boolean lastWasOp = false;
        boolean lastWasOpen = false;
        for (char c : expression.toCharArray()) {
            if(c == ' ') continue;
            if (c == '(') {
                openParenthCount++;
                lastWasOpen = true;
                continue;
            } else if (c == ')') {
                if (openParenthCount <= 0 || lastWasOp) {
                    return false;
                }
                openParenthCount--;
            }else if (isAnOperator(c)){
                if (lastWasOp || lastWasOpen) return false;
                lastWasOp = true;
                continue;
            }else if(!isANumber(c)){
                return false;
            }
            lastWasOp = false;
            lastWasOpen = false;
        }
        if(openParenthCount != 0) return false;
        if(lastWasOp || lastWasOpen) return false;
        return true;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(isValidExpression2(s)){
            System.out.println("Balanced");
        }
        else {
            System.out.println("Unbalances");
        }
    }
}
