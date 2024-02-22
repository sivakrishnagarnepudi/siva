package com.example.demo.controller;

import com.example.demo.model.LicenseData;

import com.example.demo.service.LicenseDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LicenseController {

    @Autowired
    private LicenseDataService licenseDataService;

    @PostMapping("/process-image")
    public ResponseEntity<?> processImage(@RequestBody String imageData) {
        try {
            LicenseData extractedData = licenseDataService.processLicenseImage(imageData);
            return new ResponseEntity<>(extractedData, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Error processing image: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}