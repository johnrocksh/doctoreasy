package com.webmaster.doctoeasy;


import java.util.ArrayList;

import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ServerApi {

        @GET("getSpecialtyList")
        ArrayList<String> getAllSpecialtyList();




}

