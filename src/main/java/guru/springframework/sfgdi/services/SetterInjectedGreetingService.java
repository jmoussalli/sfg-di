package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Package :  guru.springframework.sfgdi.services
 * Created by jerom on 21/11/2020 at 15:09
 */
@Service
public class SetterInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World! - Setter";
    }
}
