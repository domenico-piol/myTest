package name.piol.mytest.springbootTest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class GreetingRestController {

    Logger logger = LoggerFactory.getLogger(GreetingRestController.class);

    @GetMapping("/greeting")
    public String greeting() {
        logger.info("Greeting REST service requested...");
        return "greetings...";
    }

}

