package com.nimedix.schedulingsystem.schedule;

import com.nimedix.schedulingsystem.utils.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ScheduleController {

    @Autowired
    ScheduleService shedService;

    @PostMapping("schedulingsystem/schedule/create-schedule")
    public ApiResponse<Object> createSchedule(@RequestBody List<ScheduleModel> schedules){

        System.out.println(schedules.get(0));
         List<ScheduleModel> result =   shedService.createAllSchedules(schedules);
         if(result != null){
             return new ApiResponse<>("All schedules created", HttpStatus.CREATED,result);
         }
         return new ApiResponse<>("Could not create schedules",HttpStatus.EXPECTATION_FAILED);



    }


    @GetMapping("schedulingsystem/schedule/get-all")
    public ApiResponse<Object> createSchedule(){

         List<ScheduleModel> result =   shedService.getAllSchedules();
         if(result != null){
             return new ApiResponse<>("All schedules fetched", HttpStatus.CREATED,result);
         }
         return new ApiResponse<>("Could not fetch schedules",HttpStatus.EXPECTATION_FAILED);



    }



}
