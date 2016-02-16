package com.example.tacademy.hw_sectionlist;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;

/**
 * Created by Tacademy on 2016-02-16.
 */
public class ChildView extends FrameLayout{


    public ChildView(Context context) {
        super(context);
        init();
    }

    TextView childView;
    ChildItem item;
    private void init(){
        inflate(getContext(),R.layout.view_child, this);
        childView = (TextView)findViewById(R.id.text_child);
    }

    public void setChildItem(ChildItem item){
        this.item = item;
        childView.setText(item.childName);
    }

}
