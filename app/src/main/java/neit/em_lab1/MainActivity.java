package neit.em_lab1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

import static java.lang.Integer.parseInt;


public class MainActivity extends AppCompatActivity {

    private EditText firstNametxt; // first name
    private EditText lastNametxt; // last name
    private Spinner ddBox; // dropdown
    private RadioButton nsbtn; // normal shipment
    private RadioButton expbtn; // expidited
    private EditText nobtxt; // number of bars
    private TextView ansertxt; // results
    private Button savebtn; // save button
    private Boolean shipment;
    ArrayList<Order> purchases = new ArrayList<Order>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        firstNametxt = (EditText)findViewById(R.id.firstNametxt); // first name
        lastNametxt = (EditText)findViewById(R.id.lastNametxt); // last name
        ddBox = (Spinner)findViewById(R.id.ddBox); // dropdown
        nsbtn = (RadioButton)findViewById(R.id.nsbtn); // normal shipment
        expbtn = (RadioButton)findViewById(R.id.expbtn); // expidited
        nobtxt = (EditText)findViewById(R.id.nobtxt); // number of bars
        ansertxt = (TextView)findViewById(R.id.ansertxt);// results
        savebtn = (Button)findViewById(R.id.savebtn); // save button

        savebtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String firstName = firstNametxt.getText().toString();
                String lastName = lastNametxt.getText().toString();
                String bars = nobtxt.getText().toString();
                int nobtxt = parseInt(bars);

                if (nsbtn.isChecked()) {
                    shipment = true;

                }
                else {
                    shipment = false;

                }

                Order purchaseOrder = new Order(firstName, lastName, bars, nobtxt,shipment);
                purchases.add(purchaseOrder);

                ansertxt.setText("Orders " + purchases.size());


            }


        });








    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
