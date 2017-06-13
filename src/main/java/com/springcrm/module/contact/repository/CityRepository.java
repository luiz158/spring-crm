package com.springcrm.module.contact.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springcrm.module.contact.model.City;

public interface CityRepository extends JpaRepository<City, Long>{

}
