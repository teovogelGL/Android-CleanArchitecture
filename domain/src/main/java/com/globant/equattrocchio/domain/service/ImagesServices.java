package com.globant.equattrocchio.domain.service;

import com.globant.equattrocchio.domain.Image;

import io.reactivex.Observer;

public interface ImagesServices {

    void getLatestImages(Observer<Image> observer);
}
