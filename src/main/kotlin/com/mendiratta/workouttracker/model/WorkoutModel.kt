package com.mendiratta.workouttracker.model

// Simple first model to track basic info about a weights session
data class WorkoutModel (
    val id: String,
    val exercise: String,
    val reps: Float,
    val weight: Int
)