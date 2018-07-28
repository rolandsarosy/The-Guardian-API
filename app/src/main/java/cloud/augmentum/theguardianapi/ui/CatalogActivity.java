package cloud.augmentum.theguardianapi.ui;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.navigation.NavigationView;

import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
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
    private DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalog);
        mDrawerLayout = findViewById(R.id.drawer_layout);

        // Find reference to the bottom app bar and set it up as a regular app bar
        BottomAppBar bar = findViewById(R.id.bar);
        setSupportActionBar(bar);

        // Create and setup the navigation drawer
        onCreateNavigationDrawer();

        // Get the current network connectivity info and call make the base call accordingly
        makeInitialCallWithConnectivityCheck();

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

    /**
     * Helper method that sets onClickListeners on the drawer and sets its functionality
     */
    private void onCreateNavigationDrawer(){
        NavigationView navView = findViewById(R.id.navigation_view);
        navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                menuItem.setChecked(true);
                mDrawerLayout.closeDrawers();
                switch (menuItem.getItemId()){
                    case R.id.drawer_menu_news:
                        // Do stuff
                        return true;
                    case R.id.drawer_menu_opinion:
                        // Do stuff
                        return true;
                    case R.id.drawer_menu_sport:
                        // Do stuff
                        return true;
                    case R.id.drawer_menu_culture:
                        // Do stuff
                        return true;
                    case R.id.drawer_menu_lifestyle:
                        // Do stuff
                        return true;
                }
                return true;
            }
        });
    }

    /**
     * Helper method the get the device's current connection information and make the base
     * network call accordingly
     */
    private void makeInitialCallWithConnectivityCheck(){
        // Create a connectivity manager and get the active network information
        ConnectivityManager connManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connManager.getActiveNetworkInfo();

        if (networkInfo != null && networkInfo.isConnected()){
            makeBaseNetworkCall();
        } else {
            TextView noConnectionTextView = findViewById(R.id.catalog_hint_no_available_network_connection);
            noConnectionTextView.setVisibility(View.VISIBLE);
            hideSpinnerFromCatalog();
        }
    }

    /**
     * Helper method that calls the base endpoint with no special query parameters
     * whatsoever and populates the list with the result
     */
    private void makeBaseNetworkCall(){
        final ListView listView = findViewById(R.id.list);

        // Create a Retrofit client with the ServiceGenerator class
        NewsClient client = ServiceGenerator.createService(NewsClient.class);

        Call<News> call = client.getBaseJson(API_KEY, API_REQUEST_TYPE, API_BLOCK_TYPE);

        // Call the endpoint and respond to failure and success events
        call.enqueue(new Callback<News>() {
            @Override
            public void onResponse(Call<News> call, Response<News> response) {
                // Parse the response to match the List of JSONArray objects
                List<Result> results = response.body().getResponse().getResults();

                hideSpinnerFromCatalog();

                // Set the adapter and remove the divider between the list items
                NewsAdapter adapter = new NewsAdapter(CatalogActivity.this, results);
                listView.setDividerHeight(0);
                listView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<News> call, Throwable t) {
                hideSpinnerFromCatalog();

                Toast.makeText(CatalogActivity.this, "There was a problem with the network call", Toast.LENGTH_SHORT).show();
                Log.e("The throwable is", t.toString());
            }
        });
    }

    /**
     * Simple helper method to hide the loading spinner from the catalog activity
     */
    private void hideSpinnerFromCatalog(){
        ProgressBar spinner = findViewById(R.id.loading_spinner);
        spinner.setVisibility(View.GONE);
    }

}
