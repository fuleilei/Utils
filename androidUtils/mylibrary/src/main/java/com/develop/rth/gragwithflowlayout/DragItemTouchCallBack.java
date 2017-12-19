package com.develop.rth.gragwithflowlayout;


import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

/**
 * Created by rth on 16-11-16.
 */

public class DragItemTouchCallBack extends ItemTouchHelper.Callback {

    private final ItemTouchHelperAdapter touchHelperAdapter;

    public DragItemTouchCallBack(ItemTouchHelperAdapter touchHelperAdapter) {
        this.touchHelperAdapter = touchHelperAdapter;
    }

    @Override
    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        int dragFlags = touchHelperAdapter.movementFlags(viewHolder.getAdapterPosition());
        if(dragFlags!=ItemTouchHelper.ACTION_STATE_IDLE){
            dragFlags =  makeFlag(ItemTouchHelper.ACTION_STATE_DRAG, dragFlags);
        }
       return dragFlags;
    }

    @Override
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
        touchHelperAdapter.onItemMove(viewHolder.getAdapterPosition(), target.getAdapterPosition());
        return true;
    }

    @Override
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {

    }

    @Override
    public boolean isLongPressDragEnabled() {
        return true;
    }

}
