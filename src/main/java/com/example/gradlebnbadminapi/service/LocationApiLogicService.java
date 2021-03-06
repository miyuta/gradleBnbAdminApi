package com.example.gradlebnbadminapi.service;

import com.example.gradlebnbadminapi.model.entity.Accommodation;
import com.example.gradlebnbadminapi.model.network.request.AccommodationApiRequest;

public interface LocationApiLogicService {

    void create(AccommodationApiRequest accommodationApiRequest, Accommodation accommodation) throws Exception;

    void put(AccommodationApiRequest accommodationApiRequest, Accommodation accommodation) throws Exception;

    String getLocation(String latitude, String longitude) throws Exception;

    String getPlaces(String searchKeyword) throws Exception;

    String getPlacesWithPlaceId(String placeId) throws Exception;
}
