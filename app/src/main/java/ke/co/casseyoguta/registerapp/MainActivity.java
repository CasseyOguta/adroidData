package ke.co.casseyoguta.registerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText inputNames, inputEmail, inputPassword, inputPhone, inputDate;
    RadioButton radioMale, radioFemale;
    CheckBox checkBoxTerms;
    Button buttonSubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputNames = findViewById(R.id.inputNames);
        inputEmail = findViewById(R.id.inputEmail);
        inputDate = findViewById(R.id.inputDate);
        inputPhone = findViewById(R.id.inputPhone);
        inputPassword = findViewById(R.id.inputPassword);
        radioMale = findViewById(R.id.radioMale);
        radioFemale = findViewById(R.id.radioFemale);
        checkBoxTerms = findViewById(R.id.checkBoxTerms);
        buttonSubmit = findViewById(R.id.buttonSubmit);

        buttonSubmit.setEnabled(false);

//listener
checkBoxTerms.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        if (isChecked)
        {
            buttonSubmit.setEnabled(true);
        }else{
            buttonSubmit.setEnabled(false);
        }
    }
});

    }








    public void Registered(View view) {
        String names = inputNames.getText().toString().trim();
        String email = inputEmail.getText().toString().trim();
        String date = inputDate.getText().toString().trim();
        String phone = inputPhone.getText().toString().trim();
        String password = inputPassword.getText().toString().trim();


        String gender = radioFemale.isChecked() ? "Female" : "Male";

        String data = names + " " + email + " " + date + " " + gender + " " + phone;
        Toast.makeText(this, data, Toast.LENGTH_SHORT).show();


    }
}
