package me.jakewilson.halostats.net;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Headers;
import retrofit.http.Path;

/**
 * Created by jakewilson on 11/8/15.
 */
public interface HaloAPI {

    String apiHost = "https://www.haloapi.com";
    //[?modes][&start][&count]") TODO add these args
    @Headers(APIConfig.subscriptinHeader)
    @GET("stats/h5/players/{player}/matches")
    Call<MatchResponse> getMatches(@Path("player") String gamerTag);
}
