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
import cloud.augmentum.theguardianapi.api.model.News;

public class NewsAdapter extends ArrayAdapter<News> {

    private Context mContext;
    private List<News> newsList;

    public NewsAdapter(Context context, List<News> list){
        super(context, 0, list);
        mContext = context;
        newsList = list;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItem = convertView;

        if (listItem == null){
            listItem = LayoutInflater.from(mContext).inflate(R.layout.list_item, parent, false);
        }

        News currentNewsItem = newsList.get(position);

        TextView name = listItem.findViewById(R.id.article_name);
        TextView category = listItem.findViewById(R.id.article_category);
        TextView body = listItem.findViewById(R.id.article_body);

        String bodyRaw = currentNewsItem.getBody();
        String bodyString = bodyRaw.substring(0, Math.min(bodyRaw.length(), CatalogActivity.MAX_BODY_LENGTH));
        body.setText(bodyString);

        String nameString = currentNewsItem.getName();
        name.setText(nameString);

        String categoryString = currentNewsItem.getCategory();
        category.setText(categoryString);

        return listItem;
    }
}
