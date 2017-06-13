package com.springcrm.module.contact.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.springcrm.core.util.HiararchyUtils;
import com.springcrm.module.contact.model.City;
import com.springcrm.module.contact.model.Contact;
import com.springcrm.module.contact.model.Province;
import com.springcrm.module.contact.repository.CityRepository;
import com.springcrm.module.contact.repository.ProvinceRepository;
import com.springcrm.module.contact.service.ContactService;
import com.springcrm.module.contact.validator.ContactValidator;

@Controller
@RequestMapping(value = "/contact")
public class ContactController {

	@Autowired
	private ContactService contactService;
	
	@Autowired
	private ProvinceRepository provinceRepository;
	
	@Autowired
	private CityRepository cityRepository;
	
	private final String MODULE_TEMPLATE_ROOT = "admin/module/contact/";

	
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public String create(Model model) {	
		
		List<Province> provinces = provinceRepository.findAll();
		model.addAttribute("provinces", provinces);
		
		model.addAttribute("entityForm", new Contact());
		
		return MODULE_TEMPLATE_ROOT + "create";
	}
	
	@RequestMapping(value="/store", method=RequestMethod.POST)
	public String store(@ModelAttribute("entityForm") Contact contactForm,
			BindingResult bindingResult, final RedirectAttributes redirectAttributes, Model model) {
		

		ContactValidator contactValidator = new ContactValidator();
		contactValidator.validate(contactForm, bindingResult);
        
		if (bindingResult.hasErrors()) {

			return MODULE_TEMPLATE_ROOT+"create";
        } else {
        	contactService.save(contactForm);
        	redirectAttributes.addFlashAttribute("message", "Successfully added..");
    		return "redirect:/contact/index";
        }
        }
		
        
		
	}

