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
import org.vadere.manager.traci.commandHandler.variables.PersonVar;

public class PersonAPI extends TraCIClientApi {
	public PersonAPI(TraCISocket socket) {
		super(socket, "PersonAPI");
	}

	public TraCIResponse getHasNextTarget(String elementID) throws IOException {
		TraCIPacket p = TraCIGetCommand.build(TraCICmd.GET_PERSON_VALUE, PersonVar.HAS_NEXT_TARGET.id, elementID);

		socket.sendExact(p);

		return socket.receiveResponse();
	}

	public TraCIResponse getNextTargetListIndex(String elementID) throws IOException {
		TraCIPacket p = TraCIGetCommand.build(TraCICmd.GET_PERSON_VALUE, PersonVar.NEXT_TARGET_LIST_INDEX.id, elementID);

		socket.sendExact(p);

		return socket.receiveResponse();
	}

	public TraCIResponse setNextTargetListIndex(String elementId, Integer data) throws IOException {
		TraCIPacket p = TraCISetCommand.build(TraCICmd.SET_PERSON_STATE, elementId, PersonVar.NEXT_TARGET_LIST_INDEX.id, PersonVar.NEXT_TARGET_LIST_INDEX.type, data);

		socket.sendExact(p);

		return socket.receiveResponse();
	}

	public TraCIResponse getIdList() throws IOException {
		TraCIPacket p = TraCIGetCommand.build(TraCICmd.GET_PERSON_VALUE, PersonVar.ID_LIST.id, "-1");

		socket.sendExact(p);

		return socket.receiveResponse();
	}

	public TraCIResponse getNextFreeId() throws IOException {
		TraCIPacket p = TraCIGetCommand.build(TraCICmd.GET_PERSON_VALUE, PersonVar.NEXT_ID.id, "-1");

		socket.sendExact(p);

		return socket.receiveResponse();
	}

	public TraCIResponse getIdCount() throws IOException {
		TraCIPacket p = TraCIGetCommand.build(TraCICmd.GET_PERSON_VALUE, PersonVar.COUNT.id, "-1");

		socket.sendExact(p);

		return socket.receiveResponse();
	}

	public TraCIResponse getFreeFlowSpeed(String elementID) throws IOException {
		TraCIPacket p = TraCIGetCommand.build(TraCICmd.GET_PERSON_VALUE, PersonVar.SPEED.id, elementID);

		socket.sendExact(p);

		return socket.receiveResponse();
	}

	public TraCIResponse setFreeFlowSpeed(String elementId, Double data) throws IOException {
		TraCIPacket p = TraCISetCommand.build(TraCICmd.SET_PERSON_STATE, elementId, PersonVar.SPEED.id, PersonVar.SPEED.type, data);

		socket.sendExact(p);

		return socket.receiveResponse();
	}

	public TraCIResponse getPosition2D(String elementID) throws IOException {
		TraCIPacket p = TraCIGetCommand.build(TraCICmd.GET_PERSON_VALUE, PersonVar.POSITION.id, elementID);

		socket.sendExact(p);

		return socket.receiveResponse();
	}

	public TraCIResponse setPosition2D(String elementId, VPoint data) throws IOException {
		TraCIPacket p = TraCISetCommand.build(TraCICmd.SET_PERSON_STATE, elementId, PersonVar.POSITION.id, PersonVar.POSITION.type, data);

		socket.sendExact(p);

		return socket.receiveResponse();
	}

	public TraCIResponse getPosition3D(String elementID) throws IOException {
		TraCIPacket p = TraCIGetCommand.build(TraCICmd.GET_PERSON_VALUE, PersonVar.POSITION3D.id, elementID);

		socket.sendExact(p);

		return socket.receiveResponse();
	}

	public TraCIResponse getVelocity(String elementID) throws IOException {
		TraCIPacket p = TraCIGetCommand.build(TraCICmd.GET_PERSON_VALUE, PersonVar.VELOCITY.id, elementID);

		socket.sendExact(p);

		return socket.receiveResponse();
	}

	public TraCIResponse getMaximumSpeed(String elementID) throws IOException {
		TraCIPacket p = TraCIGetCommand.build(TraCICmd.GET_PERSON_VALUE, PersonVar.MAXSPEED.id, elementID);

		socket.sendExact(p);

		return socket.receiveResponse();
	}

	public TraCIResponse getPosition2DList() throws IOException {
		TraCIPacket p = TraCIGetCommand.build(TraCICmd.GET_PERSON_VALUE, PersonVar.POSITION_LIST.id, "-1");

		socket.sendExact(p);

		return socket.receiveResponse();
	}

	public TraCIResponse getLength(String elementID) throws IOException {
		TraCIPacket p = TraCIGetCommand.build(TraCICmd.GET_PERSON_VALUE, PersonVar.LENGTH.id, elementID);

		socket.sendExact(p);

		return socket.receiveResponse();
	}

	public TraCIResponse getWidth(String elementID) throws IOException {
		TraCIPacket p = TraCIGetCommand.build(TraCICmd.GET_PERSON_VALUE, PersonVar.WIDTH.id, elementID);

		socket.sendExact(p);

		return socket.receiveResponse();
	}

	public TraCIResponse getRoadId(String elementID) throws IOException {
		TraCIPacket p = TraCIGetCommand.build(TraCICmd.GET_PERSON_VALUE, PersonVar.ROAD_ID.id, elementID);

		socket.sendExact(p);

		return socket.receiveResponse();
	}

	public TraCIResponse getAngle(String elementID) throws IOException {
		TraCIPacket p = TraCIGetCommand.build(TraCICmd.GET_PERSON_VALUE, PersonVar.ANGLE.id, elementID);

		socket.sendExact(p);

		return socket.receiveResponse();
	}

	public TraCIResponse getType(String elementID) throws IOException {
		TraCIPacket p = TraCIGetCommand.build(TraCICmd.GET_PERSON_VALUE, PersonVar.TYPE.id, elementID);

		socket.sendExact(p);

		return socket.receiveResponse();
	}

	public TraCIResponse getTargetList(String elementID) throws IOException {
		TraCIPacket p = TraCIGetCommand.build(TraCICmd.GET_PERSON_VALUE, PersonVar.TARGET_LIST.id, elementID);

		socket.sendExact(p);

		return socket.receiveResponse();
	}

	public TraCIResponse setInformation(String elementId) throws IOException {
		TraCIPacket p = TraCISetCommand.build(TraCICmd.SET_PERSON_STATE, elementId, PersonVar.INFORMATION_ITEM.id, PersonVar.INFORMATION_ITEM.type, null);

		socket.sendExact(p);

		return socket.receiveResponse();
	}

	public TraCIResponse setTargetList(String elementId, ArrayList<String> data) throws IOException {
		TraCIPacket p = TraCISetCommand.build(TraCICmd.SET_PERSON_STATE, elementId, PersonVar.TARGET_LIST.id, PersonVar.TARGET_LIST.type, data);

		socket.sendExact(p);

		return socket.receiveResponse();
	}

	public TraCIResponse createNew(String data) throws IOException {
		TraCIPacket p = TraCISetCommand.build(TraCICmd.SET_PERSON_STATE, "-1", PersonVar.ADD.id, PersonVar.ADD.type, data);

		socket.sendExact(p);

		return socket.receiveResponse();
	}

}
