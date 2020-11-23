package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Package :  guru.springframework.sfgdi.services
 * Created by jerom on 21/11/2020 at 18:31
 */
@Primary
@Service
public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - From the PRIMARY bean";
    }
}
