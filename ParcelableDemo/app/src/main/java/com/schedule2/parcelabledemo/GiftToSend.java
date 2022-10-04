package com.schedule2.parcelabledemo;

import  java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable;

class giftToSend implements Parcelable {
    String senderName, subject, wishes;
    String [] message;

    public giftToSend(String senderName,String subject,String wishes, String[] message){

    }

    protected giftToSend(Parcel in) {
        senderName = in.readString();
        subject = in.readString();
        wishes = in.readString();
        message = in.createStringArray();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(senderName);
        dest.writeString(subject);
        dest.writeString(wishes);
        dest.writeStringArray(message);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<giftToSend> CREATOR = new Creator<giftToSend>() {
        @Override
        public giftToSend createFromParcel(Parcel in) {
            return new giftToSend(in);
        }

        @Override
        public giftToSend[] newArray(int size) {
            return new giftToSend[size];
        }
    };
}
