package com.autoenjoy.android.giphyrestapi;

import retrofit2.Call;
import retrofit2.http.Query;

public interface GiphyService {
    public static final String API_KEY = "https://api.giphy.com/v1/gifs/search?api_key=YGHnKKBGSydS6nSt6WAoUcICWwmgCfvL&q=&limit=25&offset=0&rating=g&lang=en"; //TODO Api key

    Call<GiphySearch> searchGifs(@Query("q") String querry,
                                 @Query("limit") int limit,
                                 @Query("api_key") String api_key);
}
