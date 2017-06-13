package com.springcrm.module.contact.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springcrm.module.contact.model.Contact;
import com.springcrm.module.contact.model.Province;


public interface ProvinceRepository extends JpaRepository<Province, Long>{

}
