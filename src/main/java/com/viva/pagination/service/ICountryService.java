package com.viva.pagination.service;

import java.util.List;

import com.viva.pagination.entity.Country;

public interface ICountryService {

    List<Country> findPaginated(int pageNo, int pageSize);
}
