package com.example.sotito.tourofburgas;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class Nature extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View viewMain = inflater.inflate(R.layout.burgas_list, container, false);

        final ArrayList<Content> content = new ArrayList<Content>();
        content.add(new Content(R.string.anastasia_text,  R.drawable.anastasia));
        content.add(new Content(R.string.beach_text,  R.drawable.beach));
        content.add(new Content(R.string.mud_text,  R.drawable.mud));
        content.add(new Content(R.string.park_text,  R.drawable.park));

        ContentAdapter invokeAdapter = new ContentAdapter(getActivity(), content, R.color.nature_category);

        ListView adapterListView = (ListView) viewMain.findViewById(R.id.data);

        adapterListView.setAdapter(invokeAdapter);

        return viewMain;
    }

}