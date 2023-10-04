

package com.example.regestrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSubmit = findViewById(R.id.submit);


       EditText editName = findViewById(R.id.editTextName);
        EditText  editMother = findViewById(R.id.editTextMother);
        EditText editFather = findViewById(R.id.editTextFather);
        EditText editEmail = findViewById(R.id.editTextEmail);
        EditText editPhone = findViewById(R.id.editTextPhone);
        EditText editBirth = findViewById(R.id.editTextBirth);
        EditText editGender = findViewById(R.id.editTextGender);
        EditText editAdd = findViewById(R.id.editTextAddress);
        EditText editWork = findViewById(R.id.editTextWork);



        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = editName.getText().toString();
                String mother = editMother.getText().toString();
                String father = editFather.getText().toString();
                String email = editEmail.getText().toString();
                String phone = editPhone.getText().toString();
                String birth = editBirth.getText().toString();
                String gender = editGender.getText().toString();
                String address = editAdd.getText().toString();
                String work = editWork.getText().toString();

                Toast.makeText(MainActivity.this, "Name Is : "+name+"\nMother Name Is : "+mother+
                        "\nFather Name Is : "+father+"\nE-Mail Is : "+email+"\nPhone Number Is : "+phone+
                                "\nBirth Date Is : "+birth+"\nGender Is "+gender+"\nAddress Is : "+address+
                        "\nWork Is : "+work, Toast.LENGTH_SHORT).show();


            }
        });





    }
}



//
//    private void DOB() {
//    }
//
//    private void phone() {
//    }
//
//    private void email() {
//    }
//
//    private void name() {
//        btnName = findViewById(R.id.btnName);
//         btnName.setOnClickListener(new View.OnClickListener() {
//             @Override
//             public void onClick(View view) {
//                 Toast.makeText(MainActivity.this, "Name Is ", Toast.LENGTH_SHORT).show();
//
//             }
//         });


/*
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnName, btnEmail, btnPhone, btnDOB;
    EditText editName, editEmail, editPhone, editDOB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnName = findViewById(R.id.name);
        btnEmail = findViewById(R.id.email);
        btnPhone = findViewById(R.id.phone);
        btnDOB = findViewById(R.id.dob);

        editName = findViewById(R.id.editTextName);
        editEmail = findViewById(R.id.editTextEmail);
        editPhone = findViewById(R.id.editTextPhone);
        editDOB = findViewById(R.id.editTextDOB);

        btnName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = editName.getText().toString();
                showToast("Name Is: " + name);
            }
        });

        btnEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = editEmail.getText().toString();
                showToast("Email Is: " + email);
            }
        });

        btnPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phone = editPhone.getText().toString();
                showToast("Phone Is: " + phone);
            }
        });

        btnDOB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String dob = editDOB.getText().toString();
                showToast("DOB Is: " + dob);
            }
        });
    }

    private void showToast(String message) {
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
    }
}
*/