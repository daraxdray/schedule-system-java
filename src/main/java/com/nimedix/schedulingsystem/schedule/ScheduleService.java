package com.nimedix.schedulingsystem.schedule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleService {

    @Autowired
    ScheduleRepo scheduleRepo;

    public List<ScheduleModel> createAllSchedules(List<ScheduleModel> scheds){
        return scheduleRepo.saveAll(scheds);
    }

    public List<ScheduleModel> getAllSchedules(){
        return scheduleRepo.findAll();
    }


}
