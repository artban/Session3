package barmak.nima.session3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static barmak.nima.session3.MainActivity.state;

public class StateActivity extends AppCompatActivity {

    TextView tvAnswer, tvAnswerNight;
    String answer = " ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



//        Bundle bundle=getIntent().getExtras();
//        if (bundle!=null){
//        answer=bundle.getString("pass");
//        }else {
//            answer=" ";
//        }


        if (getIntent().getExtras() != null) {
            answer = getIntent().getExtras().getString("pass");
        }

        if (state) {
            setContentView(R.layout.activity_state);
            tvAnswer = (TextView) findViewById(R.id.tv_answer);
            tvAnswer.setText(answer);
        } else {
            setContentView(R.layout.activity_state_night);
            tvAnswerNight = (TextView) findViewById(R.id.tv_answer_night);
            tvAnswerNight.setText(answer);
        }


    }
}
