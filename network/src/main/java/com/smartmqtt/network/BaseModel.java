package com.smartmqtt.network;


import android.os.Parcel;
import android.os.Parcelable;

import com.smartmqtt.network.mvp.IModel;

/**
 * @author kerry
 */
public class BaseModel<T> implements IModel, Parcelable {

    public String message;
    public int code;
    public T data;


    protected BaseModel(Parcel in) {
        message = in.readString();
    }

    public static final Creator<BaseModel> CREATOR = new Creator<BaseModel>() {
        @Override
        public BaseModel createFromParcel(Parcel in) {
            return new BaseModel(in);
        }

        @Override
        public BaseModel[] newArray(int size) {
            return new BaseModel[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(message);
    }
}
