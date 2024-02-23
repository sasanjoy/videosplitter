package com.airis.videosplitter.controller;

import java.util.ArrayList;
import java.util.HashMap;
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
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.airis.videosplitter.model.DemographicResponse;
import com.airis.videosplitter.model.DemographicRequest;


@RestController
@RequestMapping()
public class DemographicController {
private static final Logger logger = LoggerFactory.getLogger(DemographicController.class);
    
    @PostMapping("/process_demographic")
    public ResponseEntity<String> processVideo(@RequestBody DemographicRequest request) throws JsonProcessingException {
        logger.info("Received Demographic request: {}", request.toString());
        // Implement video processing logic here.
        // Generate the response based on the request
        // DemographicResponse response = new DemographicResponse();
        //  response.setInstanceId(request.getInstance_id());
        //  response.setPersonId(request.getPerson_id());
        //  response.setAge("20-30");
        //  response.setCropsFolder(request.getCrops_folder());
        //  response.setGender("Male");
        //  response.setPersonStatus("Demographic Processing-Success");
        // logger.info("Demographic response: {}", response.toString());
       // String response = "{\"id\":{\"instanceId\":\"7a0d5f7e-33fb-4c41-a8b8-b1f2d5a0d656_1\",\"personId\":1},\"age\":\"20-30\",\"gender\":\"Male\",\"cropsFolder\":\"C:\\\\D_Drive\\\\airis\\\\videoStorage\\\\videoFilesInference\\\\frameData\\\\7a0d5f7e-33fb-4c41-a8b8-b1f2d5a0d656_1\",\"cropsFolderPath\":null,\"uniquePersonId\":1,\"personStatus\":\"Demographic Processing-Success\"}";
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Object> responseMap = new HashMap<>();

        Map<String, Object> idMap = new HashMap<>();
        idMap.put("instanceId", request.getInstance_id());
        idMap.put("personId", request.getPerson_id());

        responseMap.put("id", idMap);
        responseMap.put("age", "20-30");
        responseMap.put("gender", "Male");
        responseMap.put("cropsFolder", request.getCrops_folder());
        responseMap.put("cropsFolderPath", "");
        responseMap.put("uniquePersonId", 0);
        responseMap.put("personStatus", "Demographic Processing-Success");

        String response = objectMapper.writeValueAsString(responseMap); 

        
        return ResponseEntity.ok(response);
        //return response;
    } 
}
