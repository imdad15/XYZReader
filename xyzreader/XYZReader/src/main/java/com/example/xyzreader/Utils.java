package com.example.xyzreader;

import android.content.Context;
import android.graphics.Point;
import android.support.v7.graphics.Palette;
import android.view.Display;
import android.view.WindowManager;

public class Utils {

    private static int screenWidth = 0;

    public static int getScreenWidth(Context c) {
        if (screenWidth == 0) {
            WindowManager wm = (WindowManager) c.getSystemService(Context.WINDOW_SERVICE);
            Display display = wm.getDefaultDisplay();
            Point size = new Point();
            display.getSize(size);
            screenWidth = size.x;
        }

        return screenWidth;
    }

    public static Palette.Swatch processPalette(Palette p) {
        if (p.getDarkVibrantSwatch() != null)
            return p.getDarkVibrantSwatch();
        else  if (p.getDarkMutedSwatch() != null)
            return p.getDarkMutedSwatch();
        else if (p.getVibrantSwatch() != null)
            return p.getVibrantSwatch();
        else if (p.getMutedSwatch() != null)
            return p.getMutedSwatch();
        else if (p.getLightVibrantSwatch() != null)
            return p.getLightVibrantSwatch();
        else if (p.getLightMutedSwatch() != null)
            return p.getLightMutedSwatch();

        return null;
    }
}
