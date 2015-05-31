package br.com.pcpleao.myappportfolio;


import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
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

    /** Called when the user touches the button Reader */
    public void runReader (View view) {
        // Do something in response to button click
        Context context = getApplicationContext();
        CharSequence text = "Coming Soon : Reader";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    /** Called when the user touches the button Spotify Streamer */
    public void runSpotify (View view) {
        // Do something in response to button click
        Context context = getApplicationContext();
        CharSequence text = "Coming Soon : Spotify Streamer";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    /** Called when the user touches the button Football Scores */
    public void runScores (View view) {
        // Do something in response to button click
        Context context = getApplicationContext();
        CharSequence text = "Coming Soon : Football Scores";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    /** Called when the user touches the button Library */
    public void runLibrary (View view) {
        // Do something in response to button click
        Context context = getApplicationContext();
        CharSequence text = "Coming Soon : Library";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    /** Called when the user touches the button Buid it Bigger */
    public void runBigger (View view) {
        // Do something in response to button click
        Context context = getApplicationContext();
        CharSequence text = "Coming Soon : Build It Bigger";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    /** Called when the user touches the button Capstone */
    public void runCapstone (View view) {
        // Do something in response to button click
        Context context = getApplicationContext();
        CharSequence text = "Coming Soon : Capstone";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
