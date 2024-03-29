package com.raczadam.design_patterns.patterns.behavioral.strategy;

public class ImageManager {

    private Renderer renderer;

    public void setRenderer(Renderer renderer) {
        this.renderer = renderer;
    }

    public void show() {
        renderer.showImage();
    }

}
