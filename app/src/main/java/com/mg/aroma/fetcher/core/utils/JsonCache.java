package com.mg.aroma.fetcher.core.utils;

/**
 * Created by Mahmoud Galal on 30/09/2016.
 */
public interface JsonCache {
     String getJson(String url);
     void putJson(String url, String json);
}
