package com.example.marine.tp_final;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by marine on 09/12/17.
 */

public class NamePickerActivity extends AppCompatActivity {

    public static final String TAG = NamePickerActivity.class.getSimpleName();

    EditText mNameEditText;
    EditText mEmailEditText;
    Button mSubmitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_namepicker);
        Log.d(TAG, "Activitée crée");

        mSubmitButton = findViewById(R.id.submitButton);
        mNameEditText = findViewById(R.id.nameEditText);
        mEmailEditText = findViewById(R.id.mailEditText);

        mSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String vName = mNameEditText.getText().toString();
                String vEmail = mEmailEditText.getText().toString();
                if (!vName.isEmpty() && !vEmail.isEmpty()) {
                    UserStorage.saveUserInfo(NamePickerActivity.this, vName, vEmail);
                    Intent intent = new Intent(NamePickerActivity.this, MainActivity.class);
                    NamePickerActivity.this.startActivity(intent);
                }
            }
        });
    }


}