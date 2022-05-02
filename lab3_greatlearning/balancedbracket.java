package lab3_greatlearning;


import java.util.Stack;
public class balancedbracket {
static boolean areBracketsBalanced(String expr)
{
   
   Stack<Character > stack=new  Stack<Character>();
  
    for (int i = 0; i < expr.length(); i++)
    {
        char character = expr.charAt(i);

        if (character == '(' || character == '[' || character == '{')
        {
            
            stack.push(character);
            continue;
        }

        if (stack.isEmpty())
            return false;
        char check;
        switch (character ) {
        case ')':
            check = stack.pop();
            if (check == '{' || check == '[')
                return false;
            break;

        case '}':
            check = stack.pop();
            if (check == '(' || check == '[')
                return false;
            break;

        case ']':
            check = stack.pop();
            if (check == '(' || check == '{')
                return false;
            break;
        }
    }

  
    return (stack.isEmpty());
}


public static void main(String[] args)
{
    String expr = "([}])";

    
    if (areBracketsBalanced(expr))
        System.out.println("Balanced ");
    else
        System.out.println("Not Balanced ");
}
}
