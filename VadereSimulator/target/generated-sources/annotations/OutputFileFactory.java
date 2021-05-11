package org.vadere.simulator.projects.dataprocessing.outputfile;

import org.vadere.simulator.projects.dataprocessing.outputfile.OutputFile;
import org.vadere.simulator.projects.dataprocessing.datakey.DataKey;
import org.vadere.util.factory.outputfiles.OutputFileBaseFactory;

import org.vadere.simulator.projects.dataprocessing.outputfile.GroupPairOutputFile;
import org.vadere.simulator.projects.dataprocessing.outputfile.TimestepKeyIdOutputFile;
import org.vadere.simulator.projects.dataprocessing.outputfile.TimestepOutputFile;
import org.vadere.simulator.projects.dataprocessing.outputfile.BonnMotionTrajectoryFile;
import org.vadere.simulator.projects.dataprocessing.outputfile.NoDataKeyOutputFile;
import org.vadere.simulator.projects.dataprocessing.outputfile.TimeGridOutputFile;
import org.vadere.simulator.projects.dataprocessing.outputfile.TimestepPedestrianIdOverlapOutputFile;
import org.vadere.simulator.projects.dataprocessing.outputfile.TimestepPositionOutputFile;
import org.vadere.simulator.projects.dataprocessing.outputfile.TimestepPedestriansNearbyIdOutputFile;
import org.vadere.simulator.projects.dataprocessing.outputfile.PedestrianIdOutputFile;
import org.vadere.simulator.projects.dataprocessing.outputfile.TimestepPedestrianIdOutputFile;
import org.vadere.simulator.projects.dataprocessing.outputfile.EventtimePedestrianIdOutputFile;
import org.vadere.simulator.projects.dataprocessing.outputfile.IdOutputFile;
import org.vadere.simulator.projects.dataprocessing.outputfile.TimestepRowOutputFile;

import org.vadere.simulator.projects.dataprocessing.datakey.DataKey;
import org.vadere.simulator.projects.dataprocessing.datakey.OutputFileMap;
import org.vadere.simulator.projects.dataprocessing.store.OutputFileStore;
import java.util.Arrays;
import java.util.HashMap;


public class OutputFileFactory extends OutputFileBaseFactory<OutputFile<? extends DataKey<?>>> {


	private static OutputFileFactory instance;

	//good performance threadsafe Singletone. Sync block will only be used once
	public static OutputFileFactory instance(){
		if(instance ==  null){
			synchronized (OutputFileFactory.class){
				if(instance == null){
					instance = new OutputFileFactory();
				}
			}
		}
		return instance;
	}


	private OutputFileFactory(){

		addMember(GroupPairOutputFile.class, this::getGroupPairOutputFile, "GroupPairOutputFile", "", "TimestepGroupPairKey");
		addMember(TimestepKeyIdOutputFile.class, this::getTimestepKeyIdOutputFile, "TimestepKeyIdOutputFile", "", "TimestepFaceIdKey");
		addMember(TimestepOutputFile.class, this::getTimestepOutputFile, "TimestepOutputFile", "", "TimestepKey");
		addMember(BonnMotionTrajectoryFile.class, this::getBonnMotionTrajectoryFile, "BonnMotionTrajectoryFile", "", "BonnMotionKey");
		addMember(NoDataKeyOutputFile.class, this::getNoDataKeyOutputFile, "NoDataKeyOutputFile", "", "NoDataKey");
		addMember(TimeGridOutputFile.class, this::getTimeGridOutputFile, "TimeGridOutputFile", "", "TimeGridKey");
		addMember(TimestepPedestrianIdOverlapOutputFile.class, this::getTimestepPedestrianIdOverlapOutputFile, "TimestepPedestrianIdOverlapOutputFile", "", "TimestepPedestrianIdOverlapKey");
		addMember(TimestepPositionOutputFile.class, this::getTimestepPositionOutputFile, "TimestepPositionOutputFile", "", "TimestepPositionKey");
		addMember(TimestepPedestriansNearbyIdOutputFile.class, this::getTimestepPedestriansNearbyIdOutputFile, "TimestepPedestriansNearbyIdOutputFile", "", "TimestepPedestriansNearbyIdKey");
		addMember(PedestrianIdOutputFile.class, this::getPedestrianIdOutputFile, "PedestrianIdOutputFile", "", "PedestrianIdKey");
		addMember(TimestepPedestrianIdOutputFile.class, this::getTimestepPedestrianIdOutputFile, "TimestepPedestrianIdOutputFile", "", "TimestepPedestrianIdKey");
		addMember(EventtimePedestrianIdOutputFile.class, this::getEventtimePedestrianIdOutputFile, "EventtimePedestrianIdOutputFile", "", "EventtimePedestrianIdKey");
		addMember(IdOutputFile.class, this::getIdOutputFile, "IdOutputFile", "", "IdDataKey");
		addMember(TimestepRowOutputFile.class, this::getTimestepRowOutputFile, "TimestepRowOutputFile", "", "TimestepRowKey");
	}


