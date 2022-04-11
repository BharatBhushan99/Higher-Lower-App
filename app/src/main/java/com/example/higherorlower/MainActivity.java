package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{
    private int num;

    public void clickMethod(View view)
    {

        Log.i("Info", "Button pressed!");
        EditText textNumber = (EditText) findViewById(R.id.editTextNumber);

        int userGuess = Integer.parseInt(textNumber.getText().toString());
        String message;

        if (num == userGuess)
        {
            message = "You got it! Try again.";
            generateRandomNumber();
        }
        else if (num > userGuess)
        {
            message = "Higher";
        }
        else
        {
            message = "Lower";
        }

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    public void generateRandomNumber()
    {
        Random rand = new Random();
        num = rand.nextInt(20) + 1;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateRandomNumber();
    }
}