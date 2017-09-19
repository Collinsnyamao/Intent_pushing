package ke.co.comsterhomes.www.trial3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtt;
    Button btnpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtt = (TextView) findViewById(R.id.txtt);
        btnpass = (Button) findViewById(R.id.btnpass);

        String txttvar = txtt.getText().toString();

        final Intent senddata = new Intent(MainActivity.this,Main2Activity.class);
        senddata.putExtra("txtt",txttvar);

        btnpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent changepage = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(changepage);
                startActivity(senddata);
            }
        });


    }
}