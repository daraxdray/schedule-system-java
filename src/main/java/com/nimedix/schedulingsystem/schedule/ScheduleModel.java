package com.nimedix.schedulingsystem.schedule;

import com.nimedix.schedulingsystem.user.UserModel;
import jakarta.persistence.*;

import java.time.DayOfWeek;
import java.time.LocalTime;

@Entity
@Table(name = "schedules")
public class ScheduleModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserModel user;

    @Column(name = "start_time")
    private LocalTime startTime;

    @Column(name = "end_time")
    private LocalTime endTime;

    @Enumerated(EnumType.STRING)
    @Column(name = "day")
    private DayOfWeek day;


    public static boolean validateSchedule(ScheduleModel scheduleModel){



        return true;
    }


}
