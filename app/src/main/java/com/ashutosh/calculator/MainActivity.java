package com.ashutosh.calculator;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.style.ForegroundColorSpan;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.math.BigDecimal;


public class MainActivity extends AppCompatActivity {

    static String s="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Button advanced = (Button) findViewById(R.id.advanced);
        //Button basic = (Button) findViewById(R.id.basic);
        Button orient = (Button) findViewById(R.id.orient);
        Button one = (Button)findViewById(R.id.one);
        Button two = (Button)findViewById(R.id.two);
        Button three = (Button)findViewById(R.id.three);
        Button four = (Button)findViewById(R.id.four);
        Button five = (Button)findViewById(R.id.five);
        Button six = (Button)findViewById(R.id.six);
        Button seven = (Button)findViewById(R.id.seven);
        Button eight = (Button)findViewById(R.id.eight);
        Button nine = (Button)findViewById(R.id.nine);
        Button zero = (Button)findViewById(R.id.zero);
        Button dot = (Button)findViewById(R.id.dot);
        Button equal = (Button)findViewById(R.id.equal);
        Button plus = (Button)findViewById(R.id.plus);
        Button minus = (Button)findViewById(R.id.minus);
        Button multiply = (Button)findViewById(R.id.multiply);
        Button divide = (Button)findViewById(R.id.divide);
        Button square = (Button)findViewById(R.id.square);
        Button bopen = (Button)findViewById(R.id.bopen);
        Button bclose = (Button)findViewById(R.id.bclose);
        Button root = (Button)findViewById(R.id.root);
        Button sin = (Button)findViewById(R.id.sin);
        Button cos = (Button)findViewById(R.id.cos);
        Button tan = (Button)findViewById(R.id.tan);
        Button ln = (Button)findViewById(R.id.ln);
        Button log = (Button)findViewById(R.id.log);
        Button exp = (Button)findViewById(R.id.exp);
        Button clear = (Button)findViewById(R.id.clear);
        EditText click = (EditText)findViewById(R.id.display);

