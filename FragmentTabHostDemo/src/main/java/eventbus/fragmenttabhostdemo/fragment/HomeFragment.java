package eventbus.fragmenttabhostdemo.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import eventbus.fragmenttabhostdemo.R;

/**
 * Created by Administrator on 2016/10/22.
 */

public class HomeFragment extends android.support.v4.app.Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = View.inflate(getContext(),R.layout.homefagment_layout,null);


        return view;
    }
}
