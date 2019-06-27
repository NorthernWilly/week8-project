package com.nbs.workout.business;

import java.util.List;
import java.util.Optional;

import com.nbs.workout.domain.Workout;

public interface IWorkoutService {
	
	List<Workout> getWorkout();
	
	Optional<Workout> getWorkoutId(long id);
	
	void deleteWorkout(long id);
	
	Workout addWorkout(Workout workout);
	
	Optional<Workout> findById(long id);

}
