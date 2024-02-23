package com.airis.videosplitter.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.airis.videosplitter.model.InteractionRequest;
import com.airis.videosplitter.model.InteractionResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping()
public class InteractionController {
private static final Logger logger = LoggerFactory.getLogger(InteractionController.class);
    
    @PostMapping("/process_interaction")
    public ResponseEntity<String> processVideo(@RequestBody InteractionRequest request) throws JsonProcessingException {
        logger.info("Received Interaction request: {}", request.toString());
        //request.getFrameDetailsId();
        
       
        // String responseString = "{\"interactionStatus\": 1, "
        //                      + "\"interactionCategory\":" + request.getInteractionCategory() +", "
        //                      + "\"frameDetailsId\":"+ request.getFrameDetailsId() +","
        //                      + "\"objects\": [{\"name\": \"table\", \"interaction_type\": \"sitting\", \"x\": 22, \"y\": 43}, "
        //                      + "{\"name\": \"chair\", \"interaction_type\": \"sitting\", \"x\": 15, \"y\": 30}]}";

         ObjectMapper objectMapper = new ObjectMapper();
        InteractionResponse response=new InteractionResponse();
        response.setFrameDetailsId(request.getFrameDetailsId());
        response.setHandInteractionStatus(2);
        response.setInteractionCategory(request.getInteractionCategory());
        response.setObjects("[{\\\"name\\\": \\\"table\\\", \\\"interaction_type\\\": \\\"sitting\\\", \\\"x\\\": 22, \\\"y\\\": 43}, \"\r\n" + //
                "// + \"{\\\"name\\\": \\\"chair\\\", \\\"interaction_type\\\": \\\"sitting\\\", \\\"x\\\": 15, \\\"y\\\": 30}]");
        String responseString = objectMapper.writeValueAsString(response); 

        logger.info("Interaction response: {}", responseString);
        return ResponseEntity.ok(responseString);
        //return response;
    } 
}

