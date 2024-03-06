package name.piol.test.myTest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * https://huggingface.co/facebook/bart-large-cnn
 */

@RestController
public class SummarizeAIRestController {

    Logger logger = LoggerFactory.getLogger(SummarizeAIRestController.class);

    @GetMapping(value = "/summarize/{article}")
    public String greeting(@PathVariable String article) {
        logger.info("Summarizing a text...");
        logger.debug(article);
        return "I am sorry Dave, you can't do that! ...yet";
    }

}

