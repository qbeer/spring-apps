package app.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Static {

    @RequestMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
    int getIndex() {
        return 0;
    }

}
