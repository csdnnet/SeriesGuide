
package com.battlelancer.seriesguide.ui;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

import com.actionbarsherlock.app.SherlockFragment;
import com.battlelancer.seriesguide.ui.dialogs.TraktCredentialsDialogFragment;
import com.uwetrottmann.seriesguide.R;

/**
 * Tells about trakt, allows to proceed to credentials step. 
 */
public class ConnectTraktFragment extends SherlockFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.connect_trakt_fragment, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        // connect button
        getView().findViewById(R.id.buttonConnectTrakt).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                TraktCredentialsDialogFragment f = TraktCredentialsDialogFragment.newInstance();
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.root_container, f);
                ft.commit();
            }
        });

        // discard button
        getView().findViewById(R.id.buttonDiscard).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().finish();
            }
        });
    }
}
