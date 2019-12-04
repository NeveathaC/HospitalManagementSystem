package com.HospitalManagementSystem.controller;

import javax.persistence.NonUniqueResultException;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.HospitalManagementSystem.dao.HospitalManagementDao;
import com.HospitalManagementSystem.model.Patient;
import com.HospitalManagementSystem.service.HospitalManagementService;
import com.HospitalManagementSystem.service.HospitalManagementServiceImpl;

@Controller
public class HospitalManagementController {
	private static final Logger logger = LoggerFactory.getLogger(HospitalManagementController.class);
	@Autowired
	private HospitalManagementServiceImpl hospitalManagementServiceImpl;

	@RequestMapping(value = "/toEnroll")
	public String toAddPatient(Model model) {
		logger.info("toAdd patient method in controller");
		model.addAttribute("PatientBean", new Patient());
		return "enrollPatientWithValidation";
	}

	@RequestMapping(value = "/DoEnroll", method = RequestMethod.POST)

	public String doAddPatient(@Valid @ModelAttribute("PatientBean") Patient patient, BindingResult result) {
		logger.info("toAdd patient method in controller");
		Patient p = hospitalManagementServiceImpl.existByName(patient.getFirstName(), patient.getLastName());
		System.out.println(p);
		if (p == null) {
			if (result.hasErrors()) {
				logger.error("error data filled is not correct");
				return "enrollPatientWithValidation";
			} else {
				logger.info("data entered is in correct format");
				hospitalManagementServiceImpl.enrollPatient(patient);
				return "patientDetails";
			}

		} else {
			logger.info("first & last name entered is already present");
			return "invalidName";
		}
	}

}