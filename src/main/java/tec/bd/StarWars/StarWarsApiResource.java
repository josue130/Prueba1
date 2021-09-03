package tec.bd.StarWars;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;


public interface StarWarsApiResource {
    @GET("people/{id}")
    Call<People> people(@Path("id") String id);

    @GET("planets/{id}")
    Call<Planet> planet(@Path("id") String id);


}
