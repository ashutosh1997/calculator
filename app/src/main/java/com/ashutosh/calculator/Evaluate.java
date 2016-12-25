package com.ashutosh.calculator;

import java.math.BigDecimal;
import java.util.*;

import static com.ashutosh.calculator.MainActivity.s;

class Stack
{
    private BigDecimal a[]=new BigDecimal[s.length()];
    private int top;
    Stack()
    {
        top=0;
    }

    void push(BigDecimal v)
    {
        if(top<20)
            a[top++]=v;
    }

    BigDecimal pop()
    {
        if(top>0)
            return a[--top];
        else
        {
            return BigDecimal.valueOf(-1);
        }
    }

}

class Evaluate
{
    static String posEvaluate(String str)
    {
        BigDecimal a,b,c= new BigDecimal("0");
        String s;
        Stack s1=new Stack();

        StringTokenizer st=new StringTokenizer(str,",");
        while(st.hasMoreTokens())
        {
            s=st.nextToken();
            if(("+-x÷").contains(s))
            {
                b=s1.pop();
                a=s1.pop();
                switch(s.charAt(0))
                {
                    case '+':c=a.add(b);
                             break;

                    case '-':c=a.subtract(b);
                             break;

                    case 'x':c=a.multiply(b);
                             break;

                    case '÷':c=a.divide(b,15,BigDecimal.ROUND_HALF_EVEN);
                        break;
                }
                s1.push(c);
            }
            else
                s1.push(BigDecimal.valueOf(Long.parseLong(s)));
        }
        return String.valueOf(s1.pop());
    }
}