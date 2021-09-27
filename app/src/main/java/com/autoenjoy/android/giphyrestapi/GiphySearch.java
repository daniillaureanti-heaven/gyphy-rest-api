package com.autoenjoy.android.giphyrestapi;

import java.util.List;

public class GiphySearch {

    public List<Giphy> data;
    public Meta meta;
    public Pagination pagination;

    class Meta{
        public int status;
        public String msg;
        public String responseId;
    }

    class Pagination{
        public int totalCount;
        public int count;
        public int offSet;
    }
}
