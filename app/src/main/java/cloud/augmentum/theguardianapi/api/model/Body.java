package cloud.augmentum.theguardianapi.api.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Body {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("bodyHtml")
    @Expose
    private String bodyHtml;
    @SerializedName("bodyTextSummary")
    @Expose
    private String bodyTextSummary;
    @SerializedName("attributes")
    @Expose
    private Attributes attributes;
    @SerializedName("published")
    @Expose
    private Boolean published;
    @SerializedName("createdDate")
    @Expose
    private String createdDate;
    @SerializedName("lastModifiedDate")
    @Expose
    private String lastModifiedDate;
    @SerializedName("contributors")
    @Expose
    private List<Object> contributors = null;
    @SerializedName("elements")
    @Expose
    private List<Element> elements = null;

    public Body(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Body withId(String id) {
        this.id = id;
        return this;
    }

    public String getBodyHtml() {
        return bodyHtml;
    }

    public void setBodyHtml(String bodyHtml) {
        this.bodyHtml = bodyHtml;
    }

    public Body withBodyHtml(String bodyHtml) {
        this.bodyHtml = bodyHtml;
        return this;
    }

    public String getBodyTextSummary() {
        return bodyTextSummary;
    }

    public void setBodyTextSummary(String bodyTextSummary) {
        this.bodyTextSummary = bodyTextSummary;
    }

    public Body withBodyTextSummary(String bodyTextSummary) {
        this.bodyTextSummary = bodyTextSummary;
        return this;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public Body withAttributes(Attributes attributes) {
        this.attributes = attributes;
        return this;
    }

    public Boolean getPublished() {
        return published;
    }

    public void setPublished(Boolean published) {
        this.published = published;
    }

    public Body withPublished(Boolean published) {
        this.published = published;
        return this;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public Body withCreatedDate(String createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public Body withLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

    public List<Object> getContributors() {
        return contributors;
    }

    public void setContributors(List<Object> contributors) {
        this.contributors = contributors;
    }

    public Body withContributors(List<Object> contributors) {
        this.contributors = contributors;
        return this;
    }

    public List<Element> getElements() {
        return elements;
    }

    public void setElements(List<Element> elements) {
        this.elements = elements;
    }

    public Body withElements(List<Element> elements) {
        this.elements = elements;
        return this;
    }

}