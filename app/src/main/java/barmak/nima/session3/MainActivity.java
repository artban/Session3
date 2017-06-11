package barmak.nima.session3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static boolean state = true;
    Button btnDay, btnNight, btnCon;
    EditText etPass;
    String pass="null";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDay = (Button) findViewById(R.id.btn_day);
        btnNight = (Button) findViewById(R.id.btn_night);
        btnCon = (Button) findViewById(R.id.btn_confirm);
        etPass = (EditText) findViewById(R.id.et_pass);





        btnCon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                pass = etPass.getText().toString().trim();

                if (pass.equals("123456")) {
                    state = true;
                    Intent stateIntent = new Intent(MainActivity.this, StateActivity.class);
                    stateIntent.putExtra("pass","رمز صحیح میباشد");
                    startActivity(stateIntent);
                } else {
                    state = false;
                    Intent stateIntent = new Intent(MainActivity.this, StateActivity.class);
                    stateIntent.putExtra("pass",pass);
                    startActivity(stateIntent);
                }
            }
        });






        btnDay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                state = true;
                Intent stateIntent = new Intent(MainActivity.this, StateActivity.class);
                startActivity(stateIntent);
            }
        });
        btnNight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                state = false;
                Intent stateIntent = new Intent(MainActivity.this, StateActivity.class);
                startActivity(stateIntent);
            }
        });


    }
}
