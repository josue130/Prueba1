package tec.bd.StarWars;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.Optional;

public class StarsWarsService {


    public Optional<Planet> GetPlanet(String id){
        try {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://swapi.dev/api/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            StarWarsApiResource starWarsApi = retrofit.create(StarWarsApiResource.class);
            return Optional.ofNullable(starWarsApi.planet(id).execute().body());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }
    public Optional<People> GetPeople(String id){
        try {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://swapi.dev/api/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            StarWarsApiResource starWarsApi = retrofit.create(StarWarsApiResource.class);
            return Optional.ofNullable(starWarsApi.people(id).execute().body());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Optional.empty();
    }


}
