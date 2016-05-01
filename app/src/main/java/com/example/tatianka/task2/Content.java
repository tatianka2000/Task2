package com.example.tatianka.task2;



public class Content { //[Comment] Please make project structure with packages

    public enum State {DONE, INWORK, WAITING}; //[Comment] Unnecessary ";"

    private String mId;
    private int mLikesCount;
    private int mDays;

    private String mDateCreated;
    private String mDateRegistered;
    private String mDateSolveTo;

    private String mDescryption;
    private String mAddress;
    private String mResponsible;

    private State mState;
    private ContentType mType;


    public Content(){}

    public Content(String id, int likesCount, int days, String dateCreated,
                   String dateRegistered, String dateSolveTo,
                   String descryption, String address,
                   String responsible, State state, ContentType type){
        mId = id;
        mLikesCount = likesCount;
        mDays = days;
        mDateCreated = dateCreated;
        mDateRegistered = dateRegistered;
        mDateSolveTo = dateSolveTo;
        mDescryption = descryption;
        mAddress = address;
        mResponsible = responsible;
        mState = state;
        mType = type;
    }

    public String getId(){
        return mId;
    }

    public int getLikesCount(){
        return mLikesCount;
    }

    public int getDays(){
        return mDays;
    }

    public String getDescryption(){
        return mDescryption;
    }

    public String getAddress(){
        return mAddress;
    }

    public String getResponsible(){
        return mResponsible;
    }

    public String getDateCreated(){
        return mDateCreated;
    }

    public String getDateRegistered(){
        return mDateRegistered;
    }
    public String getDateSolveTo(){
        return mDateSolveTo;
    }

    public State getState(){
        return mState;
    }

    public String getTypeName(){
        return mType.getTypeName();
    }

    public int getIconID(){
        return mType.getIconRes();
    }

    public void setId(String id){
        mId = id;
    }

    public void setStatus(State state)
    {
        mState = state;
    }

    public void setLikesCount(int likesCount){
        mLikesCount = likesCount;
    }

    public void setDays(int days){
        mDays = days;
    }

    public void setDescryption(String descryption){
        mDescryption = descryption;
    }

    public void setAddress(String address){
        mAddress = address;
    }

    public void setDateCreated(String date){
        mDateCreated = date;
    }

    public void setDateRegistered(String date){
        mDateRegistered = date;
    }

    public void setDateSolveTo(String date){
        mDateSolveTo = date;
    }

    public void setResponsible(String responsible){
        mResponsible = responsible;
    }

    public void setState(State state){
        mState = state;
    }

};
