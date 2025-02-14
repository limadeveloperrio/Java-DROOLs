package com.motor.decision.service;

import com.motor.decision.dto.PersonDTO;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Service;

@Service
public class DroolsService {

	 private final KieContainer kieContainer;

	    public DroolsService() {
	        KieServices kieServices = KieServices.Factory.get();
	        this.kieContainer = kieServices.getKieClasspathContainer();
	    }

	    public PersonDTO evaluatePerson(PersonDTO person) {
	        KieSession kieSession = kieContainer.newKieSession("ksession-rules");
	        
	        try {
	            kieSession.insert(person);
	            kieSession.fireAllRules();
	        } finally {
	            kieSession.dispose();
	        }
	        
	        return person;
	    }
}

