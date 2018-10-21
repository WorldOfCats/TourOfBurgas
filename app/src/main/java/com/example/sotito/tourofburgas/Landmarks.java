package com.example.sotito.tourofburgas;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class Landmarks extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View viewMain = inflater.inflate(R.layout.burgas_list, container, false);

        final ArrayList<Content> content = new ArrayList<Content>();
        content.add(new Content(R.string.bridge_text,  R.drawable.bridge));
        content.add(new Content(R.string.clock_text,  R.drawable.clock));
        content.add(new Content(R.string.port_text,  R.drawable.port));
        content.add(new Content(R.string.station_text,  R.drawable.station));

        ContentAdapter invokeAdapter = new ContentAdapter(getActivity(), content, R.color.landmarks_category);

        ListView adapterListView = (ListView) viewMain.findViewById(R.id.data);

        adapterListView.setAdapter(invokeAdapter);

        return viewMain;
    }

}