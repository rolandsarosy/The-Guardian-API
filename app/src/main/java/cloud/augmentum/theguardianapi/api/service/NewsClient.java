package cloud.augmentum.theguardianapi.api.service;

import java.util.List;

import cloud.augmentum.theguardianapi.api.model.News;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface NewsClient {

    @GET("search")
    Call<News> getBaseJson(
            // API key should always be constant
            @Query("api-key") String apiKey,
            // Type should always be "Article" for the purpose of this demo
            @Query("type") String type,
            // Show-blocks should always be "Body" to get the main text of an article
            @Query("show-blocks") String showBlocks);
}
