package com.airis.videosplitter.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.airis.videosplitter.model.VideoData;
import com.airis.videosplitter.model.VideoFile;
import com.airis.videosplitter.model.VideoProcessingRequest;


import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping()
public class VideoController {
private static final Logger logger = LoggerFactory.getLogger(VideoController.class);

   // @GetMapping("/videoData")
   // public ResponseEntity<VideoData> getVideoData() {
    //sending Json response
    @PostMapping("/preprocess_video")
    public ResponseEntity<VideoData> getVideoData(@RequestBody VideoProcessingRequest request) {
       // VideoData videoData = createSampleVideoData(); // You can replace this with your data retrieval logic
       
       VideoData videoData = new VideoData();
         logger.info("Received video request: {}", request.toString());
       // response.setFileList("C:\\D_Drive\\airis\\videoStorage\\videoFilesInference\\globalInstancesStorageTemp\\"+request.getInstanceID()+"\\"+request.getInstanceID()+".mp4");
       // videoData.setInstanceID(request.getInstanceID());
       // videoData.setTmpStorePath(request.getTmp_path()+"\\"+request.getInstanceID());
         videoData.setInstanceID("7a0d5f7e-33fb-4c41-a8b8-b1f2d5a0d656");
        videoData.setTmpStorePath("C:\\D_Drive\\airis\\videoStorage\\videoFilesInference\\globalInstancesStorageTemp\\7a0d5f7e-33fb-4c41-a8b8-b1f2d5a0d656");
        //response.setMetadata("600"+"-"+"2023-09-23T10:00:00");
        //7a0d5f7e-33fb-4c41-a8b8-b1f2d5a0d656_3.mp4
        //videoData.setTmpStorePath("/videoStorage/videoFilesInference/globalInstancesStorageTemp/example_instance_1");
        videoData.setSourcePath(request.getSource_path());
       // videoData.setTmpPath("/videoStorage/videoFilesInference/globalInstancesStorageTemp");
        //videoData.setInstanceID("example_instance_1");

        List<VideoFile> videoFile = new ArrayList<>();
        //videoFile.add(new VideoFile("C:\\D_Drive\\airis\\videoStorage\\videoFilesInference\\globalInstancesStorageTemp\\7a0d5f7e-33fb-4c41-a8b8-b1f2d5a0d656\\7a0d5f7e-33fb-4c41-a8b8-b1f2d5a0d656_0.mp4", request.getCut_duration(), "2023-09-23 10:10:00", "5000"));
        videoFile.add(new VideoFile("C:\\D_Drive\\airis\\videoStorage\\videoFilesInference\\globalInstancesStorageTemp\\7a0d5f7e-33fb-4c41-a8b8-b1f2d5a0d656\\7a0d5f7e-33fb-4c41-a8b8-b1f2d5a0d656_1.mp4", request.getCut_duration(), "2023-09-23 10:20:00"));
        videoFile.add(new VideoFile("C:\\D_Drive\\airis\\videoStorage\\videoFilesInference\\globalInstancesStorageTemp\\7a0d5f7e-33fb-4c41-a8b8-b1f2d5a0d656\\7a0d5f7e-33fb-4c41-a8b8-b1f2d5a0d656_2.mp4", request.getCut_duration(), "2023-09-23 10:30:00"));
        videoFile.add(new VideoFile("C:\\D_Drive\\airis\\videoStorage\\videoFilesInference\\globalInstancesStorageTemp\\7a0d5f7e-33fb-4c41-a8b8-b1f2d5a0d656\\7a0d5f7e-33fb-4c41-a8b8-b1f2d5a0d656_3.mp4", request.getCut_duration(), "2023-09-23 10:40:00"));

        videoData.setVideoList(videoFile);

        // Create a ResponseEntity with the videoData and HTTP status OK (200)
        return new ResponseEntity<>(videoData, HttpStatus.OK);
    }

    
}

