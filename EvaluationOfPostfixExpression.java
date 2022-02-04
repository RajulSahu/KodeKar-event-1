package com.rajul;
import java.util.*;

public class EvaluationOfPostfixExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine();
        int ans = calculatePostfix(exp);
        System.out.println(ans);
    }
    static int calculatePostfix(String exp) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                int a = stack.pop();
                int b = stack.pop();
                if(ch == '+') stack.push(b+a);
                else if(ch == '-') stack.push(b-a);
                else if(ch == '*') stack.push(b*a);
                else stack.push(b/a);
            }
            else{
                stack.push(ch-48);
            }
        }
        return stack.pop();
    }
}
