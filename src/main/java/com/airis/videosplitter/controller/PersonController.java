package com.airis.videosplitter.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.airis.videosplitter.model.VideoProcessingRequest;
import com.airis.videosplitter.model.DemographicResponse;


@RestController
@RequestMapping()
public class PersonController {
private static final Logger logger = LoggerFactory.getLogger(PersonController.class);
    
    @PostMapping("/process_demographic1")
    public ResponseEntity<String> processVideo(@RequestBody VideoProcessingRequest request) {
        logger.info("Received Demographic request: {}", request.toString());
        // Implement video processing logic here.
        // Generate the response based on the request
        DemographicResponse response = new DemographicResponse();
        // response.setInstanceId(request.getInstanceID());
        // response.setStatus("Demographic Processing-Initiated");
       // logger.info("Demographic response: {}", response.toString());
         String jsonResponse = "{"
            + "\"instance_id\": \"7a0d5f7e-33fb-4c41-a8b8-b1f2d5a0d656_0\","
            + "\"crops_folder_path\":\"crops/person/{person_id}/{instance_id}_{frame_id}.jpg\","
            + "\"unique_Person_id\":\"1\","
            + "\"person_id1\": {"
                + "\"age\": 34,"
                + "\"gender\": \"male\""
            + "},"
            + "\"person_id2\": {"
                + "\"age\": 57,"
                + "\"gender\": \"female\""
            + "},"
            + "\"status\":\"Demographic Processing-Success\""
        + "}";

        // Return the JSON string wrapped in a ResponseEntity
        return ResponseEntity.ok(jsonResponse);
        //return response;
    } 
}
