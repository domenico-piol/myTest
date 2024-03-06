package name.piol.mytest.springbootTest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class WelcomeController {

    Logger logger = LoggerFactory.getLogger(WelcomeController.class);

    @GetMapping("/")
    public String main(Model model) {
        logger.info("This is an info log-message, welcome-page requested...");
        return "welcome";
    }

}

