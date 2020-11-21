package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Package :  guru.springframework.sfgdi.services
 * Created by jerom on 21/11/2020 at 14:31
 */
@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World! - Constructor";
    }
}
