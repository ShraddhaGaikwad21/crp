package com.sts.DAO;

import org.springframework.data.repository.CrudRepository;

import com.sts.Master.CountryMaster;

public interface CountryDAO extends CrudRepository<CountryMaster, Integer>{

}
