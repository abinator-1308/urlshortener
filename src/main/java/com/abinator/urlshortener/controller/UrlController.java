package com.abinator.urlshortener.controller;

import com.abinator.urlshortener.entry.Url;
import com.abinator.urlshortener.services.manager.UrlManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/urlShortener")
public class UrlController {

    @Autowired
    private UrlManager urlManager;

    @RequestMapping(value = "/{url}", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity shortenUrl(@PathVariable String url) {
        Url shortUrlEntry = urlManager.shortenUrl(url);
        return ResponseEntity.ok(url);
    }

    @RequestMapping(value = "/{key}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity getUrl(@PathVariable String key) {
        String url = urlManager.getUrlByKey(key);
        return ResponseEntity.ok(url);
    }
}
