package com.springcrm.module.contact.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springcrm.module.contact.model.Contact;


public interface ContactRepository extends JpaRepository<Contact, Long>{

}
