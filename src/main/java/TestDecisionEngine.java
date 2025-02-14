import com.motor.decision.dto.PersonDTO;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class TestDecisionEngine {
    public static void main(String[] args) {
       
        KieServices kieServices = KieServices.Factory.get();
        KieContainer kieContainer = kieServices.getKieClasspathContainer();
        KieSession kieSession = kieContainer.newKieSession("ksession-rules"); 

        PersonDTO person = new PersonDTO();
        person.setName("Bruno");
        
        person.setAge(16);
        person.setSex("M");
        person.setIsWorking(false);
 
        kieSession.insert(person);
  
        kieSession.fireAllRules();
        kieSession.dispose();

        System.out.println("Benefícios concedidos a " + person.getName() + ": " + person);
    }
}

