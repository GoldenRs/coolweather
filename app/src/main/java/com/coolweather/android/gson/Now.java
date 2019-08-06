package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("city")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
