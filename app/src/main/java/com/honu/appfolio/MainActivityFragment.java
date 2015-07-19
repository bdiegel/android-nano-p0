package com.honu.appfolio;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        LinearLayout linearLayoutView = (LinearLayout) rootView.findViewById(R.id.root_linear_layout);
        registerButtonHandlers(linearLayoutView);

        return rootView;
    }

    /**
     * Register an OnClickListener for all Buttons
     * @param parent
     */
    private void registerButtonHandlers(LinearLayout parent) {

        int count = parent.getChildCount();

        for (int i = 0; i <= count; i++) {
            View view = parent.getChildAt(i);
            if (view instanceof Button) {
                view.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        handleButtonClick((Button) v);
                    }
                });
            }
        }
    }

    /**
     * Handle any button click
     *
     * @param button
     */
    private void handleButtonClick(Button button) {
        String name = button.getText().toString();
        Toast.makeText(getActivity(), "Will open app: " + name, Toast.LENGTH_SHORT).show();
    }
}
