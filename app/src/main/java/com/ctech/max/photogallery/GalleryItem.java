package com.ctech.max.photogallery;

public class GalleryItem {
    public String getCaption() {
        return mCaption;
    }

    public void setCaption(String mCaption) {
        this.mCaption = mCaption;
    }

    private String mCaption;

    public String getId() {
        return mId;
    }

    public void setId(String mId) {
        this.mId = mId;
    }

    private String mId;

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String mUrl) {
        this.mUrl = mUrl;
    }

    private String mUrl;

    @Override
    public String toString() {
        return mCaption;
    }
}
