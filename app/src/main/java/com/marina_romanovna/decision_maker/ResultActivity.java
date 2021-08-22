package com.marina_romanovna.decision_maker;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class ResultActivity extends AppCompatActivity {

    private Bundle conditionsBundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_result);

        TextView txtResult = findViewById(R.id.textResult);

        conditionsBundle = getIntent().getExtras();

        txtResult.setText(getRandomAnswer());
    }


    public void onClickButtonBeginning(View view) {
        Intent intent = new Intent(ResultActivity.this, MainActivity.class);
        startActivity(intent);
    }


    public String getRandomAnswer() {
        Random random = new Random();
        int numberResult = random.nextInt(2) + 1;
        switch (numberResult) {
            case 1:
                return conditionsBundle.get("conditionOne").toString();
            case 2:
                return conditionsBundle.get("conditionTwo").toString();
        }
        return "";
    }
}
