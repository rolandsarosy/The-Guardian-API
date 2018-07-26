package cloud.augmentum.theguardianapi.ui;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.bottomappbar.BottomAppBar;

import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import cloud.augmentum.theguardianapi.R;
import cloud.augmentum.theguardianapi.api.model.News;
import cloud.augmentum.theguardianapi.api.model.Result;
import cloud.augmentum.theguardianapi.api.service.NewsClient;
import cloud.augmentum.theguardianapi.api.service.ServiceGenerator;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CatalogActivity extends AppCompatActivity {

    public static final int BODY_SUMMARY_TEXT_LENGTH_SHORT = 150;
    public static final int BODY_SUMMARY_TEXT_LENGTH_LONG = 400;
    public static final String API_KEY = "324ed141-8ecd-4f25-be0a-872bd02c6a8a";
    public static final String API_REQUEST_TYPE = "article";
    public static final String API_BLOCK_TYPE = "body";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalog);
        
        // Find reference to the ListView and bottom app bars
        final ListView listView = findViewById(R.id.list);
        BottomAppBar bar = findViewById(R.id.bar);

        // Setup the bottom app bar to behave as a regular action bar
        setSupportActionBar(bar);

        // Create a Retrofit client with the ServiceGenerator class
        NewsClient client = ServiceGenerator.createService(NewsClient.class);

        Call<News> call = client.getBaseJson(API_KEY, API_REQUEST_TYPE, API_BLOCK_TYPE);

        // Call the endpoint and respond to failure and success events
        call.enqueue(new Callback<News>() {
            @Override
            public void onResponse(Call<News> call, Response<News> response) {
                // Parse the response to match the List of JSONArray objects
                List<Result> results = response.body().getResponse().getResults();

                // Set the adapter and remove the divider between the list items
                NewsAdapter adapter = new NewsAdapter(CatalogActivity.this, results);
                listView.setDividerHeight(0);
                listView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<News> call, Throwable t) {
                Toast.makeText(CatalogActivity.this, "There was a problem with the network call", Toast.LENGTH_SHORT).show();
                Log.e("The throwable is", t.toString());
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_catalog, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.catalog_menu_search:
                // Do stuff
                return true;
            case R.id.catalog_menu_sort:
                // Do stuff
                return true;
            case R.id.catalog_menu_home:
                // Do stuff
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
