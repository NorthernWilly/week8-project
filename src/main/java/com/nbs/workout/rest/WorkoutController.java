package com.nbs.workout.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nbs.workout.business.IWorkoutService;
import com.nbs.workout.constants.Constants;
import com.nbs.workout.domain.Workout;

@RestController
@CrossOrigin (origins = "http://localhost:3000")
public class WorkoutController {
	
	@Autowired
	private IWorkoutService workoutService;
	
	@GetMapping(path = Constants.WORKOUT)
	public ResponseEntity<List<Workout>> getWorkout() {
		return ResponseEntity.ok(workoutService.getWorkout());
	}
	
	@RequestMapping(path = Constants.WORKOUT_WITH_PARAM, method = RequestMethod.GET)
	public ResponseEntity<Optional<Workout>> getWorkoutId(@PathVariable("id") long id) {
		return ResponseEntity.ok(workoutService.getWorkoutId(id));
	}
	
	@RequestMapping(value = Constants.WORKOUT, method = RequestMethod.POST)
	public ResponseEntity<Workout> postWorkout(@RequestBody Workout workout) {
		return ResponseEntity.ok(workoutService.addWorkout(workout));
	}
	
	@RequestMapping(value = Constants.WORKOUT_WITH_PARAM, method = RequestMethod.DELETE)
	public ResponseEntity<List<Workout>> deleteWorkout(@PathVariable("id") long id) {
		if (!workoutService.findById(id).isPresent()) {
			return ResponseEntity.badRequest().build();
		}
		workoutService.deleteWorkout(id);
		return ResponseEntity.ok(workoutService.getWorkout());
	}
}
