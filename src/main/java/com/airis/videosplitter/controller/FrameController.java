package com.airis.videosplitter.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.airis.videosplitter.model.VideoProcessingRequest;
import com.airis.videosplitter.model.VideoProcessingResponse;


@RestController
@RequestMapping()
public class FrameController {
private static final Logger logger = LoggerFactory.getLogger(FrameController.class);
    
    @PostMapping("/process_frame")
    public VideoProcessingResponse processVideo(@RequestBody VideoProcessingRequest request) {
        logger.info("Received Frame request: {}", request.toString());
        // Implement video processing logic here
        // Generate the response based on the request
        logger.info("Received request: {}", request.getInstanceID());
         VideoProcessingResponse response = new VideoProcessingResponse();
        response.setInstanceId(request.getInstanceID());
        response.setVideofileStatus("Frame Processing-Initiated");
        logger.info("Frame response: {}", response.toString());
        return response;
    } 
}
