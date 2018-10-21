package com.example.sotito.tourofburgas;

public class Content {

    private int infoText;

    private int infoPicture = do_not_display;

    private static final int do_not_display = -1;

    public Content(int guideTextId, int imageIdentifier) {
        infoText = guideTextId;

        infoPicture = imageIdentifier;
    }

    public int getGuideTextId() {
        return infoText;
    }

    public int getImageResourceId() {
        return infoPicture;
    }

    public boolean hasImage() {
        return infoPicture != do_not_display;
    }
}
