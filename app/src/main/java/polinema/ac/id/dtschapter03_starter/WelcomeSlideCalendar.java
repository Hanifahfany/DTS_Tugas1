package polinema.ac.id.dtschapter03_starter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeSlideCalendar extends AppCompatActivity {
Button btnGetStarted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_slide_calendar);
        btnGetStarted = (Button) findViewById(R.id.btn_get_started);
    }

    public void clickGetStarted(View view) {
        Intent i = new Intent(WelcomeSlideCalendar.this, WelcomeSlideSuperHero.class);
        startActivity(i);
    }

    public void clickLogin(View view) {
        Intent i = new Intent(WelcomeSlideCalendar.this, WelcomeBack.class);
        startActivity(i);
    }
}