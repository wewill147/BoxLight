package today.theworldover.boxlight;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import today.theworldover.boxlight.R;

/**
 * Created by william on 11/26/14.
 */
public class FragmentF extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_f, container, false);
    }
}