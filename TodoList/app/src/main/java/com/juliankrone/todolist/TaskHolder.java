package com.juliankrone.todolist;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class TaskHolder extends RecyclerView.ViewHolder {
    protected TextView name;
    protected TextView date;
    protected RelativeLayout relativeLayout;
    protected boolean done;

    public TaskHolder(View view) {
        super(view);
        this.name = (TextView) view.findViewById(R.id.task_name_string);
        this.date = (TextView) view.findViewById(R.id.task_deadline_string);
        this.relativeLayout = (RelativeLayout) view.findViewById(R.id.task_layout);
    }

}