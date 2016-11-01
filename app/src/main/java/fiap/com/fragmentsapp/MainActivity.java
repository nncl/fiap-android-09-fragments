package fiap.com.fragmentsapp;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);

        /*
         * Lets get the configuration cause we'll change as well as the user rotates
         * the device. So, to get when it occurs - such as an event - we need this:
         */

        Configuration config = getResources().getConfiguration();

        FragmentManager fragmentManager = getFragmentManager();
        // We start the transaction
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        /*
         * Now we verify and set the relative response as fragment
         */

        if (config.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            LandscapeFragment landscapeFragment = new LandscapeFragment();

            // There are already fragments into main activity, so we should have
            // replace it by our own and customized fragment.
            fragmentTransaction.replace(android.R.id.content, landscapeFragment);
        } else {
            PortraitFragment portraitFragment = new PortraitFragment();
            fragmentTransaction.replace(android.R.id.content, portraitFragment);
        }

        // And now we commit it
        fragmentTransaction.commit();
    }
}
