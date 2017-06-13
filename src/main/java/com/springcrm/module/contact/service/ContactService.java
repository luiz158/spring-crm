package com.springcrm.module.contact.service;

import org.springframework.stereotype.Service;

import com.springcrm.module.contact.model.Contact;

@Service
public interface ContactService {

	void save(Contact contactForm);

}