        /*.............................................*/
        /*             Potrait Layout*/
        /*.............................................*/
        try{
            click.setOnLongClickListener(new EditText.OnLongClickListener(){
                @Override
                public boolean onLongClick(View v) {
                    GridLayout glayout = (GridLayout) findViewById(R.id.glayout);
                    if (glayout.getVisibility()==View.VISIBLE) {
                        EditText display = (EditText) findViewById(R.id.display);
                        glayout.setVisibility(View.GONE);
                        display.setLayoutParams(new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT));
                    }
                    else {
                        EditText display = (EditText) findViewById(R.id.display);
                        glayout.setVisibility(View.VISIBLE);
                        final float scale = getResources().getDisplayMetrics().density;
                        int pixels1 = (int) (175 * scale + 0.5f),pixels2 = (int) (75 * scale + 0.5f);
                        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT)
                            display.setLayoutParams(new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,pixels1));
                        else
                            display.setLayoutParams(new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,pixels2));
                    }
                    return true;
                }
            });

            orient.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT)
                        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE);
                    else
                        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR_PORTRAIT);
                }

            });

            bopen.setOnClickListener(new Button.OnClickListener() {
                public void onClick(View v) {
                    EditText display = (EditText) findViewById(R.id.display);
                    s = s + "(";
                    display.setText(s);
                    display.setSelection(display.getText().length());
                }
            });
            bclose.setOnClickListener(new Button.OnClickListener() {
                public void onClick(View v) {
                    EditText display = (EditText) findViewById(R.id.display);
                    s = s + ")";
                    display.setText(s);
                    display.setSelection(display.getText().length());
                }
            });
            zero.setOnClickListener(new Button.OnClickListener() {
                public void onClick(View v) {
                    EditText display = (EditText) findViewById(R.id.display);
                    s = s + "0";
                    display.setText(s);
                    display.setSelection(display.getText().length());
                }
            });
            one.setOnClickListener(new Button.OnClickListener() {
                public void onClick(View v) {
                    EditText display = (EditText) findViewById(R.id.display);
                    s = s + "1";
                    display.setText(s);
                    display.setSelection(display.getText().length());
                }
            });
            two.setOnClickListener(new Button.OnClickListener() {
                public void onClick(View v) {
                    EditText display = (EditText) findViewById(R.id.display);
                    s = s + "2";
                    display.setText(s);
                    display.setSelection(display.getText().length());
                }
            });
            three.setOnClickListener(new Button.OnClickListener() {
                public void onClick(View v) {
                    EditText display = (EditText) findViewById(R.id.display);
                    s = s + "3";
                    display.setText(s);
                    display.setSelection(display.getText().length());
                }
            });
            four.setOnClickListener(new Button.OnClickListener() {
                public void onClick(View v) {
                    EditText display = (EditText) findViewById(R.id.display);
                    s = s + "4";
                    display.setText(s);
                    display.setSelection(display.getText().length());
                }
            });
            five.setOnClickListener(new Button.OnClickListener() {
                public void onClick(View v) {
                    EditText display = (EditText) findViewById(R.id.display);
                    s = s + "5";
                    display.setText(s);
                    display.setSelection(display.getText().length());
                }
            });
            six.setOnClickListener(new Button.OnClickListener() {
                public void onClick(View v) {
                    EditText display = (EditText) findViewById(R.id.display);
                    s = s + "6";
                    display.setText(s);
                    display.setSelection(display.getText().length());
                }
            });
            seven.setOnClickListener(new Button.OnClickListener() {
                public void onClick(View v) {
                    EditText display = (EditText) findViewById(R.id.display);
                    s = s + "7";
                    display.setText(s);
                    display.setSelection(display.getText().length());
                }
            });
            eight.setOnClickListener(new Button.OnClickListener() {
                public void onClick(View v) {
                    EditText display = (EditText) findViewById(R.id.display);
                    s = s + "8";
                    display.setText(s);
                    display.setSelection(display.getText().length());
                }
            });
            nine.setOnClickListener(new Button.OnClickListener() {
                public void onClick(View v) {
                    EditText display = (EditText) findViewById(R.id.display);
                    s = s + "9";
                    display.setText(s);
                    display.setSelection(display.getText().length());
                }
            });
            plus.setOnClickListener(new Button.OnClickListener() {
                public void onClick(View v) {
                    EditText display = (EditText) findViewById(R.id.display);
                    if (s.length()==0) {
                        display.setText("0");
                    }
                    else if (s.charAt(s.length()-1)=='-' || s.charAt(s.length()-1)=='x' || s.charAt(s.length()-1)=='÷'){
                        s = s.substring(0, s.length() - 1);
                        s = s + "+";
                        if (s.length()>1 && (s.charAt(s.length()-2)=='x' || s.charAt(s.length()-2)=='÷')){
                            s = s.substring(0, s.length() - 2);
                            s = s + "+";
                        }
                        display.setText(s);
                    }
                    else if(s.charAt(s.length()-1)!='+'  && s.charAt(s.length()-1)!='x' && s.charAt(s.length()-1)!='÷') {
                        s = s + "+";
                        display.setText(s);
                    }
                    display.setSelection(display.getText().length());
                }
            });
            minus.setOnClickListener(new Button.OnClickListener() {
                public void onClick(View v) {
                    EditText display = (EditText) findViewById(R.id.display);
                    if (s.length()==0) {
                        s = s + "-";
                    }
                    else if (s.charAt(s.length()-1)=='+'){
                        s = s.substring(0, s.length() - 1);
                        s = s + "-";
                    }
                    else if(s.charAt(s.length()-1)!='-') {
                        s = s + "-";
                    }
                    display.setText(s);
                    display.setSelection(display.getText().length());
                }
            });
            multiply.setOnClickListener(new Button.OnClickListener() {
                public void onClick(View v) {
                    EditText display = (EditText) findViewById(R.id.display);
                    if (s.length()==0) {
                        display.setText("0");
                    }
                    else if ((s.charAt(s.length()-1)=='+' || s.charAt(s.length()-1)=='-' || s.charAt(s.length()-1)=='÷')
                            && (Character.isDigit(s.charAt(0))||s.charAt(0)=='(')){
                        s = s.substring(0, s.length() - 1);
                        s = s + "x";
                        if (s.charAt(s.length()-2)=='x' || s.charAt(s.length()-2)=='÷'){
                            s = s.substring(0, s.length() - 2);
                            s = s + "x";
                        }
                        display.setText(s);
                    }
                    else if(s.charAt(s.length()-1)!='x' && s.charAt(s.length()-1)!='(' && (Character.isDigit(s.charAt(0))||s.charAt(0)=='(')) {
                        s = s + "x";
                        display.setText(s);
                    }
                    else if(Character.isDigit(s.charAt(s.length()-1)) && (s.charAt(0)=='+' || s.charAt(0)=='-')) {
                        s = s + "x";
                        display.setText(s);
                    }
                    display.setSelection(display.getText().length());
                }
            });
            divide.setOnClickListener(new Button.OnClickListener() {
                public void onClick(View v) {
                    EditText display = (EditText) findViewById(R.id.display);
                    if (s.length()==0) {
                        display.setText("0");
                    }
                    else if ((s.charAt(s.length()-1)=='+' || s.charAt(s.length()-1)=='-' || s.charAt(s.length()-1)=='x')
                            && (Character.isDigit(s.charAt(0))||s.charAt(0)=='(')){
                        s = s.substring(0, s.length() - 1);
                        s = s + "÷";
                        if (s.charAt(s.length()-2)=='x' || s.charAt(s.length()-2)=='÷'){
                            s = s.substring(0, s.length() - 2);
                            s = s + "÷";
                        }
                        display.setText(s);
                    }
                    else if(s.charAt(s.length()-1)!='÷' && s.charAt(s.length()-1)!='(' && (Character.isDigit(s.charAt(0))||s.charAt(0)=='(')) {
                        s = s + "÷";
                        display.setText(s);
                    }
                    else if(Character.isDigit(s.charAt(s.length()-1)) && (s.charAt(0)=='+' || s.charAt(0)=='-')) {
                        s = s + "÷";
                        display.setText(s);
                    }
                    display.setSelection(display.getText().length());
                }
            });
            dot.setOnClickListener(new Button.OnClickListener() {
                public void onClick(View v) {
                    EditText display = (EditText) findViewById(R.id.display);
                    if (s.length()==0) {
                        s = s + "0.";
                    }
                    else {
                        int i=s.length()-1;
                        int count=0;
                        while(i>0 && Character.isDigit(s.charAt(i)))
                        {
                            i--;
                        }
                        if (s.charAt(i)!='.')
                        s = s + ".";
                    }
                    display.setText(s);
                    display.setSelection(display.getText().length());
                }
            });
            clear.setOnClickListener(new Button.OnClickListener() {
                public void onClick(View v) {
                    EditText display = (EditText) findViewById(R.id.display);
                    if (s.length() > 1) {
                        s = s.substring(0, s.length() - 1);
                        display.setText(s);
                        display.setSelection(display.getText().length());
                    }
                    else if (s.length()==1) {
                        s = s.substring(0, s.length() - 1);
                        display.setText("0");
                    }
                    else {
                        display.setText("0");
                    }

                }
            });
            clear.setOnLongClickListener(new Button.OnLongClickListener() {
                public boolean onLongClick(View v) {
                    EditText display = (EditText) findViewById(R.id.display);
                    s="";
                    display.setText("0");
                    return true;
                }
            });
            equal.setOnClickListener(new Button.OnClickListener() {
                public void onClick(View v) {
                    EditText display = (EditText) findViewById(R.id.display);
                    String total="0";
                    /*char c;
                    String temp="0";
                    int flag=0;

                    if ((s.contains("+")||s.contains("-")||s.contains("x")||s.contains("÷")) && s.length()>0)
                    {
                        for (int i = 0; i < s.length(); i++) {
                            c = s.charAt(i);
                            if (c!='+' && c!='-' && c!='x' && c!='÷') {
                                temp = temp + c;
                                if (i==s.length()-1) {
                                    total = calculate(flag, total, temp);
                                    temp = "0";
                                }
                            }
                            else if(c=='+' || c=='-' || c=='x' || c=='÷') {
                                if(i==0) {
                                    if (c == '+') {
                                        flag = 1;
                                    } else if (c == '-') {
                                        flag = 2;
                                    } else if (c == 'x') {
                                        flag = 3;
                                    } else if (c == '÷') {
                                        flag = 4;
                                    }
                                }
                                if (i>0){
                                    total = calculate(flag, total, temp);
                                    temp = "0";
                                    if (c == '+') {
                                        flag = 1;
                                    } else if (c == '-') {
                                        flag = 2;
                                    } else if (c == 'x') {
                                        flag = 3;
                                    } else if (c == '÷') {
                                        flag = 4;
                                    }
                                }
                            }
                        }
                        display.setText(s + "\n=" + total, TextView.BufferType.SPANNABLE);
                        Spannable span = (Spannable)display.getText();
                        int start = s.length();
                        int end = start + total.length() +2;
                        span.setSpan(new ForegroundColorSpan(Color.rgb(215,120,0)), start, end, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                        if (total=="Error")
                        {
                            s="";
                        }
                        else
                        s = total;
                    }
                    */

                    InToPos p = new InToPos();
                    Evaluate eval = new Evaluate();
                    String ans="0";
                    try {
                        String post=p.toPostfix(s);
                        ans = eval.posEvaluate(post);
                        //display.setText("Postfix : "+post);
                        //display.setText("Postfix : "+post+"\n\n"+s+" = \n"+ans);
                    } catch (Exception e) {
                        ans="Error";
                        //display.setText("Error "+s.length()+e.getClass().getName());
                    }
                    display.setText(s + "\n= " + ans, TextView.BufferType.SPANNABLE);
                    Spannable span = (Spannable)display.getText();
                    int start = s.length();
                    int end = start + ans.length() +3;
                    span.setSpan(new ForegroundColorSpan(Color.rgb(215,120,0)), start, end, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                    if (ans=="Error")
                    {
                        s="";
                    }
                    else
                        s = ans;

                }
            });

            /*.............................................*/
            /*             Landscape Layout*/
            /*.............................................*/


            square.setOnClickListener(new Button.OnClickListener() {
                public void onClick(View v)
                {
                    EditText display = (EditText)findViewById((R.id.display));
                    if(s.length()==0)
                    {
                        display.setText("0");
                    }
                    else if (!s.contains("+") || !s.contains("-")|| !s.contains("x")|| !s.contains("÷"))
                    {

                        BigDecimal bd = new BigDecimal(s);
                        display.setText(s + "²\n=" + bd.multiply(bd).toString(), TextView.BufferType.SPANNABLE);
                        Spannable span = (Spannable)display.getText();
                        int start = s.length();
                        int end = start + bd.multiply(bd).toString().length() +3;
                        span.setSpan(new ForegroundColorSpan(Color.rgb(215,120,0)), start, end, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                        s = (bd.multiply(bd)).toString();
                    }
                }
            });
            root.setOnClickListener(new Button.OnClickListener() {
                public void onClick(View v)
                {
                    EditText display = (EditText)findViewById((R.id.display));
                    if(s.length()==0)
                    {
                        display.setText("0");
                    }
                    else if (!s.contains("+") || !s.contains("-")|| !s.contains("x")|| !s.contains("÷"))
                    {

                        BigDecimal bd = new BigDecimal(s);

                        display.setText("√"+s+"\n="+ sqrt(bd,100).toString(), TextView.BufferType.SPANNABLE);
                        Spannable span = (Spannable)display.getText();
                        int start = s.length()+1;
                        int end = start + sqrt(bd,100).toString().length() +2;
                        span.setSpan(new ForegroundColorSpan(Color.rgb(215,120,0)), start, end, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                        s = sqrt(bd,100).toString();
                    }
                }
            });
        }
        catch (Exception e){}
    }


    public String calculate(int flag,String total,String temp)
    {
        BigDecimal result = new BigDecimal(total);
        BigDecimal x = new BigDecimal(temp);
        try{
            if (flag == 1 || flag == 0) {
                result = result.add(x);
            } else if (flag == 2) {
                result = result.subtract(x);
            } else if (flag == 3) {
                result = result.multiply(x);
            } else if (flag == 4) {
                result = result.divide(x,15,BigDecimal.ROUND_HALF_EVEN);
            }
        }
        catch (Exception e){
            return e.getClass().getName();
            //return "Error";
            }
        return result.toString();
    }


    public static BigDecimal sqrt(BigDecimal A, final int SCALE) {
        BigDecimal x0 = new BigDecimal("0");
        BigDecimal x1 = new BigDecimal(Math.sqrt(A.doubleValue()));
        final BigDecimal TWO = BigDecimal.valueOf(2);
        while (!x0.equals(x1)) {
            x0 = x1;
            x1 = A.divide(x0, SCALE, BigDecimal.ROUND_HALF_UP);
            x1 = x1.add(x0);
            x1 = x1.divide(TWO, SCALE, BigDecimal.ROUND_HALF_UP);

        }
        return x1;
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setMessage("Do you want to Exit?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //if user pressed "yes", then he is allowed to exit from application
                //finish();
                android.os.Process.killProcess(android.os.Process.myPid());
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //if user select "No", just cancel this dialog and continue with app
                dialog.cancel();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }

}