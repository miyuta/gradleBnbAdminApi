package com.example.gradlebnbadminapi.service;

import com.example.gradlebnbadminapi.model.entity.Accommodation;
import com.example.gradlebnbadminapi.model.network.Header;
import com.example.gradlebnbadminapi.model.network.request.AccommodationApiRequest;
import com.example.gradlebnbadminapi.model.network.response.AccommodationApiResponse;

import java.util.List;

public interface RoomApiLogicService {

    void create(AccommodationApiRequest roomApiRequest, Accommodation accommodation) throws Exception;

    void put(AccommodationApiRequest accommodationApiRequest, Accommodation accommodation) throws Exception;
}
