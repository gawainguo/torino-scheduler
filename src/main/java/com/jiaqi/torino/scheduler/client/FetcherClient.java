package com.jiaqi.torino.scheduler.client;

import com.jiaqi.torino.scheduler.model.dto.FetcherResponse;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("torino-fetcher")
public interface FetcherClient {
    @PostMapping("fetcher/news-api/recent")
    public FetcherResponse fetcherNewsAPI(@RequestParam("minutes") Integer minutes);
}