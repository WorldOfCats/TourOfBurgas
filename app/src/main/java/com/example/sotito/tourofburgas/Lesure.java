package com.example.sotito.tourofburgas;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class Lesure extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View viewMain = inflater.inflate(R.layout.burgas_list, container, false);

        final ArrayList<Content> content = new ArrayList<Content>();
        content.add(new Content(R.string.barbossa_text, R.drawable.barbossa));

        ContentAdapter invokeAdapter = new ContentAdapter(getActivity(), content, R.color.lesure_category);

        ListView adapterListView = (ListView) viewMain.findViewById(R.id.data);

        adapterListView.setAdapter(invokeAdapter);

        return viewMain;
    }

}
