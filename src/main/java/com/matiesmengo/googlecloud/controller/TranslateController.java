package com.matiesmengo.googlecloud.controller;

import com.matiesmengo.googlecloud.services.TranslateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/translate")
public class TranslateController {

    @Autowired
    private TranslateService translateService;

    @GetMapping("/{language}")
    public String translate(@PathVariable("language") String language,
                            @RequestParam(name = "text") String text) throws IOException {
        return translateService.getTranslateDemo(language, text);
    }
}
