package com.develop.rth.gragwithflowlayout;

/**
 * Created by rth on 16-11-16.
 */

public interface ItemTouchHelperAdapter {

    void onItemMove(int fromPosition, int toPosition);
    int movementFlags(int position);
}
