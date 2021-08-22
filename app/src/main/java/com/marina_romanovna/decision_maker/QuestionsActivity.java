package com.marina_romanovna.decision_maker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class QuestionsActivity extends AppCompatActivity {

    private EditText editText1;
    private EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_questions);

        editText1 = findViewById(R.id.editTextConditionOne);
        editText2 = findViewById(R.id.editTextConditionTwo);

    }


    public void onClickButtonResult(View view) {
        Intent intent = new Intent(QuestionsActivity.this, ResultActivity.class);
        intent.putExtra("conditionOne", editText1.getText());
        intent.putExtra("conditionTwo", editText2.getText());
        startActivity(intent);
    }


}
