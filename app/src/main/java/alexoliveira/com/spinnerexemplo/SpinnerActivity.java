package alexoliveira.com.spinnerexemplo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import static android.os.Build.VERSION_CODES.M;

public class SpinnerActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        spinner = (Spinner) findViewById(R.id.Spinner_id);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(
                this,
                R.array.times,
                android.R.layout.simple_spinner_dropdown_item
                );

        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(SpinnerActivity.this);


    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        TextView textView = (TextView) view;

        Toast.makeText(
                SpinnerActivity.this,
                textView.getText(),
                Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
