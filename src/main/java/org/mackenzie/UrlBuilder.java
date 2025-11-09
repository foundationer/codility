package org.mackenzie;

import java.util.Map;

public class UrlBuilder {

    private String protocol = "http://";
    private String host;
    private String port = "";
    private String path = "";
    private String queryParams = "";

    public UrlBuilder https() {
        this.protocol = "https://";
        return this;
    }

    public UrlBuilder host(String host) {
        this.host = host;
        return this;
    }

    public UrlBuilder port(int port) {
        this.port = ":" + String.valueOf(port);
        return this;
    }

    public UrlBuilder path(String path) {
        this.path = path;
        return this;
    }

    public UrlBuilder queryParams(Map<String, String> params) {
        if(params.isEmpty()) {
            this.queryParams = "";
        } else {
            StringBuilder builder = new StringBuilder();
            builder.append("?");
            params.forEach((key, value) -> builder.append(key).append("=").append(value).append("&"));
            this.queryParams = builder.toString();
        }
        return this;
    }

    public String build()
    {
        return protocol + host + port + path + queryParams;
    }
}
