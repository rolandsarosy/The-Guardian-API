package cloud.augmentum.theguardianapi.api.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RichLinkTypeData {

    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("originalUrl")
    @Expose
    private String originalUrl;
    @SerializedName("linkText")
    @Expose
    private String linkText;
    @SerializedName("linkPrefix")
    @Expose
    private String linkPrefix;
    @SerializedName("role")
    @Expose
    private String role;

    public RichLinkTypeData(){}

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public RichLinkTypeData withUrl(String url) {
        this.url = url;
        return this;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public RichLinkTypeData withOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
        return this;
    }

    public String getLinkText() {
        return linkText;
    }

    public void setLinkText(String linkText) {
        this.linkText = linkText;
    }

    public RichLinkTypeData withLinkText(String linkText) {
        this.linkText = linkText;
        return this;
    }

    public String getLinkPrefix() {
        return linkPrefix;
    }

    public void setLinkPrefix(String linkPrefix) {
        this.linkPrefix = linkPrefix;
    }

    public RichLinkTypeData withLinkPrefix(String linkPrefix) {
        this.linkPrefix = linkPrefix;
        return this;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public RichLinkTypeData withRole(String role) {
        this.role = role;
        return this;
    }

}