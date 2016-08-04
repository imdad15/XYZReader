package com.example.xyzreader;

import android.support.v7.graphics.Palette;

public class Utils {

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
