package org.vadere.simulator.models;


import org.vadere.simulator.models.groups.sir.SIRGroupModel;

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

		//org.vadere.simulator.models.groups.sir
		subModelMap = new HashMap<>();
		subModelMap.put("org.vadere.simulator.models.groups.sir.SIRGroupModel", SIRGroupModel.class);
		models.put("org.vadere.simulator.models.groups.sir", subModelMap);
	}

}