	// Getters
	public GroupPairOutputFile getGroupPairOutputFile(){
		return new GroupPairOutputFile();
	}

	public TimestepKeyIdOutputFile getTimestepKeyIdOutputFile(){
		return new TimestepKeyIdOutputFile();
	}

	public TimestepOutputFile getTimestepOutputFile(){
		return new TimestepOutputFile();
	}

	public BonnMotionTrajectoryFile getBonnMotionTrajectoryFile(){
		return new BonnMotionTrajectoryFile();
	}

	public NoDataKeyOutputFile getNoDataKeyOutputFile(){
		return new NoDataKeyOutputFile();
	}

	public TimeGridOutputFile getTimeGridOutputFile(){
		return new TimeGridOutputFile();
	}

	public TimestepPedestrianIdOverlapOutputFile getTimestepPedestrianIdOverlapOutputFile(){
		return new TimestepPedestrianIdOverlapOutputFile();
	}

	public TimestepPositionOutputFile getTimestepPositionOutputFile(){
		return new TimestepPositionOutputFile();
	}

	public TimestepPedestriansNearbyIdOutputFile getTimestepPedestriansNearbyIdOutputFile(){
		return new TimestepPedestriansNearbyIdOutputFile();
	}

	public PedestrianIdOutputFile getPedestrianIdOutputFile(){
		return new PedestrianIdOutputFile();
	}

	public TimestepPedestrianIdOutputFile getTimestepPedestrianIdOutputFile(){
		return new TimestepPedestrianIdOutputFile();
	}

	public EventtimePedestrianIdOutputFile getEventtimePedestrianIdOutputFile(){
		return new EventtimePedestrianIdOutputFile();
	}

	public IdOutputFile getIdOutputFile(){
		return new IdOutputFile();
	}

	public TimestepRowOutputFile getTimestepRowOutputFile(){
		return new TimestepRowOutputFile();
	}

	public OutputFile<?> createOutputfile(OutputFileStore fileStore) throws ClassNotFoundException {
		OutputFile<?> file = getInstanceOf(fileStore.getType());
		file.setRelativeFileName(fileStore.getFilename());
		file.setProcessorIds(fileStore.getProcessors());
		file.setSeparator(fileStore.getSeparator());
		return file;
	}

	public OutputFile<?> createDefaultOutputfile() throws ClassNotFoundException {
		OutputFileStore fileStore = new OutputFileStore();
		OutputFile<?> file = getInstanceOf(fileStore.getType());
		file.setSeparator(fileStore.getSeparator());
		return file;
	}

	public OutputFile<?> createOutputfile(String type) throws ClassNotFoundException {
		OutputFileStore fileStore = new OutputFileStore();
		fileStore.setType(type);
		OutputFile<?> file = getInstanceOf(fileStore.getType());
		file.setSeparator(fileStore.getSeparator());
		return file;
	}

	public OutputFile<?> createOutputfile(Class type) throws ClassNotFoundException {
		return createOutputfile(type.getCanonicalName());
	}

	public OutputFile<?> createOutputfile(Class type, Integer... processorsIds) throws ClassNotFoundException {
		OutputFile<?> file = createOutputfile(type.getCanonicalName());
		file.setProcessorIds(Arrays.asList(processorsIds));
		return file;
	}

	public OutputFile<?> createDefaultOutputfileByDataKey(Class<? extends DataKey<?>> keyType, Integer... processorsIds) throws ClassNotFoundException {
		OutputFile<?> file = createDefaultOutputfileByDataKey(keyType);
		file.setProcessorIds(Arrays.asList(processorsIds));
		return file;
	}

	public OutputFile<?> createDefaultOutputfileByDataKey(Class<? extends DataKey<?>> keyType) throws ClassNotFoundException {

		OutputFileMap outputFileMap = keyType.getAnnotation(OutputFileMap.class);
		return createOutputfile(outputFileMap.outputFileClass());
	}

}
