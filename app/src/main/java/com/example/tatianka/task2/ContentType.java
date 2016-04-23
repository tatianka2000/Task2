package com.example.tatianka.task2;

/**
 * stub data added; in future version will be refacrored
 */
public class ContentType {
    public enum Type {MUNICIPAL, BUILDING, ELEVATOR, OTHER};

    private Type mType;
    private int mIconRes;
    private String mTypeName;

    public ContentType(Type type)
    {
        generateData(type);
    }

    void generateData(Type type)
    {
        mType = type;
        switch (mType){
            case MUNICIPAL:
                mIconRes = R.drawable.ic_municipal;
                mTypeName = "Комунальне господарство";
                break;
            case BUILDING:
                mIconRes = R.drawable.ic_building;
                mTypeName = "Благоустрій та будівництво";
                break;
            case ELEVATOR:
                mIconRes = R.drawable.ic_elevator;
                mTypeName = "Ремонт та обслуговування ліфтів";
                break;
            default:
                mIconRes = R.drawable.ic_municipal;
                mTypeName = "Комунальне господарство";
                break;
        }
    }

    public int getIconRes(){
        return mIconRes;
    }

    public String getTypeName(){
        return mTypeName;
    }
}



