package group1.tcss450.uw.edu.widgetslab;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import java.lang.reflect.Field;

public class SpinnerActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.auto_complete_colors, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String color = (String) parent.getAdapter().getItem(position);
        Toast.makeText(SpinnerActivity.this,
                "The color is " + color,
                Toast.LENGTH_SHORT).show();

        //72. challenge
        View image = findViewById(R.id.imageview);
        image.setBackgroundResource(R.drawable.challenge);
        GradientDrawable gd = (GradientDrawable) image.getBackground().getCurrent();

        int[] colorArr = this.getResources().getIntArray(R.array.colorArray);

        gd.setColor(colorArr[position]);

    }

    public void onNothingSelected(AdapterView<?> arg0){

    }
}
