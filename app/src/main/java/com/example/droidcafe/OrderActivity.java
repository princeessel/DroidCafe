package com.example.droidcafe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class OrderActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

   private TextView textView;
    private String spinnerLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        textView=findViewById(R.id.order_textview);

        Intent intent =getIntent();
        String message=intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        textView.setText(message);
//Creating a spinner instance
        Spinner spinner=findViewById(R.id.label_spinner);
        if(spinner!=null){
            spinner.setOnItemSelectedListener(this);
        }

//        Creating an ArrayAdapter
        ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource(this,
                R.array.labels_array,android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears.
        adapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner.
        if (spinner != null) {
            spinner.setAdapter(adapter);
        }



    }

    public void onRadioButtonClicked(View view) {

// Is the button now checked?
        boolean checked=((RadioButton)view).isChecked();
// check which radio button was clicked
        switch(view.getId()){
            case R.id.sameday:
                if (checked)
                    displayToast(getString(R.string.same_day_messenger_service));
                break;
            case R.id.nextday:
                if (checked)
                    displayToast(getString(R.string.next_day_ground_delivery));
                break;

            case R.id.pickup:
                if (checked)
                    displayToast(getString(R.string.pick_up));
                break;

                default:

                    break;
        }

    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        spinnerLabel = parent.getItemAtPosition(position).toString();
        displayToast(spinnerLabel);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
