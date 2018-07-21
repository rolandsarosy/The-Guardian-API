package cloud.augmentum.theguardianapi.api.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class News {

    @SerializedName("response")
    @Expose
    private Response response;

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public News withResponse(Response response) {
        this.response = response;
        return this;
    }
}