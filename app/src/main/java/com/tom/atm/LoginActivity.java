package com.tom.atm;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText ed_userid;
    private EditText ed_passwd;
    private String uid;
    private String passwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void login(View v){
        ed_userid = (EditText)findViewById(R.id.ed_userid);
        ed_passwd = (EditText)findViewById(R.id.ed_passwd);
        uid = ed_userid.getText().toString();
        passwd = ed_passwd.getText().toString();
        if (uid.equals("jack") && passwd.equals("1234")){
            Toast.makeText(this, "Success!", Toast.LENGTH_LONG ).show();
            getIntent().putExtra("LOGIN_USERID", uid);
            getIntent().putExtra("LOGIN_PASSWD", passwd);
            setResult(RESULT_OK, getIntent());
            finish();
        }else{
            new AlertDialog.Builder(this)
                    .setTitle("ATM")
                    .setMessage("Failed")
                    .setPositiveButton("OK",null)
                    .show();
        }
    }
    public void cancel(View v){

    }
}
