package com.abinator.urlshortener.services.manager;

import com.abinator.urlshortener.entry.Url;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;

@Validated
public interface UrlManager {
    public String getUrlByKey(@NotBlank String key);
    public Url shortenUrl(@NotBlank String url);
}
