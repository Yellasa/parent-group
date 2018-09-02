package com.yt.sutde.geteway.zuul.fallback;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/**
 * 针对服务级别的回退
 */
@Component
public class ZuulFallbackProvider implements org.springframework.cloud.netflix.zuul.filters.route.ZuulFallbackProvider
{
    @Override
    public String getRoute()
    {
        //表明是哪个微服务的回退
        return "service-b";
    }

    @Override
    public ClientHttpResponse fallbackResponse()
    {
        return new ClientHttpResponse()
        {
            @Override
            public HttpStatus getStatusCode() throws IOException
            {
                //fallback 的状态马
                return HttpStatus.OK;
            }

            @Override
            public int getRawStatusCode() throws IOException
            {
                return this.getStatusCode().value();
            }

            @Override
            public String getStatusText() throws IOException
            {
                //状态文本
                return this.getStatusCode().getReasonPhrase();
            }

            @Override
            public void close()
            {

            }

            @Override
            public InputStream getBody() throws IOException
            {
                return new ByteArrayInputStream("b 服务不可用，请稍后再试.".getBytes());
            }

            @Override
            public HttpHeaders getHeaders()
            {
                HttpHeaders headers = new HttpHeaders();
                MediaType mt = new MediaType("application","json", Charset.forName("UTF-8"));
                headers.setContentType(mt);
                return headers;
            }
        };
    }
}
