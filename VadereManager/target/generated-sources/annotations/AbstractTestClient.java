package org.vadere.manager.client; 

import org.vadere.manager.TraCISocket;
import org.vadere.manager.client.ConsoleReader;
import java.io.IOException;

public abstract class AbstractTestClient {
	protected org.vadere.manager.client.traci.MiscAPI miscapi;
	protected org.vadere.manager.client.traci.PersonAPI personapi;
	protected org.vadere.manager.client.traci.SimulationAPI simulationapi;
	protected org.vadere.manager.client.traci.PolygonAPI polygonapi;

	public AbstractTestClient() { }

	public void init(TraCISocket socket, ConsoleReader consoleReader){
		miscapi = new org.vadere.manager.client.traci.MiscAPI(socket);
		personapi = new org.vadere.manager.client.traci.PersonAPI(socket);
		simulationapi = new org.vadere.manager.client.traci.SimulationAPI(socket);
		polygonapi = new org.vadere.manager.client.traci.PolygonAPI(socket);

		consoleReader.addCommand("va.createTargetChanger", "", this::miscapi_createTargetChanger);
		consoleReader.addCommand("va.addStimulusInfos", "", this::miscapi_addStimulusInfos);
		consoleReader.addCommand("va.getAllStimulusInfos", "", this::miscapi_getAllStimulusInfos);
		consoleReader.addCommand("va.removeTargetChanger", "", this::miscapi_removeTargetChanger);
		consoleReader.addCommand("pers.getHasNextTarget", "", this::personapi_getHasNextTarget);
		consoleReader.addCommand("pers.getNextTargetListIndex", "", this::personapi_getNextTargetListIndex);
		consoleReader.addCommand("pers.setNextTargetListIndex", "", this::personapi_setNextTargetListIndex);
		consoleReader.addCommand("pers.getIdList", "", this::personapi_getIdList);
		consoleReader.addCommand("pers.getNextFreeId", "", this::personapi_getNextFreeId);
		consoleReader.addCommand("pers.getIdCount", "", this::personapi_getIdCount);
		consoleReader.addCommand("pers.getFreeFlowSpeed", "", this::personapi_getFreeFlowSpeed);
		consoleReader.addCommand("pers.setFreeFlowSpeed", "", this::personapi_setFreeFlowSpeed);
		consoleReader.addCommand("pers.getPosition2D", "", this::personapi_getPosition2D);
		consoleReader.addCommand("pers.setPosition2D", "", this::personapi_setPosition2D);
		consoleReader.addCommand("pers.getPosition3D", "", this::personapi_getPosition3D);
		consoleReader.addCommand("pers.getVelocity", "", this::personapi_getVelocity);
		consoleReader.addCommand("pers.getMaximumSpeed", "", this::personapi_getMaximumSpeed);
		consoleReader.addCommand("pers.getPosition2DList", "", this::personapi_getPosition2DList);
		consoleReader.addCommand("pers.getLength", "", this::personapi_getLength);
		consoleReader.addCommand("pers.getWidth", "", this::personapi_getWidth);
		consoleReader.addCommand("pers.getRoadId", "", this::personapi_getRoadId);
		consoleReader.addCommand("pers.getAngle", "", this::personapi_getAngle);
		consoleReader.addCommand("pers.getType", "", this::personapi_getType);
		consoleReader.addCommand("pers.getTargetList", "", this::personapi_getTargetList);
		consoleReader.addCommand("pers.setInformation", "", this::personapi_setInformation);
		consoleReader.addCommand("pers.setTargetList", "", this::personapi_setTargetList);
		consoleReader.addCommand("pers.createNew", "", this::personapi_createNew);
		consoleReader.addCommand("sim.getDataProcessorValue", "", this::simulationapi_getDataProcessorValue);
		consoleReader.addCommand("sim.getNetworkBound", "", this::simulationapi_getNetworkBound);
		consoleReader.addCommand("sim.getTime", "", this::simulationapi_getTime);
		consoleReader.addCommand("sim.getSimSte", "", this::simulationapi_getSimSte);
		consoleReader.addCommand("sim.setSimConfig", "", this::simulationapi_setSimConfig);
		consoleReader.addCommand("sim.getHash", "", this::simulationapi_getHash);
		consoleReader.addCommand("sim.getDepartedPedestrianId", "", this::simulationapi_getDepartedPedestrianId);
		consoleReader.addCommand("sim.getArrivedPedestrianIds", "", this::simulationapi_getArrivedPedestrianIds);
		consoleReader.addCommand("sim.getPositionConversion", "", this::simulationapi_getPositionConversion);
		consoleReader.addCommand("sim.getCoordinateReference", "", this::simulationapi_getCoordinateReference);
		consoleReader.addCommand("poly.getTopographyBounds", "", this::polygonapi_getTopographyBounds);
		consoleReader.addCommand("poly.getIDList", "", this::polygonapi_getIDList);
		consoleReader.addCommand("poly.getIDCount", "", this::polygonapi_getIDCount);
		consoleReader.addCommand("poly.getType", "", this::polygonapi_getType);
		consoleReader.addCommand("poly.getShape", "", this::polygonapi_getShape);
		consoleReader.addCommand("poly.getCentroid", "", this::polygonapi_getCentroid);
		consoleReader.addCommand("poly.getDistance", "", this::polygonapi_getDistance);
		consoleReader.addCommand("poly.getColor", "", this::polygonapi_getColor);
		consoleReader.addCommand("poly.getPosition2D", "", this::polygonapi_getPosition2D);
		consoleReader.addCommand("poly.getImageFile", "", this::polygonapi_getImageFile);
		consoleReader.addCommand("poly.getImageWidth", "", this::polygonapi_getImageWidth);
		consoleReader.addCommand("poly.getImageHeight", "", this::polygonapi_getImageHeight);
		consoleReader.addCommand("poly.getImageAngle", "", this::polygonapi_getImageAngle);
	}

