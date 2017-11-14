package com.globant.equattrocchio.cleanarchitecture.mvp.view.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.globant.equattrocchio.cleanarchitecture.R;
import com.globant.equattrocchio.cleanarchitecture.mvp.presenter.ImagesPresenter;

public class AdapterImage extends
        RecyclerView.Adapter<AdapterImage.ViewHolder> {

    // Provide a direct reference to each of the views within a data item
    public class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView image;
        public TextView id;

        public ViewHolder(View itemView) {
            super(itemView);

            image = (ImageView) itemView.findViewById(R.id.image);
            id = (TextView) itemView.findViewById(R.id.text_image_id);
        }
    }



    ImagesPresenter presenter;

    public AdapterImage (ImagesPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        // Inflate the custom layout
        View contactView = inflater.inflate(R.layout.item_image, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(contactView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        presenter.populateViewHolder(holder, position);
    }

    @Override
    public int getItemCount() {
        return presenter.getAdapterSize();
    }

}
