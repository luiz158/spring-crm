package com.springcrm.module.contact.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springcrm.module.contact.model.Contact;
import com.springcrm.module.contact.repository.ContactRepository;

@Service
public class ContactServiceImp implements ContactService{

	@Autowired
	private ContactRepository contactRepository;

	@Override
	public void save(Contact contactForm) {
		contactRepository.save(contactForm);
		
	}
}
