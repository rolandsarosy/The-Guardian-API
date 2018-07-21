package cloud.augmentum.theguardianapi.api.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ImageTypeData {

    @SerializedName("caption")
    @Expose
    private String caption;
    @SerializedName("copyright")
    @Expose
    private String copyright;
    @SerializedName("displayCredit")
    @Expose
    private Boolean displayCredit;
    @SerializedName("credit")
    @Expose
    private String credit;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("photographer")
    @Expose
    private String photographer;
    @SerializedName("alt")
    @Expose
    private String alt;
    @SerializedName("mediaId")
    @Expose
    private String mediaId;
    @SerializedName("mediaApiUri")
    @Expose
    private String mediaApiUri;
    @SerializedName("suppliersReference")
    @Expose
    private String suppliersReference;
    @SerializedName("imageType")
    @Expose
    private String imageType;

    public ImageTypeData(){}

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public ImageTypeData withCaption(String caption) {
        this.caption = caption;
        return this;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public ImageTypeData withCopyright(String copyright) {
        this.copyright = copyright;
        return this;
    }

    public Boolean getDisplayCredit() {
        return displayCredit;
    }

    public void setDisplayCredit(Boolean displayCredit) {
        this.displayCredit = displayCredit;
    }

    public ImageTypeData withDisplayCredit(Boolean displayCredit) {
        this.displayCredit = displayCredit;
        return this;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public ImageTypeData withCredit(String credit) {
        this.credit = credit;
        return this;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public ImageTypeData withSource(String source) {
        this.source = source;
        return this;
    }

    public String getPhotographer() {
        return photographer;
    }

    public void setPhotographer(String photographer) {
        this.photographer = photographer;
    }

    public ImageTypeData withPhotographer(String photographer) {
        this.photographer = photographer;
        return this;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public ImageTypeData withAlt(String alt) {
        this.alt = alt;
        return this;
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public ImageTypeData withMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }

    public String getMediaApiUri() {
        return mediaApiUri;
    }

    public void setMediaApiUri(String mediaApiUri) {
        this.mediaApiUri = mediaApiUri;
    }

    public ImageTypeData withMediaApiUri(String mediaApiUri) {
        this.mediaApiUri = mediaApiUri;
        return this;
    }

    public String getSuppliersReference() {
        return suppliersReference;
    }

    public void setSuppliersReference(String suppliersReference) {
        this.suppliersReference = suppliersReference;
    }

    public ImageTypeData withSuppliersReference(String suppliersReference) {
        this.suppliersReference = suppliersReference;
        return this;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public ImageTypeData withImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

}