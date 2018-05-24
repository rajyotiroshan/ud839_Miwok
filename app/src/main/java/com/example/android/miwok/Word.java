package com.example.android.miwok;

public class Word {
    private String mMiwokTranslation;
    private String mDefaultTranslation;
    public Word(String miwok,String english){
        mMiwokTranslation =miwok;
        mDefaultTranslation=english;
    }
    /**
     * @return miwok word
     */
    public String getMiwokTranslation(){
        return this.mMiwokTranslation;
    }
    /**
     * @return default translated word
     */
    public String getDefaultTranslation(){
        return this.mDefaultTranslation;
    }
}
