package com.del.delcontainer.utils.apiUtils.pojo;

import com.google.gson.annotations.SerializedName;

public class LinkedApplicationDetails {

    @SerializedName("applicationId")
    private String applicationId;

    @SerializedName("addedBy")
    private String addedBy;

    @SerializedName("addedOn")
    private String addedOn;

    @SerializedName("applicationName")
    private String applicationName;

    @SerializedName("applicationUrl")
    private String applicationUrl;

    public String getApplicationId() {
        return applicationId;
    }

    public String getAddedBy() {
        return addedBy;
    }

    public String getAddedOn() {
        return addedOn;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public String getApplicationUrl() {
        return applicationUrl;
    }
}
