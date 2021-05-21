package com.mendiratta.workouttracker.service

import com.mendiratta.workouttracker.exception.EntityNotFoundException
import com.mendiratta.workouttracker.model.Tracker
import com.mendiratta.workouttracker.repository.TrackerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TrackerService {

    @Autowired
    private lateinit var trackerRepository: TrackerRepository

    fun findAll(): List<Tracker> {
        return trackerRepository.findAll()
    }

    fun findById(id: String): Tracker? {
        return trackerRepository.findById(id).orElseThrow { EntityNotFoundException() }
    }

    fun save(track: Tracker): Tracker {
        return trackerRepository.save(track)
    }

    fun deleteById(id: String) {
        trackerRepository.deleteById(id)
    }
}