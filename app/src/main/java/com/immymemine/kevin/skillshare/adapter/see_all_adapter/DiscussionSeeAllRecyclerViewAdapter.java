package com.immymemine.kevin.skillshare.adapter.see_all_adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.immymemine.kevin.skillshare.R;
import com.immymemine.kevin.skillshare.model.m_class.Reply;
import com.immymemine.kevin.skillshare.utility.TimeUtil;
import com.immymemine.kevin.skillshare.view.ExpandableTextView;

import java.util.List;

/**
 * Created by quf93 on 2017-12-11.
 */

public class DiscussionSeeAllRecyclerViewAdapter extends RecyclerView.Adapter<DiscussionSeeAllRecyclerViewAdapter.Holder> {

    Context context;
    List<Reply> replies;
    public DiscussionSeeAllRecyclerViewAdapter(Context context, List<Reply> replies) {
        this.context = context;
        this.replies = replies;
    }

    public void update(List<Reply> replies) {
        this.replies = replies;
        notifyDataSetChanged();
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_view_item_see_all_discussions, parent, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        if(position == 0) {
            holder.holder.setBackground(context.getResources().getDrawable(R.drawable.reply_boundary));
        }
        Reply reply = replies.get(position);

        Glide.with(context).load(reply.getImageUrl())
                .apply(RequestOptions.circleCropTransform())
                .into(holder.imageViewProfile);
        holder.textViewProfile.setText(reply.getName());
        holder.expandableTextView.setText(reply.getContent(), TextView.BufferType.NORMAL);
        holder.textViewTime.setText(TimeUtil.calculateTime(reply.getTime()));
    }

    @Override
    public int getItemCount() {
        return replies.size();
    }

    class Holder extends RecyclerView.ViewHolder {
        View holder;
        ImageView imageViewProfile;
        TextView textViewProfile, textViewTime;
        ExpandableTextView expandableTextView;

        public Holder(View view) {
            super(view);
            holder = view;

            imageViewProfile = view.findViewById(R.id.image_view_profile);
            textViewProfile = view.findViewById(R.id.text_view_profile);

            expandableTextView = view.findViewById(R.id.expandable_text_view);
            expandableTextView.setTrimLength(8);

            textViewTime = view.findViewById(R.id.text_view_time);
        }
    }
}
