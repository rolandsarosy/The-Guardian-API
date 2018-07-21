package cloud.augmentum.theguardianapi.api.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Element {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("assets")
    @Expose
    private List<Asset> assets = null;
    @SerializedName("textTypeData")
    @Expose
    private TextTypeData textTypeData;
    @SerializedName("richLinkTypeData")
    @Expose
    private RichLinkTypeData richLinkTypeData;
    @SerializedName("imageTypeData")
    @Expose
    private ImageTypeData imageTypeData;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Element withType(String type) {
        this.type = type;
        return this;
    }

    public List<Asset> getAssets() {
        return assets;
    }

    public void setAssets(List<Asset> assets) {
        this.assets = assets;
    }

    public Element withAssets(List<Asset> assets) {
        this.assets = assets;
        return this;
    }

    public TextTypeData getTextTypeData() {
        return textTypeData;
    }

    public void setTextTypeData(TextTypeData textTypeData) {
        this.textTypeData = textTypeData;
    }

    public Element withTextTypeData(TextTypeData textTypeData) {
        this.textTypeData = textTypeData;
        return this;
    }

    public RichLinkTypeData getRichLinkTypeData() {
        return richLinkTypeData;
    }

    public void setRichLinkTypeData(RichLinkTypeData richLinkTypeData) {
        this.richLinkTypeData = richLinkTypeData;
    }

    public Element withRichLinkTypeData(RichLinkTypeData richLinkTypeData) {
        this.richLinkTypeData = richLinkTypeData;
        return this;
    }

    public ImageTypeData getImageTypeData() {
        return imageTypeData;
    }

    public void setImageTypeData(ImageTypeData imageTypeData) {
        this.imageTypeData = imageTypeData;
    }

    public Element withImageTypeData(ImageTypeData imageTypeData) {
        this.imageTypeData = imageTypeData;
        return this;
    }

}