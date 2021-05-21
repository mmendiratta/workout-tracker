package com.mendiratta.workouttracker.repository

import com.mendiratta.workouttracker.model.Tracker
import org.springframework.data.mongodb.repository.MongoRepository

interface TrackerRepository: MongoRepository<Tracker, String> {}