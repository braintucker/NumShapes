package com.briantucker.numshapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    class Number {

        int number;

        public boolean isSquare() {

            double squareRoot = Math.sqrt(number);

            if(squareRoot == Math.floor(squareRoot)) {
                return true;
            }
            else {
                return false;
            }
        }

        public boolean isTriangular() {

            int x = 1;

            int triangularNumber = 1;

            while(triangularNumber < number) {
                x++;

                triangularNumber = triangularNumber + x;

            }

            if (triangularNumber == number) {
                return true;
            }
            else {
                return false;
            }
        }
    }


    public void testNum(View view) {

        EditText usersNum = findViewById(R.id.numEditText);

        Number myNumber = new Number();

        myNumber.number = Integer.parseInt(usersNum.getText().toString());

        System.out.println(myNumber.isSquare());
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
