package itorchid.com.a32jakariaassignment3nomenclature;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10;
    TextView textView,textView1;
    int num,i;
    String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1=(Button) findViewById(R.id.bt1);
        bt2=(Button) findViewById(R.id.bt2);
        bt3=(Button) findViewById(R.id.bt3);
        bt4=(Button) findViewById(R.id.bt4);
        bt5=(Button) findViewById(R.id.bt5);
        bt6=(Button) findViewById(R.id.bt6);
        bt7=(Button) findViewById(R.id.bt7);
        bt8=(Button) findViewById(R.id.bt8);
        bt9=(Button) findViewById(R.id.bt9);
        bt10=(Button) findViewById(R.id.bt10);
        textView=(TextView) findViewById(R.id.tshow);

        textView1=(TextView) findViewById(R.id.tnamota);

    }

   public void onClick(View view)
   {
      s1 = bt1.getText().toString();
      num=Integer.parseInt(s1);
       textView.setText("You Tapped "+num);
       Toast.makeText(this,"Clicked on number "+num,Toast.LENGTH_SHORT).show();
       namota();


   }
    public void bt2(View view)
    {
        s2 = bt2.getText().toString();
        num=Integer.parseInt(s2);
        textView.setText("You Tapped "+num);
        Toast.makeText(this,"Clicked on number "+num,Toast.LENGTH_SHORT).show();
        namota();
      

    }
    public void bt3(View view)
    {
        s3 = bt3.getText().toString();
        num=Integer.parseInt(s3);
        textView.setText("You Tapped "+num);
        Toast.makeText(this,"Clicked on number "+num,Toast.LENGTH_SHORT).show();
        namota();

    }
    public void bt4(View view)
    {
        s4 = bt4.getText().toString();
        num=Integer.parseInt(s4);
        textView.setText("You Tapped "+num);
        Toast.makeText(this,"Clicked on number "+num,Toast.LENGTH_SHORT).show();
        namota();

    }
    public void bt5(View view)
    {
        s5 = bt5.getText().toString();
        num=Integer.parseInt(s5);
        textView.setText("You Tapped "+num);
        Toast.makeText(this,"Clicked on number "+num,Toast.LENGTH_SHORT).show();
        namota();

    }
    public void bt6(View view)
    {
        s6 = bt6.getText().toString();
        num=Integer.parseInt(s6);
        textView.setText("You Tapped "+num);
        Toast.makeText(this,"Clicked on number "+num,Toast.LENGTH_SHORT).show();
        namota();

    }
    public void bt7(View view)
    {
        s7 = bt7.getText().toString();
        num=Integer.parseInt(s7);
        textView.setText("You Tapped "+num);
        Toast.makeText(this,"Clicked on number "+num,Toast.LENGTH_SHORT).show();
        namota();

    }
    public void bt8(View view)
    {
        s8= bt8.getText().toString();
        num=Integer.parseInt(s8);
        textView.setText("You Tapped "+num);
        Toast.makeText(this,"Clicked on number "+num,Toast.LENGTH_SHORT).show();
        namota();

    }
    public void bt9(View view)
    {
        s9 = bt9.getText().toString();
        num=Integer.parseInt(s9);
        textView.setText("You Tapped "+num);
        Toast.makeText(this,"Clicked on number "+num,Toast.LENGTH_SHORT).show();
        namota();

    }
    public void bt10(View view)
    {
        s10 = bt10.getText().toString();
        num=Integer.parseInt(s10);
        textView.setText("You Tapped "+num);
        Toast.makeText(this,"Clicked on number "+num,Toast.LENGTH_SHORT).show();
        namota();

    }


 /*  public void namota()
   {
       for (i=1;i<=10;i++)
       {
           textView1.append(""+num+" X "+i+" = "+num*i);
           textView1.append("\n");


       }
   }*/

    public void namota()
    {
        //int num= 1;
        String str = "";
        for (int i = 1; i <= 10; i++)
        {
            str += String.valueOf(num) + " x " + String.valueOf(i) + " = " + String.valueOf(num * i) + "\n";
        }
        textView1.setText(str);
    }



}
