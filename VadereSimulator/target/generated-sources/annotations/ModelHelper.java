package org.vadere.simulator.models;


import org.vadere.simulator.models.potential.fields.PotentialFieldTargetRingExperiment;
import org.vadere.simulator.models.seating.SeatingModel;
import org.vadere.simulator.models.potential.PotentialFieldObstacleCompactSoftshell;
import org.vadere.simulator.models.potential.PotentialFieldPedestrianCompact;
import org.vadere.simulator.models.potential.fields.PotentialFieldSingleTargetGrid;
import org.vadere.simulator.models.osm.OptimalStepsModel;
import org.vadere.simulator.models.gnm.GradientNavigationModel;
import org.vadere.simulator.models.potential.PotentialFieldPedestrianCompactSoftshell;
import org.vadere.simulator.models.psychology.selfcategorization.SelfCatThreatModel;
import org.vadere.simulator.models.sfm.SocialForceModel;
import org.vadere.simulator.models.gnm.PotentialFieldObstacleGNM;
import org.vadere.simulator.models.potential.PotentialFieldPedestrianCA;
import org.vadere.simulator.models.potential.PotentialFieldObstacleOSM;
import org.vadere.simulator.models.bmm.BiomechanicsModel;
import org.vadere.simulator.models.potential.PotentialFieldPedestrianOSM;
import org.vadere.simulator.models.potential.PedestrianRepulsionPotentialCycle;
import org.vadere.simulator.models.osm.CellularAutomaton;
import org.vadere.simulator.models.sfm.PotentialFieldPedestrianSFM;
import org.vadere.simulator.models.ovm.OptimalVelocityModel;
import org.vadere.simulator.models.potential.PotentialFieldObstacleCA;
import org.vadere.simulator.models.potential.PotentialFieldObstacleRingExperiment;
import org.vadere.simulator.models.groups.cgm.CentroidGroupPotential;
import org.vadere.simulator.models.gnm.PotentialFieldPedestrianGNM;
import org.vadere.simulator.models.groups.sir.SIRGroupModel;
import org.vadere.simulator.models.potential.PotentialFieldObstacleCompact;
import org.vadere.simulator.models.bhm.BehaviouralHeuristicsModel;
import org.vadere.simulator.models.reynolds.ReynoldsSteeringModel;
import org.vadere.simulator.models.queuing.PotentialFieldTargetQueuingGrid;
import org.vadere.simulator.models.sfm.PotentialFieldObstacleSFM;
import org.vadere.simulator.models.groups.cgm.CentroidGroupModel;

import java.util.HashMap;
import java.util.List;
import java.util.LinkedList;
import java.util.List;


public class ModelHelper extends org.vadere.util.factory.model.BaseModelHelper{


	private static ModelHelper instance;

	//good performance threadsafe Singletone. Sync block will only be used once
	public static ModelHelper instance(){
		if(instance ==  null){
			synchronized (ModelHelper.class){
				if(instance == null){
					instance = new ModelHelper();
				}
			}
		}
		return instance;
	}


