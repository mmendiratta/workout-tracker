package com.mendiratta.workouttracker.controller

import com.mendiratta.workouttracker.model.WorkoutModel
import com.mendiratta.workouttracker.service.TrackerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1")
class TrackerController {

    @Autowired
    private lateinit var trackerService: TrackerService

    @GetMapping("/endpoint1")
    fun workoutTrackerEndpoint(): String {
        return "endpoint 1 test"
    }

    @GetMapping
    fun findAll(): List<WorkoutModel> {
        return trackerService.findAll()
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable id: String): WorkoutModel? {
        return trackerService.findById(id)
    }

    @PostMapping("/create")
    fun create(@RequestBody workout: WorkoutModel): WorkoutModel {
        return trackerService.save(workout)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: String) {
        trackerService.deleteById(id)
    }


}