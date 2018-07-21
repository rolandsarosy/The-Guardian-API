package cloud.augmentum.theguardianapi.api.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Response {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("userTier")
    @Expose
    private String userTier;
    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("startIndex")
    @Expose
    private Integer startIndex;
    @SerializedName("pageSize")
    @Expose
    private Integer pageSize;
    @SerializedName("currentPage")
    @Expose
    private Integer currentPage;
    @SerializedName("pages")
    @Expose
    private Integer pages;
    @SerializedName("orderBy")
    @Expose
    private String orderBy;
    @SerializedName("results")
    @Expose
    private List<Result> results = null;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Response withStatus(String status) {
        this.status = status;
        return this;
    }

    public String getUserTier() {
        return userTier;
    }

    public void setUserTier(String userTier) {
        this.userTier = userTier;
    }

    public Response withUserTier(String userTier) {
        this.userTier = userTier;
        return this;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Response withTotal(Integer total) {
        this.total = total;
        return this;
    }

    public Integer getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public Response withStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
        return this;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Response withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Response withCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Response withPages(Integer pages) {
        this.pages = pages;
        return this;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public Response withOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public Response withResults(List<Result> results) {
        this.results = results;
        return this;
    }

}