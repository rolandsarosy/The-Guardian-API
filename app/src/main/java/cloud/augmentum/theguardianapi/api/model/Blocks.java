package cloud.augmentum.theguardianapi.api.model;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import retrofit2.http.Body;

public class Blocks {

    @SerializedName("body")
    @Expose
    private List<Body> body = null;
    @SerializedName("totalBodyBlocks")
    @Expose
    private Integer totalBodyBlocks;

    public Blocks(){}

    public List<Body> getBody() {
        return body;
    }

    public void setBody(List<Body> body) {
        this.body = body;
    }

    public Blocks withBody(List<Body> body) {
        this.body = body;
        return this;
    }

    public Integer getTotalBodyBlocks() {
        return totalBodyBlocks;
    }

    public void setTotalBodyBlocks(Integer totalBodyBlocks) {
        this.totalBodyBlocks = totalBodyBlocks;
    }

    public Blocks withTotalBodyBlocks(Integer totalBodyBlocks) {
        this.totalBodyBlocks = totalBodyBlocks;
        return this;
    }

}