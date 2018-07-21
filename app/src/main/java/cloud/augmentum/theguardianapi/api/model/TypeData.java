package cloud.augmentum.theguardianapi.api.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TypeData {

    @SerializedName("aspectRatio")
    @Expose
    private String aspectRatio;
    @SerializedName("width")
    @Expose
    private Integer width;
    @SerializedName("height")
    @Expose
    private Integer height;
    @SerializedName("isMaster")
    @Expose
    private Boolean isMaster;

    public TypeData(){}

    public String getAspectRatio() {
        return aspectRatio;
    }

    public void setAspectRatio(String aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    public TypeData withAspectRatio(String aspectRatio) {
        this.aspectRatio = aspectRatio;
        return this;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public TypeData withWidth(Integer width) {
        this.width = width;
        return this;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public TypeData withHeight(Integer height) {
        this.height = height;
        return this;
    }

    public Boolean getIsMaster() {
        return isMaster;
    }

    public void setIsMaster(Boolean isMaster) {
        this.isMaster = isMaster;
    }

    public TypeData withIsMaster(Boolean isMaster) {
        this.isMaster = isMaster;
        return this;
    }

}