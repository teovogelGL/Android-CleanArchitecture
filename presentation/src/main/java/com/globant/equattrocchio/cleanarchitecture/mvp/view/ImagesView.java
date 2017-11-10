package com.globant.equattrocchio.cleanarchitecture.mvp.view;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.globant.equattrocchio.cleanarchitecture.R;
import com.globant.equattrocchio.cleanarchitecture.mvp.view.adapter.AdapterImage;
import com.globant.equattrocchio.cleanarchitecture.util.bus.RxBus;
import com.globant.equattrocchio.cleanarchitecture.util.bus.observers.CallServiceButtonObserver;
import com.globant.equattrocchio.data.response.Image;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ImagesView extends ActivityView {

    @BindView(R.id.tv_incoming_json) TextView tvlabel;
    @BindView(R.id.recycler_view) RecyclerView recyclerView;

    public ImagesView(AppCompatActivity activity) {
        super(activity);
        ButterKnife.bind(this, activity);
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
    }

    public void showText(String text) {
        tvlabel.setText(text);
    }

    @OnClick(R.id.btn_call_service)
    public void callServiceBtnPressed() {
        RxBus.post(new CallServiceButtonObserver.CallServiceButtonPressed());
    }

    public void showError() {
        tvlabel.setText(R.string.connection_error);
    }

    public void addImage(String s) {
        tvlabel.setText(tvlabel.getText() + "\n\n" + s);
    }

    public void clearLabel () {
        tvlabel.setText("");
    }

    public void setAdapter (AdapterImage adapter) {
        recyclerView.setAdapter(adapter);
    }
}
