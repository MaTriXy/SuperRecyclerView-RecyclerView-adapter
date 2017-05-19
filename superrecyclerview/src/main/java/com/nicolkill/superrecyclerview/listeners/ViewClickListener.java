package com.nicolkill.superrecyclerview.listeners;

import android.view.View;

/**
 * Created by Nicol Acosta on 10/27/16.
 * nicol@parkiller.com
 */
public interface ViewClickListener<T> {

    void onViewClick(View view, int position, T element);

}