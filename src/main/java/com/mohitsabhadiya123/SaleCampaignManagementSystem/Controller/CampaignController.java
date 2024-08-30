package com.mohitsabhadiya123.SaleCampaignManagementSystem.Controller;


import com.mohitsabhadiya123.SaleCampaignManagementSystem.Models_Entities.SaleCampaign;
import com.mohitsabhadiya123.SaleCampaignManagementSystem.SchedulerTasks.CampaignApplying;
import com.mohitsabhadiya123.SaleCampaignManagementSystem.Service.CampaignServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Campaign")
public class CampaignController {

    @Autowired
    private CampaignServices campaignServices;

    @Autowired
    private CampaignApplying campaignApplying;
    // Campaign Part :-

    // Add data in database
    @PostMapping("/addCampaign")
    public ResponseEntity<?> addCampaign(@RequestBody SaleCampaign saleCampaign) {
        return new ResponseEntity<>(campaignServices.addCampaign(saleCampaign), HttpStatus.ACCEPTED);
    }

    @PutMapping("/applyCampaign")
    public void applyCampaign(){
        campaignApplying.startCampaign();
    }

    // Campaign Discount Apply :-

//    @PostMapping("/addCampaignDiscount")
//    public ResponseEntity<?> addCampaignDiscount(@RequestBody ) {
//        return new ResponseEntity<>("",HttpStatus.ACCEPTED);
//    }
}
