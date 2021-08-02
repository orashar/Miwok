
        package com.example.android.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.android.miwok.R;
import com.example.android.miwok.Word;

import java.util.ArrayList;

/**
 * {@link WordAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Word} objects.
 */
public class WordAdapter extends ArrayAdapter<Word> {

    private int mbgColor;

    /**
     * Create a new {@link WordAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param words   is the list of {@link Word}s to be displayed.
     */
    public WordAdapter(Context context, ArrayList<Word> words, int bgcolor) {

        super(context, 0, words);
        mbgColor = bgcolor;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);

        miwokTextView.setText(currentWord.getMiwokTranslation());

        LinearLayout mbg  = (LinearLayout) listItemView.findViewById(R.id.text_container) ;
        mbg.setBackgroundColor(mbgColor);

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);

        defaultTextView.setText(currentWord.getDefaultTranslation());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        if(currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }else {
            imageView.setVisibility(View.GONE);
        }
        return listItemView;

    }
}
