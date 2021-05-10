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
import org.vadere.manager.traci.commandHandler.variables.VadereVar;

public class MiscAPI extends TraCIClientApi {
	public MiscAPI(TraCISocket socket) {
		super(socket, "MiscAPI");
	}

	public TraCIResponse createTargetChanger(String data) throws IOException {
		TraCIPacket p = TraCISetCommand.build(TraCICmd.SET_VADERE_STATE, "-1", VadereVar.ADD_TARGET_CHANGER.id, VadereVar.ADD_TARGET_CHANGER.type, data);

		socket.sendExact(p);

		return socket.receiveResponse();
	}

	public TraCIResponse addStimulusInfos(String data) throws IOException {
		TraCIPacket p = TraCISetCommand.build(TraCICmd.SET_VADERE_STATE, "-1", VadereVar.ADD_STIMULUS_INFOS.id, VadereVar.ADD_STIMULUS_INFOS.type, data);

		socket.sendExact(p);

		return socket.receiveResponse();
	}

	public TraCIResponse getAllStimulusInfos() throws IOException {
		TraCIPacket p = TraCIGetCommand.build(TraCICmd.GET_VADERE_VALUE, VadereVar.GET_ALL_STIMULUS_INFOS.id, "-1");

		socket.sendExact(p);

		return socket.receiveResponse();
	}

	public TraCIResponse removeTargetChanger(String elementId) throws IOException {
		TraCIPacket p = TraCISetCommand.build(TraCICmd.SET_VADERE_STATE, elementId, VadereVar.REMOVE_TARGET_CHANGER.id, VadereVar.REMOVE_TARGET_CHANGER.type, null);

		socket.sendExact(p);

		return socket.receiveResponse();
	}

}
