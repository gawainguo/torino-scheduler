package com.jiaqi.torino.scheduler.model.dto;

import java.util.HashMap;
import java.util.Map;

import lombok.Data;

@Data
public class FetcherResponse {
    private Map<String, Object> data = new HashMap();
    private boolean success;
}