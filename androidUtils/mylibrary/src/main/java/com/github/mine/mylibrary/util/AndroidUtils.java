package com.github.mine.mylibrary.util;

import android.content.Context;
import android.util.DisplayMetrics;

/**
 * Created by fuleilei on 2017/12/18.
 */

public class AndroidUtils {
    private static DisplayMetrics sDisplay;
    private static final String KEY_MIUI_VERSION_NAME = "ro.miui.ui.version.name";

    /**
     * @return 屏幕高度
     */
    public static int getScreenHeight(Context context) {
        if (sDisplay == null) {
            sDisplay = context.getResources().getDisplayMetrics();
        }
        int height = sDisplay.heightPixels;
        return height;
    }
}
