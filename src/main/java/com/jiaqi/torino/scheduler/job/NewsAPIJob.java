package com.jiaqi.torino.scheduler.job;

import com.jiaqi.torino.scheduler.client.FetcherClient;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@DisallowConcurrentExecution
@Component
public class NewsAPIJob implements Job {

    @Autowired
    private FetcherClient fetcherClient;

    @Override
    public void execute(JobExecutionContext arg0) throws JobExecutionException {
        fetcherClient.fetcherNewsAPI(1);
    }    
}