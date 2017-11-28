package com.example.mrpassword.drawer02;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;

/**
 * Created by MrPassword on 28/11/2560.
 */

public class MainContent extends Fragment {

    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        ((MainActivity)getActivity()).drawerToggle.syncState();
    }
}
