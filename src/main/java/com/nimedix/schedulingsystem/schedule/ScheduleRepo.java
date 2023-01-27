package com.nimedix.schedulingsystem.schedule;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepo extends JpaRepository<ScheduleModel, Long > {
}