		abstract public void miscapi_createTargetChanger (String args[]) throws IOException;
		abstract public void miscapi_addStimulusInfos (String args[]) throws IOException;
		abstract public void miscapi_getAllStimulusInfos (String args[]) throws IOException;
		abstract public void miscapi_removeTargetChanger (String args[]) throws IOException;
		abstract public void personapi_getHasNextTarget (String args[]) throws IOException;
		abstract public void personapi_getNextTargetListIndex (String args[]) throws IOException;
		abstract public void personapi_setNextTargetListIndex (String args[]) throws IOException;
		abstract public void personapi_getIdList (String args[]) throws IOException;
		abstract public void personapi_getNextFreeId (String args[]) throws IOException;
		abstract public void personapi_getIdCount (String args[]) throws IOException;
		abstract public void personapi_getFreeFlowSpeed (String args[]) throws IOException;
		abstract public void personapi_setFreeFlowSpeed (String args[]) throws IOException;
		abstract public void personapi_getPosition2D (String args[]) throws IOException;
		abstract public void personapi_setPosition2D (String args[]) throws IOException;
		abstract public void personapi_getPosition3D (String args[]) throws IOException;
		abstract public void personapi_getVelocity (String args[]) throws IOException;
		abstract public void personapi_getMaximumSpeed (String args[]) throws IOException;
		abstract public void personapi_getPosition2DList (String args[]) throws IOException;
		abstract public void personapi_getLength (String args[]) throws IOException;
		abstract public void personapi_getWidth (String args[]) throws IOException;
		abstract public void personapi_getRoadId (String args[]) throws IOException;
		abstract public void personapi_getAngle (String args[]) throws IOException;
		abstract public void personapi_getType (String args[]) throws IOException;
		abstract public void personapi_getTargetList (String args[]) throws IOException;
		abstract public void personapi_setInformation (String args[]) throws IOException;
		abstract public void personapi_setTargetList (String args[]) throws IOException;
		abstract public void personapi_createNew (String args[]) throws IOException;
		abstract public void simulationapi_getDataProcessorValue (String args[]) throws IOException;
		abstract public void simulationapi_getNetworkBound (String args[]) throws IOException;
		abstract public void simulationapi_getTime (String args[]) throws IOException;
		abstract public void simulationapi_getSimSte (String args[]) throws IOException;
		abstract public void simulationapi_setSimConfig (String args[]) throws IOException;
		abstract public void simulationapi_getHash (String args[]) throws IOException;
		abstract public void simulationapi_getDepartedPedestrianId (String args[]) throws IOException;
		abstract public void simulationapi_getArrivedPedestrianIds (String args[]) throws IOException;
		abstract public void simulationapi_getPositionConversion (String args[]) throws IOException;
		abstract public void simulationapi_getCoordinateReference (String args[]) throws IOException;
		abstract public void polygonapi_getTopographyBounds (String args[]) throws IOException;
		abstract public void polygonapi_getIDList (String args[]) throws IOException;
		abstract public void polygonapi_getIDCount (String args[]) throws IOException;
		abstract public void polygonapi_getType (String args[]) throws IOException;
		abstract public void polygonapi_getShape (String args[]) throws IOException;
		abstract public void polygonapi_getCentroid (String args[]) throws IOException;
		abstract public void polygonapi_getDistance (String args[]) throws IOException;
		abstract public void polygonapi_getColor (String args[]) throws IOException;
		abstract public void polygonapi_getPosition2D (String args[]) throws IOException;
		abstract public void polygonapi_getImageFile (String args[]) throws IOException;
		abstract public void polygonapi_getImageWidth (String args[]) throws IOException;
		abstract public void polygonapi_getImageHeight (String args[]) throws IOException;
		abstract public void polygonapi_getImageAngle (String args[]) throws IOException;

}
