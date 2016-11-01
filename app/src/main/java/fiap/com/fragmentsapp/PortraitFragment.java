package fiap.com.fragmentsapp;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by RM30917 on 31/10/2016.
 * Aciona o layout de fragmento Portrait.
 */
public class PortraitFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.portrait_fragment, container, false);
    }

}
