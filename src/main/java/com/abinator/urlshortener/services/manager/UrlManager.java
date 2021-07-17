package com.abinator.urlshortener.services.manager;

import com.abinator.urlshortener.entry.Url;

import javax.validation.constraints.NotBlank;

public interface UrlManager {
    public String getUrlByKey(@NotBlank String key);
    public Url shortenUrl(@NotBlank String url);

}
