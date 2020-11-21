package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

/**
 * Package :  guru.springframework.sfgdi.controllers
 * Created by jerom on 21/11/2020 at 13:14
 */
@Controller
public class MyController {

    public String sayHello(){
        System.out.println("Hello World!");

        return "Hi Folks!";
    }
}
