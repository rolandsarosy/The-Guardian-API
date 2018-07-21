package cloud.augmentum.theguardianapi.ui;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import cloud.augmentum.theguardianapi.R;
import cloud.augmentum.theguardianapi.api.model.News;
import cloud.augmentum.theguardianapi.api.service.NewsClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CatalogActivity extends AppCompatActivity {

    public static final int MAX_BODY_LENGTH = 135;
    public static final String API_KEY = "324ed141-8ecd-4f25-be0a-872bd02c6a8a";
    public static final String API_REQUEST_TYPE = "article";
    public static final String API_BLOCK_TYPE = "body";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalog);

        final ListView listView = findViewById(R.id.list);

        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl("https://content.guardianapis.com")
                .addConverterFactory(GsonConverterFactory.create());

        Retrofit retrofit = builder.build();

        NewsClient client = retrofit.create(NewsClient.class);
        Call<List<News>> call = client.getNews(API_KEY, API_REQUEST_TYPE, API_BLOCK_TYPE);

        call.enqueue(new Callback<List<News>>() {
            @Override
            public void onResponse(Call<List<News>> call, Response<List<News>> response) {
                List<News> news = response.body();

                listView.setAdapter(new NewsAdapter(CatalogActivity.this, news));
            }

            @Override
            public void onFailure(Call<List<News>> call, Throwable t) {
                Toast.makeText(CatalogActivity.this, "fuck :|", Toast.LENGTH_SHORT).show();
                Log.e("The throwable is", t.toString());
            }
        });
    }
}
