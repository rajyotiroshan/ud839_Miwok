package com.example.android.miwok;

public class Word {
    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private  int mImgResourceID;
    //constructor.
    public Word(String miwok,String english){
        mMiwokTranslation =miwok;
        mDefaultTranslation=english;
    }
    //constructor
    Word(String mMiwokTranslation,String mDefaultTranslation, int imgResourceID){
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mImgResourceID = imgResourceID;
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
    /**
     * @return img res id
     */
    public int getImgResourceID(){
        return mImgResourceID;
    }
}
