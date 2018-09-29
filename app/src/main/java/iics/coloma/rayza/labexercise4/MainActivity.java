package iics.coloma.rayza.labexercise4;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button toastbutton = (Button) findViewById(R.id.toastbutton);
        Button snackbarbutton = (Button) findViewById(R.id.snackbarbutton);
        Button snackActionbutton = (Button) findViewById(R.id.snackActionbutton);

        toastbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String message = "THIS IS A TOAST";
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(getApplicationContext(), message, duration).show();
            }
        });


        snackbarbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                View view = findViewById(R.id.main_layout_id);
                String message = "This is a Snackbar message";
                int duration = Snackbar.LENGTH_SHORT;

                showSnackbar(view, message, duration);
            }

        });

        snackActionbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                View view = findViewById(R.id.main_layout_id);
                String message = "This is a Snackbar message with action";
                int duration = Snackbar.LENGTH_SHORT;

                showSnackbarAct(view, message, duration);
            }
        });


    }

    public void showSnackbar(View view, String message, int duration)
    {
        Snackbar.make(view, message,duration).show();
    }

    public void showSnackbarAct (View view, String message, int duration)
    {
        final Snackbar snackbar = Snackbar.make(view, message, duration);
        snackbar.setAction("DISMISS", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snackbar.dismiss();
            }
        });
        snackbar.show();
    }
}