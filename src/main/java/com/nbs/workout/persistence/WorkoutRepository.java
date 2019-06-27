package com.nbs.workout.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nbs.workout.domain.Workout;

@Repository
	public interface WorkoutRepository extends JpaRepository<Workout, Long> {
		
}
