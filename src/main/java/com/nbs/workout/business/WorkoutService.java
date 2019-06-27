package com.nbs.workout.business;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nbs.workout.domain.Workout;
import com.nbs.workout.persistence.WorkoutRepository;

@Service
public class WorkoutService implements IWorkoutService {
	
	@Autowired
	private WorkoutRepository workoutRepository;
	
	public List<Workout> getWorkout() {
		return workoutRepository.findAll();
	}
	
	public Optional<Workout> getWorkoutId(long id){
		return workoutRepository.findById(id);
	}
	
	public void deleteWorkout(long id) {
		workoutRepository.deleteById(id);
	}
	
	public Workout addWorkout(Workout workout) {
		return workoutRepository.save(workout);
	}
	
	public Optional<Workout> findById(long id) {
		return workoutRepository.findById(id);
	}
}
