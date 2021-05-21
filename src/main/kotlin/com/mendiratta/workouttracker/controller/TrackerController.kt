package com.mendiratta.workouttracker.controller

import com.mendiratta.workouttracker.model.Tracker
import com.mendiratta.workouttracker.service.TrackerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class TrackerController {

    @Autowired
    private lateinit var trackerService: TrackerService

    @GetMapping("/endpoint1")
    fun workoutTrackerEndpoint(): String {
        return "endpoint 1 test"
    }

    @GetMapping
    fun findAll(): List<Tracker> {
        return trackerService.findAll()
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable id: String): Tracker? {
        return trackerService.findById(id)
    }
}