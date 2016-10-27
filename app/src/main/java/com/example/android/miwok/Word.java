package com.example.android.miwok;

/**
 * Created by ASUS on 10/27/2016.
 */

public class Word {
    /**
     * Default translation for the word
     */
    private String mDefaultTranslation;
    private String mMiwokTranslation;

    //Create a new Word object.
    public Word(String mMiwokTranslation, String mDefaultTranslation) {
        this.mMiwokTranslation = mMiwokTranslation;
        this.mDefaultTranslation = mDefaultTranslation;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public void setmDefaultTranslation(String mDefaultTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public void setmMiwokTranslation(String mMiwokTranslation) {
        this.mMiwokTranslation = mMiwokTranslation;
    }

}
