package com.example.freightapp.DataModels;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class dataModelTanker {
    @SerializedName("kala")
    @Expose
    String kala;

    @SerializedName("mabdaa")
    @Expose
    String mabdaa;

    @SerializedName("maghsad")
    @Expose
    String maghsad;


    @SerializedName("bargirfa")
    @Expose
    String bargirfa;

    @SerializedName("daily")
    @Expose
    String daily;

    @SerializedName("mabdaaLAT")
    @Expose
    Double mabdaaLAT ;

    @SerializedName("mabdaaLONG")
    @Expose
    Double mabdaaLONG ;

    @SerializedName("maghsadLAT")
    @Expose
    Double maghsadLAT ;

    @SerializedName("maghsadLONG")
    @Expose
    Double maghsadLONG ;

    public String getKala() {
        return kala;
    }

    public String getMabdaa() {
        return mabdaa;
    }

    public String getMaghsad() {
        return maghsad;
    }

    public String getBargirfa() {
        return bargirfa;
    }

    public String getDaily() {
        return daily;
    }

    public Double getMabdaaLAT() {
        return mabdaaLAT;
    }

    public Double getMabdaaLONG() {
        return mabdaaLONG;
    }

    public Double getMaghsadLAT() {
        return maghsadLAT;
    }

    public Double getMaghsadLONG() {
        return maghsadLONG;
    }
}
