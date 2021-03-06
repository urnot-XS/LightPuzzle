package com.xs.lightpuzzle.puzzle.util;

import android.view.View;
import android.view.View.OnClickListener;

import java.util.Calendar;

/**
 * Created by xs on 2018/11/20.
 */
public abstract class NoDoubleClickListener implements OnClickListener {

    private static final long MIN_CLICK_DELAY_TIME = 1000L;

    private long mLastTime;
    private View mView;

    @Override
    public void onClick(View v) {
        long currentTime = Calendar.getInstance().getTimeInMillis();
        if (mView == null || mView.equals(v)) {
            if (currentTime - mLastTime > MIN_CLICK_DELAY_TIME) {
                mLastTime = currentTime;
                onNoDoubleClick(v);
            }
        } else {
            mLastTime = currentTime;
            onNoDoubleClick(v);
        }
        mView = v;
    }

    public abstract void onNoDoubleClick(View v);
}
