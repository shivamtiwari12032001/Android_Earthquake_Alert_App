package com.example.quakereport;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Earthquake {

    // Name of the Android version (e.g. Gingerbread, Honeycomb, Ice Cream Sandwich)
    private double mMagnitude;
    private String mUrl;

    // Android version number (e.g. 2.3-2.7, 3.0-3.2.6, 4.0-4.0.4)
    private String mLocation;

    // Drawable resource ID
    private long mTimeInMilliseconds;

    /*
     * Create a new AndroidFlavor object.
     *
     * @param vName is the name of the Android version (e.g. Gingerbread)
     * @param vNumber is the corresponding Android version number (e.g. 2.3-2.7)
     * @param image is drawable reference ID that corresponds to the Android version
     * */
    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    /**
     * Get the name of the Android version
     */
    public double getMagnitude() {
        return mMagnitude;
    }

    /**
     * Get the Android version number
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * Get the image resource ID
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
    public String getUrl() {
        return mUrl;
    }

}