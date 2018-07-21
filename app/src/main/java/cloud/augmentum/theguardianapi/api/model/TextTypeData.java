package cloud.augmentum.theguardianapi.api.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TextTypeData {

    @SerializedName("html")
    @Expose
    private String html;

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public TextTypeData withHtml(String html) {
        this.html = html;
        return this;
    }

}