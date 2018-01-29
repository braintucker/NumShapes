package com.briantucker.numshapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

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

        String message = "";

        if (myNumber.isSquare()) {
            if (myNumber.isTriangular()) {
                message = myNumber.number + " is both triangular and square";
            }
            else {
                message = myNumber.number + " is square but not triangular";
            }
        }
        else {
            if (myNumber.isTriangular()) {
                message = myNumber.number + " is triangular but not square";
            }
            else {
                message = myNumber.number + " is neither square or triangular";
            }
        }

        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();


        System.out.println(myNumber.isSquare());
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
