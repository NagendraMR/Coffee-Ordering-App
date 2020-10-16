package com.example.coffeeorderapp;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;

import android.widget.Toast;
import android.widget.TextView;


/* Main activity starts here */


public class MainActivity extends AppCompatActivity {

    int quantity1, quantity2, quantity3 = 0;
    int totalprice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


// Methode To display quantity1

    private void display1(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity1);
        quantityTextView.setText("" + number);
    }


    // to display quantity2

    private void display2(int number)
    {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity2);
        quantityTextView.setText("" + number);
    }


    //TO display quantity3

    private void display3(int number)
    {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity3);
        quantityTextView.setText("" + number);
    }

//To increment the value of quantity1


    public void increment1(View view)
    {
        quantity1 += 1;
        display1(quantity1);
    }

    //To increment the value of quantity2

    public void increment2(View view)
    {
        quantity2 += 1;
        display2(quantity2);
    }

    //To increment the value of quantity3

    public void increment3(View view)
    {
        quantity3 += 1;
        display3(quantity3);
    }

    //To decrement the value of quantity1

    public void decrement1(View view)
    {
        if(quantity1==0)
            display1(quantity1);
        else
        {
            quantity1 -= 1;
            display1(quantity1);
        }
    }


    //To decrement the value of quantity2

    public void decrement2(View view)
    {
        if(quantity2==0)
            display2(quantity2);
        else
        {
            quantity2 -= 1;
            display2(quantity2);
        }
    }

    //To decrement the value of quantity3

    public void decrement3(View view)
    {
        if(quantity3==0)
            display3(quantity3);
        else
        {
            quantity3 -= 1;
            display3(quantity3);
        }
    }

    //To display a text massage if order is not made

    public void displaytext(View view)
    {
        TextView totalPrice = (TextView)findViewById(R.id.totalprice);
        if(quantity1==0&&quantity2==0&&quantity3==0)
        {
            totalPrice.setText("Sorry! You haven't ordered anything.Please try again");
        }
        else

            //to display if order is made
        {
            totalprice = (150*quantity1)+(180*quantity2)+(230*quantity3);

            totalPrice.setText("Thank you for ordering!\n\n"+"Total Price : Rs. "+totalprice);

        }
    }
}
