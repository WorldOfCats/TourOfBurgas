package com.example.sotito.tourofburgas;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;


public class ContentAdapter extends ArrayAdapter<Content>  {

    private int colour;

    public ContentAdapter(Context context, ArrayList<Content> content, int colorResourceId) {
        super(context, 0, content);
        colour = colorResourceId;
    }
    @Override
    public View getView(int location, View convertView, ViewGroup parent) {
        View dataElement = convertView;
        if (dataElement == null) {
            dataElement = LayoutInflater.from(getContext()).inflate(
                    R.layout.content_list, parent, false);
        }

        Content textView = (Content) getItem(location);

        TextView InfoText = (TextView) dataElement.findViewById(R.id.information_text_view);
        InfoText.setText(textView.getGuideTextId());

        ImageView viewPicture = (ImageView) dataElement.findViewById(R.id.picture);

        if (textView.hasImage()) {

            viewPicture.setImageResource(textView.getImageResourceId());

            viewPicture.setVisibility(View.VISIBLE);
        } else {

            viewPicture.setVisibility(View.GONE);
        }

        View placeholderText = dataElement.findViewById(R.id.text_view_bg);

        int colorAttribute = ContextCompat.getColor(getContext(), colour);

        placeholderText.setBackgroundColor(colorAttribute);

        return dataElement;
    }
}

