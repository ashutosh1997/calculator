package com.ashutosh.calculator;

import java.util.Stack;

public class InToPos {
    private boolean isOperator(char c){
        if(c == '+' || c == '-' || c == 'x' || c =='÷' || c == '^')
            return true;
        return false;
    }

    private boolean checkPrecedence(char c1, char c2){
        if((c2 == '+' || c2 == '-') && (c1 == '+' || c1 == '-'))
            return true;
        else if((c2 == 'x' || c2 == '÷') && (c1 == '+' || c1 == '-' || c1 == 'x' || c1 == '÷'))
            return true;
        else if((c2 == '^') && (c1 == '+' || c1 == '-' || c1 == 'x' || c1 == '÷'))
            return true;
        else
            return false;
    }


    public String toPostfix(String infix)
    {
        String postfix = "";
        Stack<Character> s = new Stack<>();
        s.push('#');  //symbol to denote end of stack

        for(int i = 0; i < infix.length(); i++)
        {
            char inputSymbol = infix.charAt(i);  //symbol to be processed
            if(isOperator(inputSymbol))
            {
                if(i==0)
                    postfix += inputSymbol;
                else if(!isOperator(infix.charAt(i-1)))
                {
                    if(postfix.charAt(postfix.length()-1)!=',')
                        postfix+=",";
                    while (checkPrecedence(inputSymbol, s.peek()))
                        postfix += s.pop() + ",";
                    s.push(inputSymbol);
                }
                else postfix += inputSymbol;
            }
            else if(inputSymbol == '(')
                s.push(inputSymbol);  //push if left parenthesis
            else if(inputSymbol == ')')
            {
                //repeatedly pops if right parenthesis until left parenthesis is found
                while(s.peek() != '(')
                    postfix += ","+s.pop();
                s.pop();
            }
            else
                postfix += inputSymbol;
        }

        //pops all elements of stack left
        while(s.peek() != '#')
        {
            if(postfix.charAt(postfix.length()-1)!=',')
                postfix += ","+s.pop();
            else
                postfix += s.pop();
        }

        return postfix;
    }

}

