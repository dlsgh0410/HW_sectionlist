package com.example.tacademy.hw_sectionlist;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;

/**
 * Created by Tacademy on 2016-02-16.
 */
public class GroupView extends FrameLayout {
    public GroupView(Context context) {
        super(context);
        init();
    }

    TextView groupView;
    GroupItem item;

    private void init() {
        inflate(getContext(), R.layout.view_group, this);
        groupView = (TextView) findViewById(R.id.text_group);
    }

    public void setGroupItem(GroupItem item){
        this.item= item;
        groupView.setText(item.groupName);
    }

}
