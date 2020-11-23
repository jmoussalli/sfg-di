package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Package :  guru.springframework.sfgdi.services
 * Created by jerom on 23/11/2020 at 13:33
 */
@Profile("ES")
@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
