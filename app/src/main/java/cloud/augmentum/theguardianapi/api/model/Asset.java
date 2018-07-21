package cloud.augmentum.theguardianapi.api.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Asset {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("mimeType")
    @Expose
    private String mimeType;
    @SerializedName("file")
    @Expose
    private String file;
    @SerializedName("typeData")
    @Expose
    private TypeData typeData;

    public Asset(){}

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Asset withType(String type) {
        this.type = type;
        return this;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public Asset withMimeType(String mimeType) {
        this.mimeType = mimeType;
        return this;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public Asset withFile(String file) {
        this.file = file;
        return this;
    }

    public TypeData getTypeData() {
        return typeData;
    }

    public void setTypeData(TypeData typeData) {
        this.typeData = typeData;
    }

    public Asset withTypeData(TypeData typeData) {
        this.typeData = typeData;
        return this;
    }

}