	private ModelHelper(){

		HashMap<String,Class> subModelMap;
		mainModels.put("org.vadere.simulator.models.osm.OptimalStepsModel", OptimalStepsModel.class);
		mainModels.put("org.vadere.simulator.models.gnm.GradientNavigationModel", GradientNavigationModel.class);
		mainModels.put("org.vadere.simulator.models.psychology.selfcategorization.SelfCatThreatModel", SelfCatThreatModel.class);
		mainModels.put("org.vadere.simulator.models.sfm.SocialForceModel", SocialForceModel.class);
		mainModels.put("org.vadere.simulator.models.bmm.BiomechanicsModel", BiomechanicsModel.class);
		mainModels.put("org.vadere.simulator.models.osm.CellularAutomaton", CellularAutomaton.class);
		mainModels.put("org.vadere.simulator.models.ovm.OptimalVelocityModel", OptimalVelocityModel.class);
		mainModels.put("org.vadere.simulator.models.bhm.BehaviouralHeuristicsModel", BehaviouralHeuristicsModel.class);
		mainModels.put("org.vadere.simulator.models.reynolds.ReynoldsSteeringModel", ReynoldsSteeringModel.class);

		//org.vadere.simulator.models.potential.fields
		subModelMap = new HashMap<>();
		subModelMap.put("org.vadere.simulator.models.potential.fields.PotentialFieldTargetRingExperiment", PotentialFieldTargetRingExperiment.class);
		subModelMap.put("org.vadere.simulator.models.potential.fields.PotentialFieldSingleTargetGrid", PotentialFieldSingleTargetGrid.class);
		models.put("org.vadere.simulator.models.potential.fields", subModelMap);

		//org.vadere.simulator.models.sfm
		subModelMap = new HashMap<>();
		subModelMap.put("org.vadere.simulator.models.sfm.PotentialFieldPedestrianSFM", PotentialFieldPedestrianSFM.class);
		subModelMap.put("org.vadere.simulator.models.sfm.PotentialFieldObstacleSFM", PotentialFieldObstacleSFM.class);
		models.put("org.vadere.simulator.models.sfm", subModelMap);

		//org.vadere.simulator.models.queuing
		subModelMap = new HashMap<>();
		subModelMap.put("org.vadere.simulator.models.queuing.PotentialFieldTargetQueuingGrid", PotentialFieldTargetQueuingGrid.class);
		models.put("org.vadere.simulator.models.queuing", subModelMap);

		//org.vadere.simulator.models.gnm
		subModelMap = new HashMap<>();
		subModelMap.put("org.vadere.simulator.models.gnm.PotentialFieldObstacleGNM", PotentialFieldObstacleGNM.class);
		subModelMap.put("org.vadere.simulator.models.gnm.PotentialFieldPedestrianGNM", PotentialFieldPedestrianGNM.class);
		models.put("org.vadere.simulator.models.gnm", subModelMap);

		//org.vadere.simulator.models.seating
		subModelMap = new HashMap<>();
		subModelMap.put("org.vadere.simulator.models.seating.SeatingModel", SeatingModel.class);
		models.put("org.vadere.simulator.models.seating", subModelMap);

		//org.vadere.simulator.models.groups.sir
		subModelMap = new HashMap<>();
		subModelMap.put("org.vadere.simulator.models.groups.sir.SIRGroupModel", SIRGroupModel.class);
		models.put("org.vadere.simulator.models.groups.sir", subModelMap);

		//org.vadere.simulator.models.potential
		subModelMap = new HashMap<>();
		subModelMap.put("org.vadere.simulator.models.potential.PotentialFieldObstacleCompactSoftshell", PotentialFieldObstacleCompactSoftshell.class);
		subModelMap.put("org.vadere.simulator.models.potential.PotentialFieldPedestrianCompact", PotentialFieldPedestrianCompact.class);
		subModelMap.put("org.vadere.simulator.models.potential.PotentialFieldPedestrianCompactSoftshell", PotentialFieldPedestrianCompactSoftshell.class);
		subModelMap.put("org.vadere.simulator.models.potential.PotentialFieldPedestrianCA", PotentialFieldPedestrianCA.class);
		subModelMap.put("org.vadere.simulator.models.potential.PotentialFieldObstacleOSM", PotentialFieldObstacleOSM.class);
		subModelMap.put("org.vadere.simulator.models.potential.PotentialFieldPedestrianOSM", PotentialFieldPedestrianOSM.class);
		subModelMap.put("org.vadere.simulator.models.potential.PedestrianRepulsionPotentialCycle", PedestrianRepulsionPotentialCycle.class);
		subModelMap.put("org.vadere.simulator.models.potential.PotentialFieldObstacleCA", PotentialFieldObstacleCA.class);
		subModelMap.put("org.vadere.simulator.models.potential.PotentialFieldObstacleRingExperiment", PotentialFieldObstacleRingExperiment.class);
		subModelMap.put("org.vadere.simulator.models.potential.PotentialFieldObstacleCompact", PotentialFieldObstacleCompact.class);
		models.put("org.vadere.simulator.models.potential", subModelMap);

		//org.vadere.simulator.models.groups.cgm
		subModelMap = new HashMap<>();
		subModelMap.put("org.vadere.simulator.models.groups.cgm.CentroidGroupPotential", CentroidGroupPotential.class);
		subModelMap.put("org.vadere.simulator.models.groups.cgm.CentroidGroupModel", CentroidGroupModel.class);
		models.put("org.vadere.simulator.models.groups.cgm", subModelMap);
	}

}
