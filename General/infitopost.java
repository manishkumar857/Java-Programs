package General;

import java.util.ArrayDeque;

public class infitopost {
    public static void main(String[] args) {
        
    }
    public static String Infitopostexp(String infix)
    {
        String postFix=" ";
        ArrayDeque<String> stack = new ArrayDeque<>();
        for(int i=0;i<infix.length();i++)
        {
            char ch = infix.charAt(i);
            if(isOperator(ch))
            {


            }else if(ch =='(')
            {
                stack.push(String.valueOf(ch));

            }else if(ch == ')')
            {

            }
        }
    }
    public static boolean isOperator(char ch){
        return (ch=='+'|| ch =='-'||ch=='*'|| ch == '/');
        

    }
}
