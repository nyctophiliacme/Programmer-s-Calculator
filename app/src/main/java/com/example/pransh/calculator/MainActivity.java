package com.example.pransh.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
    Button plus,minus,mult,div,mod,pow,fact,equal,point,clr;
    Button and,or,xor,not,prev,del;
    TextView display;
    double a,b,ans;
    long i,l,flag1,flag2,sflag1,sflag2,j;
    long spflag1,spflag2,spflagt1,spflagt2;
    String s,s3,t1,t2,dsp,store;
    char save,save2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s="";t1="";t2="";store="";
        plus=(Button)findViewById(R.id.buttonPlus);
        minus=(Button)findViewById(R.id.buttonMinus);
        mult=(Button)findViewById(R.id.buttonMult);
        div=(Button)findViewById(R.id.buttonDiv);
        mod=(Button)findViewById(R.id.buttonModulo);
        pow=(Button)findViewById(R.id.buttonPow);
        fact=(Button)findViewById(R.id.buttonFact);
        equal=(Button)findViewById(R.id.buttonEquals);
        point=(Button)findViewById(R.id.buttonPoint);
        clr=(Button)findViewById(R.id.buttonClr);

        and=(Button)findViewById(R.id.buttonAnd);
        or=(Button)findViewById(R.id.buttonOr);
        xor=(Button)findViewById(R.id.buttonXor);
        not=(Button)findViewById(R.id.buttonNot);
        prev=(Button)findViewById(R.id.buttonAns);
        del=(Button)findViewById(R.id.buttonDel);

        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b5=(Button)findViewById(R.id.button5);
        b6=(Button)findViewById(R.id.button6);
        b7=(Button)findViewById(R.id.button7);
        b8=(Button)findViewById(R.id.button8);
        b9=(Button)findViewById(R.id.button9);
        b0=(Button)findViewById(R.id.button0);
        display=(TextView)findViewById(R.id.display);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s3="+";s+=s3;display.setText(s);
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s3="-";s+=s3;display.setText(s);
            }
        });
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s3="*";s+=s3;display.setText(s);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s3="/";s+=s3;display.setText(s);
            }
        });
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s3="%";s+=s3;display.setText(s);
            }
        });
        pow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {s3="p";s+=s3;display.setText(s);
            }
        });
        fact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {s3="!";s+=s3;display.setText(s);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {s3="1";s+=s3;display.setText(s);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {s3="2";s+=s3;display.setText(s);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {s3="3";s+=s3;display.setText(s);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {s3="4";s+=s3;display.setText(s);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {s3="5";s+=s3;display.setText(s);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {s3="6";s+=s3;display.setText(s);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {s3="7";s+=s3;display.setText(s);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {s3="8";s+=s3;display.setText(s);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {s3="9";s+=s3;display.setText(s);
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {s3="0";s+=s3;display.setText(s);
            }
        });
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {s3=".";s+=s3;display.setText(s);
            }
        });

        and.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {s3="&";s+=s3;display.setText(s);
            }
        });
        or.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {s3="|";s+=s3;display.setText(s);
            }
        });
        xor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {s3="^";s+=s3;display.setText(s);
            }
        });
        not.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {s3="~";s+=s3;display.setText(s);
            }
        });
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {s3=store;s+=s3;display.setText(s);
            }
        });

        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s3 = "";
                s = "";
                display.setText(s);
            }
        });
        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //s3="0";s+=s3;display.setText(s);
                if(s!=null&&s.length()>0) {
                    s = s.substring(0, s.length() - 1);
                    display.setText(s);
                }
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    l = s.length();
                    char c;i=0;j=i;spflag1=0;flag1=0;sflag1=0;save2='\0';spflagt1=0;
                    if((s.charAt((int) j)=='-'&&s.charAt((int) (j+1))=='~')||(s.charAt((int) j)=='~'&&s.charAt((int) (j+1))=='-'))
                    {
                        spflag1=1;
                        if(s.charAt((int) j)=='-') spflagt1=1;else spflagt1=2;
                        i+=2;
                    }
                    else if(s.charAt((int) j)=='-'||s.charAt((int) j)=='~')
                    {
                        i++;flag1=1;if(s.charAt((int) j)=='-') sflag1=1; else sflag1=2;
                    }
                    //System.out.println(spflag1+spflagt1);
                    for (; i < l; i++) {
                        c = s.charAt((int) i);
                        if ((c > 47 && c < 58) || c == 46) {
                            t1 += c;
                        } else {
                            save2 = c;
                            break;
                        }
                    }
                    if(sflag1==1&&save2=='!') throw new Exception();
                    if(save2=='!')
                    {
                        a = Double.parseDouble(t1);
                        if((long)a !=a) throw new Exception();
                        long fact=1;
                        for( j=1;j<=a;j++)
                        {
                            fact*=j;
                        }
                        t1 = String.valueOf(fact);
                        i++;
                        if(i!=l){
                            save2=s.charAt((int) i);
                        }
                    }
                    dsp = t1;
                    while (i < l) {
                        i++;
                        save = save2;save2='\0';
                        flag2=0;sflag2=0;
                        j=i;
                        spflag2=0;spflagt2=0;
                        if((s.charAt((int) j)=='-'&&s.charAt((int) (j+1))=='~')||(s.charAt((int) j)=='~'&&s.charAt((int) (j+1))=='-'))
                        {
                            spflag2=1;
                            if(s.charAt((int) j)=='-') spflagt1=2;else spflagt2=2;
                            i+=2;
                        }
                        else if(s.charAt((int) j)=='-'||s.charAt((int) j)=='~')
                        {
                            i++;flag2=1;if(s.charAt((int) j)=='-') sflag2=1; else sflag2=2;
                        }
                        for (; i < l; i++) {
                            c = s.charAt((int) i);
                            if ((c > 47 && c < 58) || c == 46) {
                                t2 += c;
                            } else {
                                save2 = c;
                                break;
                            }
                        }
                        if(sflag2==1&&save2=='!') throw new Exception();
                        if(save2=='!')
                        {
                            a = Double.parseDouble(t2);
                            if((long)a !=a) throw new Exception();
                            long fact=1;
                            for( j=1;j<=a;j++)
                            {
                                fact*=j;
                            }
                            t2 = String.valueOf(fact);
                            i++;
                            if(i!=l){
                                save2=s.charAt((int) i);
                            }
                        }
                        a = Double.parseDouble(t1);
                        if(spflag1==1)
                        {
                            if(spflagt1==1)
                            {
                                if((long)a!=a) throw new Exception();
                                else a=~(long)a;
                                a=-a;
                            }
                            else
                            {
                                a=-a;
                                if((long)a!=a) throw new Exception();
                                else a=~(long)a;
                            }
                            spflag1=0;spflagt1=0;
                        }
                        else if(flag1==1)
                        {
                            if(sflag1==1)
                            {
                                a=-a;
                            }
                            else
                            {
                                if((long)a!=a) throw new Exception();
                                else a = ~(long)a;
                            }
                            flag1=0;sflag1=0;
                        }
                        b = Double.parseDouble(t2);
                        if(spflag2==1)
                        {
                            if(spflagt2==1)
                            {
                                if((long)b!=b) throw new Exception();
                                else b=~(long)b;
                                b=-b;
                            }
                            else
                            {
                                b=-b;
                                if((long)b!=b) throw new Exception();
                                else b=~(long)b;
                            }
                            spflag2=0;spflagt2=0;
                        }
                        else if(flag2==1)
                        {
                            if(sflag2==1)
                            {
                                b=-b;
                            }
                            else
                            {
                                if((long)b!=b) throw new Exception();
                                else b=~(long)b;
                            }
                            flag2=0;sflag2=0;
                        }
                        if(save=='&'||save=='|'||save=='^')
                        {
                            if((long)a!=a||(long)b!=b) throw new Exception();
                        }
                        switch (save) {
                            case '+':
                                ans = a + b;
                                break;
                            case '-':
                                ans = a - b;
                                break;
                            case '*':
                                ans = a * b;
                                break;
                            case '/':
                                ans = a / b;
                                break;
                            case 'p':
                                ans = Math.pow(a, b);
                                break;
                            case '%':
                                ans = a % b;
                                break;
                            case '&':
                                ans=(long)a&(long)b;
                                break;
                            case '|':
                                ans=(long)a|(long)b;
                                break;
                            case '^':
                                ans=(long)a^(long)b;
                                break;
                            default:throw new Exception();

                        }
                        DecimalFormat df=new DecimalFormat("#.##########");
                        df.setRoundingMode(RoundingMode.CEILING);
                        dsp=df.format(ans);
                        //dsp=BigDecimal.valueOf(ans).setScale(10, BigDecimal.ROUND_HALF_UP).toPlainString();
                        t1 = dsp;
                        t2 = "";
                    }
                    if(spflag1==1)
                    {
                        a=Double.parseDouble(dsp);
                        if(spflagt1==1)
                        {
                            if((long)a!=a) throw new Exception();
                            else a=~(long)a;
                            a=-a;
                        }
                        else
                        {
                            a=-a;
                            if((long)a!=a) throw new Exception();
                            else a=~(long)a;
                        }
                        DecimalFormat df=new DecimalFormat("#.##########");
                        df.setRoundingMode(RoundingMode.CEILING);
                        dsp=df.format(a);
                        spflag1=0;spflagt1=0;
                    }
                    else if(flag1==1)
                    {
                        a=Double.parseDouble(dsp);
                        if(sflag1==1)
                        {
                            a=-a;
                        }
                        else
                        {
                            if((long)a!=a) throw new Exception();
                            else a=~(long)a;
                        }
                        DecimalFormat df=new DecimalFormat("#.##########");
                        df.setRoundingMode(RoundingMode.CEILING);
                        dsp=df.format(a);
                        flag1=0;sflag1=0;
                    }
                    display.setText(dsp);
                    store=dsp;
                    s = "";
                    t1 = "";
                    t2 = "";
                }
                catch (Exception e)
                {
                    display.setText("Error...");s="";t1="";t2="";
                }
            }
        });
    }
}
