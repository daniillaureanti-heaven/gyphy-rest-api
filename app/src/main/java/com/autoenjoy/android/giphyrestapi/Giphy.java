package com.autoenjoy.android.giphyrestapi;

import java.util.Map;

public class Giphy {

    public String id;
    public String type;
    public Map<String, GiphyImage> images;

    public static class GiphyImage{
        public String url;
        public int width;
        public int height;
        public int size;
        public String mp4;
        public int mp4Size;
        public String webp;
        public String webpSize;
    }
}
