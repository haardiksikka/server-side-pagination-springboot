package com.viva.pagination.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.viva.pagination.entity.Country;
import com.viva.pagination.repository.CountryRepository;

@Service
public class CountryService implements ICountryService {

    @Autowired
    private CountryRepository repository;

    @Override
    public List<Country> findPaginated(int pageNo, int pageSize) {

        Pageable paging = PageRequest.of(pageNo, pageSize);
       // List<Country> ls = (List<Country>) repository.findAll();
        Page<Country> pagedResult = repository.findAll(paging);

        return pagedResult.toList();
    }
}
