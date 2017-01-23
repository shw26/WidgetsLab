package group1.tcss450.uw.edu.widgetslab;

import android.graphics.drawable.GradientDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class CheckBoxRadioButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box_radio_button);
    }
    @Override
    protected void onStop() {
        super.onStop();
        GradientDrawable bg = (GradientDrawable) findViewById(R.id.radioGroup).getBackground();
        bg.setColor(getResources().getColor(R.color.fill));
    }
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        GradientDrawable bg = (GradientDrawable) findViewById(R.id.radioGroup).getBackground();
        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radioYes:
                if (checked)
                    bg.setColor(getResources().getColor(R.color.yes));
                break;
            case R.id.radioNo:
                if (checked)
                    bg.setColor(getResources().getColor(R.color.no));
                break;
        }
    }
    public void submitButtonOnClick(View view){

    }
}
