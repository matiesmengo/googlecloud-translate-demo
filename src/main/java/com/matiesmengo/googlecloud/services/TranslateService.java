package com.matiesmengo.googlecloud.services;

import com.matiesmengo.googlecloud.facade.GoogleCloudTranslateText;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class TranslateService {
    @Autowired
    private GoogleCloudTranslateText translate;

    public String getTranslateDemo(String language, String text) throws IOException {
        return translate.translateText(language, text);
    }
}
