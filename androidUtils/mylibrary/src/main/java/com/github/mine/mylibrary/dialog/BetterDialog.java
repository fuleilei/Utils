package com.github.mine.mylibrary.dialog;


import android.app.Dialog;
import android.content.Context;
import android.view.Window;
import android.widget.TextView;

import com.github.mine.mylibrary.R;


public class BetterDialog extends Dialog {

	private TextView mTextView;

	public BetterDialog(Context context, int theme) {
		super(context, theme);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.dialog_tip_msg);
		setCanceledOnTouchOutside(false);
		mTextView = findViewById(R.id.tv_tip_msg);
	}

	public BetterDialog(Context context) {
		super(context, R.style.upgrade_dialog);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.dialog_tip_msg);
		setCanceledOnTouchOutside(false);
		mTextView = findViewById(R.id.tv_tip_msg);
	}
	public void setTextTip(String tip) {
		if (mTextView != null) {
			mTextView.setText(tip);
		}
	}
}