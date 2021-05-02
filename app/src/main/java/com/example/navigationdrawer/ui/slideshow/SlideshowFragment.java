package com.example.navigationdrawer.ui.slideshow;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.navigationdrawer.R;

public class SlideshowFragment extends Fragment {

    private ListView listView;
    private static String[] country= {"Korea", "United States of America", "England", "Japan", "China", "Canada",
            "Sweden", "Spain", "Germany", "Israel", "Mongolia", "Russia", "Scotland", "Turkey", };

    private static SlideshowViewModel newInstance()
    {
        SlideshowViewModel slideshowViewModel = new SlideshowViewModel();
        return slideshowViewModel;
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_slideshow, null);

        listView = (ListView) rootView.findViewById(R.id.countrylist);
        listView.setAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, country));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(view.getContext(), com.example.navigationdrawer.korea.class);
                    startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent(view.getContext(), com.example.navigationdrawer.usa.class);
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(view.getContext(), com.example.navigationdrawer.england.class);
                    startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(view.getContext(), com.example.navigationdrawer.japan.class);
                    startActivity(intent);
                }
                if (position == 4) {
                    Intent intent = new Intent(view.getContext(), com.example.navigationdrawer.china.class);
                    startActivity(intent);
                }
                if (position == 5) {
                    Intent intent = new Intent(view.getContext(), com.example.navigationdrawer.canada.class);
                    startActivity(intent);
                }
                if (position == 6) {
                    Intent intent = new Intent(view.getContext(), com.example.navigationdrawer.sweden.class);
                    startActivity(intent);
                }
                if (position == 7) {
                    Intent intent = new Intent(view.getContext(), com.example.navigationdrawer.spain.class);
                    startActivity(intent);
                }
                if (position == 8) {
                    Intent intent = new Intent(view.getContext(), com.example.navigationdrawer.germany.class);
                    startActivity(intent);
                }
                if (position == 9) {
                    Intent intent = new Intent(view.getContext(), com.example.navigationdrawer.israel.class);
                    startActivity(intent);
                }
                if (position == 10) {
                    Intent intent = new Intent(view.getContext(), com.example.navigationdrawer.mongolia.class);
                    startActivity(intent);
                }
                if (position == 11) {
                    Intent intent = new Intent(view.getContext(), com.example.navigationdrawer.russia.class);
                    startActivity(intent);
                }
                if (position == 12) {
                    Intent intent = new Intent(view.getContext(), com.example.navigationdrawer.scotland.class);
                    startActivity(intent);
                }
                if (position == 13) {
                    Intent intent = new Intent(view.getContext(), com.example.navigationdrawer.turkey.class);
                    startActivity(intent);
                }
            }
        });

        return rootView;

    }
}