
package com.android.androidrecruitchallenge.entity.pullsdetail;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Html {

    @SerializedName("href")
    @Expose
    private String href;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

}