package com.example.tatianka.task2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
        private List<Content> mDataset;
        private Context mContext;

        public static class ViewHolder extends RecyclerView.ViewHolder {
            private View mCardView;
            private TextView mTextViewDescr;
            private TextView mTextViewAddress;
            private TextView mTextViewDays;
            private TextView mTextViewDate;
            private ImageView mImageView;
            private TextView mTextViewLikes;
            public ViewHolder(View v) {
                super(v);
                mCardView = v.findViewById(R.id.cardViewIssue1);
                mTextViewAddress = (TextView)v.findViewById(R.id.textViewCardAddress);
                mTextViewDescr = (TextView)v.findViewById(R.id.textViewCardCaption);
                mTextViewDays = (TextView)v.findViewById(R.id.textViewCardDays);
                mTextViewDate = (TextView)v.findViewById(R.id.textViewCardDate);
                mTextViewLikes = (TextView)v.findViewById(R.id.textVievLikesCount);
                mImageView = (ImageView)v.findViewById(R.id.imageViewIssueIcon);
            }
        }

        public RecyclerViewAdapter(List<Content> dataset, Context context) {
            mContext = context;
            mDataset = dataset;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.content_issue, parent, false);
            return new ViewHolder(v);
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {

            holder.mTextViewAddress.setText(mDataset.get(position).getAddress());
            holder.mTextViewDescr.setText(mDataset.get(position).getDescryption());
            holder.mTextViewDate.setText(mDataset.get(position).getDateCreated());
            holder.mTextViewDays.setText(String.valueOf(mDataset.get(position).getDays()));
            holder.mTextViewLikes.setText(String.valueOf(mDataset.get(position).getLikesCount()));

            holder.mImageView.setImageResource(R.drawable.shape);

            holder.mCardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(v.getContext(), DetailsActivity.class);
                    v.getContext().startActivity(intent);
                }
            });
        }

        @Override
        public int getItemCount() {
            return mDataset.size();
        }

}


