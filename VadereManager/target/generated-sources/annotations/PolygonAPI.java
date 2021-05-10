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
import org.vadere.manager.traci.commandHandler.variables.PolygonVar;

public class PolygonAPI extends TraCIClientApi {
	public PolygonAPI(TraCISocket socket) {
		super(socket, "PolygonAPI");
	}

	public TraCIResponse getTopographyBounds() throws IOException {
		TraCIPacket p = TraCIGetCommand.build(TraCICmd.GET_POLYGON, PolygonVar.TOPOGRAPHY_BOUNDS.id, "-1");

		socket.sendExact(p);

		return socket.receiveResponse();
	}

	public TraCIResponse getIDList() throws IOException {
		TraCIPacket p = TraCIGetCommand.build(TraCICmd.GET_POLYGON, PolygonVar.ID_LIST.id, "-1");

		socket.sendExact(p);

		return socket.receiveResponse();
	}

	public TraCIResponse getIDCount() throws IOException {
		TraCIPacket p = TraCIGetCommand.build(TraCICmd.GET_POLYGON, PolygonVar.COUNT.id, "-1");

		socket.sendExact(p);

		return socket.receiveResponse();
	}

	public TraCIResponse getType(String elementID) throws IOException {
		TraCIPacket p = TraCIGetCommand.build(TraCICmd.GET_POLYGON, PolygonVar.TYPE.id, elementID);

		socket.sendExact(p);

		return socket.receiveResponse();
	}

	public TraCIResponse getShape(String elementID) throws IOException {
		TraCIPacket p = TraCIGetCommand.build(TraCICmd.GET_POLYGON, PolygonVar.SHAPE.id, elementID);

		socket.sendExact(p);

		return socket.receiveResponse();
	}

	public TraCIResponse getCentroid(String elementID) throws IOException {
		TraCIPacket p = TraCIGetCommand.build(TraCICmd.GET_POLYGON, PolygonVar.CENTROID.id, elementID);

		socket.sendExact(p);

		return socket.receiveResponse();
	}

	public TraCIResponse getDistance(String elementId, ArrayList<String> data) throws IOException {
		TraCIPacket p = TraCIGetCommand.build(TraCICmd.GET_POLYGON, elementId, PolygonVar.DISTANCE.id, PolygonVar.DISTANCE.type, data);

		socket.sendExact(p);

		return socket.receiveResponse();
	}

	public TraCIResponse getColor(String elementID) throws IOException {
		TraCIPacket p = TraCIGetCommand.build(TraCICmd.GET_POLYGON, PolygonVar.COLOR.id, elementID);

		socket.sendExact(p);

		return socket.receiveResponse();
	}

	public TraCIResponse getPosition2D(String elementID) throws IOException {
		TraCIPacket p = TraCIGetCommand.build(TraCICmd.GET_POLYGON, PolygonVar.POSITION.id, elementID);

		socket.sendExact(p);

		return socket.receiveResponse();
	}

	public TraCIResponse getImageFile(String elementID) throws IOException {
		TraCIPacket p = TraCIGetCommand.build(TraCICmd.GET_POLYGON, PolygonVar.IMAGEFILE.id, elementID);

		socket.sendExact(p);

		return socket.receiveResponse();
	}

	public TraCIResponse getImageWidth(String elementID) throws IOException {
		TraCIPacket p = TraCIGetCommand.build(TraCICmd.GET_POLYGON, PolygonVar.WIDTH.id, elementID);

		socket.sendExact(p);

		return socket.receiveResponse();
	}

	public TraCIResponse getImageHeight(String elementID) throws IOException {
		TraCIPacket p = TraCIGetCommand.build(TraCICmd.GET_POLYGON, PolygonVar.HEIGHT.id, elementID);

		socket.sendExact(p);

		return socket.receiveResponse();
	}

	public TraCIResponse getImageAngle(String elementID) throws IOException {
		TraCIPacket p = TraCIGetCommand.build(TraCICmd.GET_POLYGON, PolygonVar.ANGLE.id, elementID);

		socket.sendExact(p);

		return socket.receiveResponse();
	}

}
