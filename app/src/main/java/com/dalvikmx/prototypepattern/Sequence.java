package com.dalvikmx.prototypepattern;

import android.util.Log;

public class Sequence implements Cloneable {

    private static final String TAG = "Sequence";
    private String id;
    protected long result;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getResult() {
        return result;
    }

    public Object clone() {

        Object clone = null;

        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            Log.e(TAG, "clone: ".concat(e.getMessage()));
        }

        return clone;
    }
}
