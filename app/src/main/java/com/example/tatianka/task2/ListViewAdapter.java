package com.example.tatianka.task2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by tatianka on 21.04.16.
 */
public class ListViewAdapter extends BaseAdapter {
    private List<Content> mDataset;
    private Context mContext; //[Comment] Unused

    public static class ViewHolder {
        private View mCardView;
        private TextView mTextViewDescr;
        private TextView mTextViewAddress;
        private TextView mTextViewDays;
        private TextView mTextViewDate;
        private ImageView mImageView;
        private TextView mTextViewLikes;

        public ViewHolder (View v) {
            mCardView = v.findViewById(R.id.cardViewIssue);
            mTextViewAddress = (TextView)v.findViewById(R.id.textViewCardAddress);
            mTextViewDescr = (TextView)v.findViewById(R.id.textViewCardCaption);
            mTextViewDays = (TextView)v.findViewById(R.id.textViewCardDays);
            mTextViewDate = (TextView)v.findViewById(R.id.textViewCardDate);
            mTextViewLikes = (TextView)v.findViewById(R.id.textVievLikesCount);
            mImageView = (ImageView)v.findViewById(R.id.imageViewIssueIcon);
        }
    }

    public ListViewAdapter(List<Content> dataset, Context context) {
        mContext = context;
        mDataset = dataset;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.content_issue, parent, false);
        ViewHolder viewHolder = new ViewHolder(convertView);
        convertView.setTag(viewHolder);

        viewHolder.mTextViewAddress.setText(mDataset.get(position).getAddress());

        viewHolder.mTextViewDescr.setText(mDataset.get(position).getTypeName());
        viewHolder.mTextViewDate.setText(mDataset.get(position).getDateCreated());
        viewHolder.mTextViewDays.setText(String.valueOf(mDataset.get(position).getDays()));
        viewHolder.mTextViewLikes.setText(String.valueOf(mDataset.get(position).getLikesCount()));
        viewHolder.mImageView.setImageResource(mDataset.get(position).getIconID());

        viewHolder.mCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), DetailsActivity.class);
                v.getContext().startActivity(intent);
            }
        });

        return convertView;
    }

    @Override
    public int getCount() {
        return mDataset.size();
    }

    @Override
    public Object getItem(int position) {
        return mDataset.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

}
