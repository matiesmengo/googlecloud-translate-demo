package com.matiesmengo.googlecloud.facade;


import com.google.cloud.translate.v3.LocationName;
import com.google.cloud.translate.v3.TranslateTextRequest;
import com.google.cloud.translate.v3.Translation;
import com.google.cloud.translate.v3.TranslationServiceClient;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.stream.Collectors;

@Service
public class GoogleCloudTranslateText {
    private static final String PROJECT_ID = "matiesmengo-demo";

    // Supported Languages: https://cloud.google.com/translate/docs/languages
    public String translateText(String targetLanguage, String text) throws IOException {

        TranslationServiceClient client = TranslationServiceClient.create();
        LocationName parent = LocationName.of(PROJECT_ID, "global");

        // Supported Mime Types: https://cloud.google.com/translate/docs/supported-formats
        TranslateTextRequest request =
                TranslateTextRequest.newBuilder()
                        .setParent(parent.toString())
                        .setMimeType("text/plain")
                        .setTargetLanguageCode(targetLanguage)
                        .addContents(text)
                        .build();

        return client.translateText(request).getTranslationsList()
                .stream()
                .map(Translation::getTranslatedText)
                .collect(Collectors.joining());
    }

}
