package smartpan.sa.mvvmsmartpansample.repository.categories;

import io.reactivex.Observable;
import retrofit2.Response;
import retrofit2.http.GET;
import smartpan.sa.mvvmsmartpansample.model.pojo.categories.CategoriesResponse;
import smartpan.sa.mvvmsmartpansample.model.pojo.response.ApiResponse;
import smartpan.sa.mvvmsmartpansample.model.utilities.api.ApiConstants;

public interface ApiInterfaceCategories {


    @GET(ApiConstants.METHOD_GET_CATEGORIES)
    Observable<Response<CategoriesResponse>> getCategories();


}
