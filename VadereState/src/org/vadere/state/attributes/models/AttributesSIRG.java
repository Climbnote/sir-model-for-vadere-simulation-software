package org.vadere.state.attributes.models;

import java.util.Arrays;
import java.util.List;

import org.vadere.annotation.factories.attributes.ModelAttributeClass;
import org.vadere.state.attributes.Attributes;

@ModelAttributeClass
public class AttributesSIRG extends Attributes {

	private int infectionsAtStart = 0;
	private double infectionRate = 0.01;
	private double infectionMaxDistance = 1;
	//probability for an “infective” person to become “recovered” at every time step
	private double removeProbability = 0.5;
	//whether to decouple the infection rate from the step length of the simulation
	private boolean controlUpdateFrequencyIndependentOfStepLength = true;
	//when decoupling the infection rate from the step length of the simulation this target update frequency is used
	private double goalFrequency = 2.5;


	public int getInfectionsAtStart() { return infectionsAtStart; }

	public double getInfectionRate() {
		return infectionRate;
	}

	public double getInfectionMaxDistance() {
		return infectionMaxDistance;
	}

	public double getRemoveProbability() {
		return removeProbability;
	}

	public boolean isControlUpdateFrequencyIndependentOfStepLength() {
		return controlUpdateFrequencyIndependentOfStepLength;
	}

	public double getGoalFrequency() {
		return goalFrequency;
	}
}
