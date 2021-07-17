package com.abinator.urlshortener.services.manager.impl;

import com.abinator.urlshortener.entry.Url;
import com.abinator.urlshortener.services.manager.UrlManager;

import javax.validation.constraints.NotBlank;

public class UrlManagerImpl implements UrlManager {
    @Override
    public String getUrlByKey(@NotBlank String key) {
        return null;
    }

    @Override
    public Url shortenUrl(@NotBlank String url) {
        return null;
    }
}
