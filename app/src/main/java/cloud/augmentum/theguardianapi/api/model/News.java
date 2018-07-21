package cloud.augmentum.theguardianapi.api.model;

/**
 * The News class holds a single news instance and its relevant information
 */
public class News {

    // The name of the article
    private String webTitle;

    // The category of the article
    private String sectionName;

    // The website URL of the article
    private String webUrl;

    // The body of the article
    private String bodyTextSummary;

    // Getter methods for this class
    public String getName(){
        return webTitle;
    }
    public String getCategory(){
        return sectionName;
    }
    public String getUrl(){
        return webUrl;
    }
    public String getBody(){
        return bodyTextSummary;
    }
}
