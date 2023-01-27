package com.nimedix.schedulingsystem.event;

import org.springframework.data.jpa.repository.JpaRepository;

public interface  EventService  extends JpaRepository<EventModel, Long> {
}
