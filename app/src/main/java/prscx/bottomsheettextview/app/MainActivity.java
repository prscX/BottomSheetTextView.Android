package prscx.bottomsheettextview.app;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import prscx.bottomsheettextview.BottomSheetTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Activity activity = this;

        Button showDialog = (Button) findViewById(prscx.bottomsheettextview.app.R.id.showDialog);
        showDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetTextView.Builder builder = new BottomSheetTextView.Builder(activity);
                builder.show();
            }
        });
    }
}
