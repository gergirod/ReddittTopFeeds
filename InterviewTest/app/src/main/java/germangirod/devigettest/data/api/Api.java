package germangirod.devigettest.data.api;

import germangirod.devigettest.data.model.TopListing;
import retrofit.http.GET;
import retrofit.http.Query;
import rx.Observable;

/**
 * Created by germangirod on 12/9/15.
 */
public interface Api {

    @GET("/top/.json") Observable<TopListing> getTopNews(@Query("count") String count, @Query("limit") String limit,@Query("after") String after);
}
