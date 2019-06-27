package com.nbs.workout.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Workout {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String exerciseName;
	private Long weightUsed;
	private Long repetitions;
	
	public Workout()
	{
		
	}

	public Workout(Long id, String exerciseName, Long weightUsed, Long repetitions)
	{
		this.id = id;
		this.exerciseName = exerciseName;
		this.weightUsed = weightUsed;
		this.repetitions = repetitions;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getExerciseName() {
		return exerciseName;
	}

	public void setExerciseName(String exerciseName) {
		this.exerciseName = exerciseName;
	}

	public Long getWeightUsed() {
		return weightUsed;
	}

	public void setWeightUsed(Long weightUsed) {
		this.weightUsed = weightUsed;
	}

	public Long getRepetitions() {
		return repetitions;
	}

	public void setRepetitions(Long repetitions) {
		this.repetitions = repetitions;
	}
	
	@Override
	public String toString() {
		return "Workout [id=" + id +
				", exerciseName=" + exerciseName 
				+ ", weightUsed=" + weightUsed 
				+ ", repetitions=" + repetitions +"]";
	}
}
