package com.mendiratta.workouttracker.repository

import com.mendiratta.workouttracker.model.WorkoutModel
import org.springframework.data.mongodb.repository.MongoRepository

interface TrackerRepository: MongoRepository<WorkoutModel, String> {}