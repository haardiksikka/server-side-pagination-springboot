package com.viva.pagination.repository;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.viva.pagination.entity.Country;

@Repository
public interface CountryRepository extends PagingAndSortingRepository<Country, Long> {

}