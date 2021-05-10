package org.vadere.manager.client.traci;

import org.vadere.manager.client.traci.TraCIClientApi;
import org.vadere.manager.TraCISocket;
import org.vadere.manager.traci.commands.TraCIGetCommand;
import org.vadere.manager.traci.commands.TraCISetCommand;
import org.vadere.manager.traci.response.TraCIGetResponse;
import org.vadere.manager.traci.writer.TraCIPacket;
import org.vadere.manager.traci.response.TraCIResponse;
import java.io.IOException;
import java.util.ArrayList;
import org.vadere.util.geometry.shapes.VPoint;
import org.vadere.manager.traci.TraCICmd;
import org.vadere.manager.traci.commandHandler.variables.SimulationVar;

public class SimulationAPI extends TraCIClientApi {
	public SimulationAPI(TraCISocket socket) {
		super(socket, "SimulationAPI");
	}

	public TraCIResponse getDataProcessorValue(String elementID) throws IOException {
		TraCIPacket p = TraCIGetCommand.build(TraCICmd.GET_SIMULATION_VALUE, SimulationVar.DATA_PROCESSOR.id, elementID);

		socket.sendExact(p);

		return socket.receiveResponse();
	}

	public TraCIResponse getNetworkBound() throws IOException {
		TraCIPacket p = TraCIGetCommand.build(TraCICmd.GET_SIMULATION_VALUE, SimulationVar.NET_BOUNDING_BOX.id, "-1");

		socket.sendExact(p);

		return socket.receiveResponse();
	}

	public TraCIResponse getTime() throws IOException {
		TraCIPacket p = TraCIGetCommand.build(TraCICmd.GET_SIMULATION_VALUE, SimulationVar.TIME.id, "-1");

		socket.sendExact(p);

		return socket.receiveResponse();
	}

	public TraCIResponse getSimSte() throws IOException {
		TraCIPacket p = TraCIGetCommand.build(TraCICmd.GET_SIMULATION_VALUE, SimulationVar.DELTA_T.id, "-1");

		socket.sendExact(p);

		return socket.receiveResponse();
	}

	public TraCIResponse setSimConfig() throws IOException {
		TraCIPacket p = TraCISetCommand.build(TraCICmd.SET_SIMULATION_STATE, "-1", SimulationVar.SIM_CONFIG.id, SimulationVar.SIM_CONFIG.type, null);

		socket.sendExact(p);

		return socket.receiveResponse();
	}

	public TraCIResponse getHash(String data) throws IOException {
		TraCIPacket p = TraCIGetCommand.build(TraCICmd.GET_SIMULATION_VALUE, "-1" , SimulationVar.CACHE_HASH.id, SimulationVar.CACHE_HASH.type, data);

		socket.sendExact(p);

		return socket.receiveResponse();
	}

	public TraCIResponse getDepartedPedestrianId(ArrayList<String> data) throws IOException {
		TraCIPacket p = TraCIGetCommand.build(TraCICmd.GET_SIMULATION_VALUE, "-1" , SimulationVar.DEPARTED_PEDESTRIAN_IDS.id, SimulationVar.DEPARTED_PEDESTRIAN_IDS.type, data);

		socket.sendExact(p);

		return socket.receiveResponse();
	}

	public TraCIResponse getArrivedPedestrianIds(ArrayList<String> data) throws IOException {
		TraCIPacket p = TraCIGetCommand.build(TraCICmd.GET_SIMULATION_VALUE, "-1" , SimulationVar.ARRIVED_PEDESTRIAN_PEDESTRIAN_IDS.id, SimulationVar.ARRIVED_PEDESTRIAN_PEDESTRIAN_IDS.type, data);

		socket.sendExact(p);

		return socket.receiveResponse();
	}

	public TraCIResponse getPositionConversion(ArrayList<String> data) throws IOException {
		TraCIPacket p = TraCIGetCommand.build(TraCICmd.GET_SIMULATION_VALUE, "-1" , SimulationVar.POSITION_CONVERSION.id, SimulationVar.POSITION_CONVERSION.type, data);

		socket.sendExact(p);

		return socket.receiveResponse();
	}

	public TraCIResponse getCoordinateReference(ArrayList<String> data) throws IOException {
		TraCIPacket p = TraCIGetCommand.build(TraCICmd.GET_SIMULATION_VALUE, "-1" , SimulationVar.COORD_REF.id, SimulationVar.COORD_REF.type, data);

		socket.sendExact(p);

		return socket.receiveResponse();
	}

}
