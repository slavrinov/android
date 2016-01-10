package ru.slavrinov.android.rgbcircles;

/**
 * Created by slavrinov 06.01.16
 */
public interface ICanvasView {
    void drawCircle(SimpleCircle circle);

    void redraw();

    void showMessage(String text);
}
