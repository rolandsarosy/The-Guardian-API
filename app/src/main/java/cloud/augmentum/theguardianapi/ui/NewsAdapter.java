package cloud.augmentum.theguardianapi.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import cloud.augmentum.theguardianapi.R;
import cloud.augmentum.theguardianapi.api.model.Body;
import cloud.augmentum.theguardianapi.api.model.News;
import cloud.augmentum.theguardianapi.api.model.Response;
import cloud.augmentum.theguardianapi.api.model.Result;

public class NewsAdapter extends ArrayAdapter<Result> {

    private Context mContext;
    private List<Result> newsList;

    public NewsAdapter(Context context, List<Result> list) {
        super(context, 0, list);
        mContext = context;
        newsList = list;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItem = convertView;

        if (listItem == null) {
            listItem = LayoutInflater.from(mContext).inflate(R.layout.list_item, parent, false);
        }

        Result currentNews = newsList.get(position);

        TextView name = listItem.findViewById(R.id.article_name);
        TextView category = listItem.findViewById(R.id.article_category);
        TextView body = listItem.findViewById(R.id.article_body);

        List<Body> currentNewsBodyElements = currentNews.getBlocks().getBody();
        Body currentNewsBody = currentNewsBodyElements.get(0);
        String bodyTextFull = currentNewsBody.getBodyTextSummary();
        String bodyText = bodyTextFull.substring(0, Math.min(bodyTextFull.length(), CatalogActivity.BODY_MAX_TEXT_LENGHT)).concat("...");

        String nameString = currentNews.getWebTitle();
        String categoryString = currentNews.getSectionName();

        name.setText(nameString);
        category.setText(categoryString);
        body.setText(bodyText);

        return listItem;
    }
}
