package com.example.g572_528r.wuziqi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private WuziqiPanel mWuziqiPanel;
    private Button again;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWuziqiPanel = (WuziqiPanel) findViewById(R.id.wuziqi);
        again = (Button) findViewById(R.id.again);

        again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mWuziqiPanel.start();
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}
