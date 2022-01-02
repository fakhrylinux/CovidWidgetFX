package tech.fakhrylinux.datafetch;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import tech.fakhrylinux.datafetch.model.CountryData;
import tech.fakhrylinux.datafetch.model.GlobalData;

public interface CovidApi {
    @GET("https://coronavirus-19-api.herokuapp.com/all")
    Call<GlobalData> getGlobalData();

    @GET("https://coronavirus-19-api.herokuapp.com/countries/{countryName}")
    Call<CountryData> getCountryData(@Path(value = "countryName") String countryName);
}
