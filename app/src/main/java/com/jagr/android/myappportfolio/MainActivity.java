package com.jagr.android.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    /** Called when the user touches the button */
    public void sendMessage(View view) {
        Button btn = (Button)view;
        String text;
        switch(btn.getId()){
            case R.id.button_spotify_streamer:
                text = getString( R.string.toast_sporify_streamer );
                break;
            case R.id.button_scores:
                text = getString( R.string.toast_scores_app );
                break;
            case R.id.button_library:
                text = getString( R.string.toast_library_app );
                break;
            case R.id.button_build_it:
                text = getString( R.string.toast_built_it_bigger_app );
                break;
            case R.id.button_xyz_reader:
                text = getString( R.string.toast_reader_app );
                break;
            case R.id.button_capstone:
                text = getString( R.string.toast_capstone_app );
                break;
            default:
                text = getString( R.string.toast_default );
        }

        Toast toast = Toast.makeText(this,text, Toast.LENGTH_SHORT);
        toast.show();

    }
}
