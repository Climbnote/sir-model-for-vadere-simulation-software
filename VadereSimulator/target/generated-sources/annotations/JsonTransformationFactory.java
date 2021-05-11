package org.vadere.simulator.projects.migration.jsontranformation;

import org.vadere.simulator.projects.migration.jsontranformation.JsonTransformationBaseFactory;

import org.vadere.simulator.projects.migration.jsontranformation.jolt.JoltTransformV3toV4;
import org.vadere.simulator.projects.migration.jsontranformation.jolt.JoltTransformV4toV5;
import org.vadere.simulator.projects.migration.jsontranformation.json.TargetVersionV1_13;
import org.vadere.simulator.projects.migration.jsontranformation.json.TargetVersionV0_10;
import org.vadere.simulator.projects.migration.jsontranformation.jolt.JoltTransformV5toV6;
import org.vadere.simulator.projects.migration.jsontranformation.json.TargetVersionV1_4;
import org.vadere.simulator.projects.migration.jsontranformation.json.TargetVersionV1_1;
import org.vadere.simulator.projects.migration.jsontranformation.json.TargetVersionV1_10;
import org.vadere.simulator.projects.migration.jsontranformation.json.TargetVersionV1_14;
import org.vadere.simulator.projects.migration.jsontranformation.json.TargetVersionV1_15;
import org.vadere.simulator.projects.migration.jsontranformation.jolt.JoltTransformV2toV3;
import org.vadere.simulator.projects.migration.jsontranformation.json.TargetVersionV1_8;
import org.vadere.simulator.projects.migration.jsontranformation.json.TargetVersionV1_2;
import org.vadere.simulator.projects.migration.jsontranformation.json.TargetVersionV1_7;
import org.vadere.simulator.projects.migration.jsontranformation.jolt.JoltTransformV0toV1;
import org.vadere.simulator.projects.migration.jsontranformation.json.TargetVersionV0_8;
import org.vadere.simulator.projects.migration.jsontranformation.json.TargetVersionV1_11;
import org.vadere.simulator.projects.migration.jsontranformation.json.TargetVersionV1_5;
import org.vadere.simulator.projects.migration.jsontranformation.json.TargetVersionV1_6;
import org.vadere.simulator.projects.migration.jsontranformation.jolt.JoltTransformV6toV7;
import org.vadere.simulator.projects.migration.jsontranformation.json.TargetVersionV1_12;
import org.vadere.simulator.projects.migration.jsontranformation.jolt.JoltTransformV1toV2;
import org.vadere.simulator.projects.migration.jsontranformation.json.TargetVersionV1_9;



public class JsonTransformationFactory extends JsonTransformationBaseFactory{


	private static JsonTransformationFactory instance;

	//good performance threadsafe Singletone. Sync block will only be used once
	public static JsonTransformationFactory instance(){
		if(instance ==  null){
			synchronized (JsonTransformationFactory.class){
				if(instance == null){
					instance = new JsonTransformationFactory();
				}
			}
		}
		return instance;
	}


	private JsonTransformationFactory(){

		addMember("0.4", JoltTransformV3toV4.class, this::getJoltTransformV3toV4);
		addMember("0.5", JoltTransformV4toV5.class, this::getJoltTransformV4toV5);
		addMember("1.13", TargetVersionV1_13.class, this::getTargetVersionV1_13);
		addMember("0.10", TargetVersionV0_10.class, this::getTargetVersionV0_10);
		addMember("0.6", JoltTransformV5toV6.class, this::getJoltTransformV5toV6);
		addMember("1.4", TargetVersionV1_4.class, this::getTargetVersionV1_4);
		addMember("1.1", TargetVersionV1_1.class, this::getTargetVersionV1_1);
		addMember("1.10", TargetVersionV1_10.class, this::getTargetVersionV1_10);
		addMember("1.14", TargetVersionV1_14.class, this::getTargetVersionV1_14);
		addMember("1.15", TargetVersionV1_15.class, this::getTargetVersionV1_15);
		addMember("0.3", JoltTransformV2toV3.class, this::getJoltTransformV2toV3);
		addMember("1.8", TargetVersionV1_8.class, this::getTargetVersionV1_8);
		addMember("1.2", TargetVersionV1_2.class, this::getTargetVersionV1_2);
		addMember("1.7", TargetVersionV1_7.class, this::getTargetVersionV1_7);
		addMember("0.1", JoltTransformV0toV1.class, this::getJoltTransformV0toV1);
		addMember("0.8", TargetVersionV0_8.class, this::getTargetVersionV0_8);
		addMember("1.11", TargetVersionV1_11.class, this::getTargetVersionV1_11);
		addMember("1.5", TargetVersionV1_5.class, this::getTargetVersionV1_5);
		addMember("1.6", TargetVersionV1_6.class, this::getTargetVersionV1_6);
		addMember("0.7", JoltTransformV6toV7.class, this::getJoltTransformV6toV7);
		addMember("1.12", TargetVersionV1_12.class, this::getTargetVersionV1_12);
		addMember("0.2", JoltTransformV1toV2.class, this::getJoltTransformV1toV2);
		addMember("1.9", TargetVersionV1_9.class, this::getTargetVersionV1_9);
	}


	// Getters
	public JoltTransformV3toV4 getJoltTransformV3toV4(){
		return new JoltTransformV3toV4();
	}

	public JoltTransformV4toV5 getJoltTransformV4toV5(){
		return new JoltTransformV4toV5();
	}

	public TargetVersionV1_13 getTargetVersionV1_13(){
		return new TargetVersionV1_13();
	}

	public TargetVersionV0_10 getTargetVersionV0_10(){
		return new TargetVersionV0_10();
	}

	public JoltTransformV5toV6 getJoltTransformV5toV6(){
		return new JoltTransformV5toV6();
	}

	public TargetVersionV1_4 getTargetVersionV1_4(){
		return new TargetVersionV1_4();
	}

	public TargetVersionV1_1 getTargetVersionV1_1(){
		return new TargetVersionV1_1();
	}

	public TargetVersionV1_10 getTargetVersionV1_10(){
		return new TargetVersionV1_10();
	}

	public TargetVersionV1_14 getTargetVersionV1_14(){
		return new TargetVersionV1_14();
	}

	public TargetVersionV1_15 getTargetVersionV1_15(){
		return new TargetVersionV1_15();
	}

	public JoltTransformV2toV3 getJoltTransformV2toV3(){
		return new JoltTransformV2toV3();
	}

	public TargetVersionV1_8 getTargetVersionV1_8(){
		return new TargetVersionV1_8();
	}

	public TargetVersionV1_2 getTargetVersionV1_2(){
		return new TargetVersionV1_2();
	}

	public TargetVersionV1_7 getTargetVersionV1_7(){
		return new TargetVersionV1_7();
	}

	public JoltTransformV0toV1 getJoltTransformV0toV1(){
		return new JoltTransformV0toV1();
	}

	public TargetVersionV0_8 getTargetVersionV0_8(){
		return new TargetVersionV0_8();
	}

	public TargetVersionV1_11 getTargetVersionV1_11(){
		return new TargetVersionV1_11();
	}

	public TargetVersionV1_5 getTargetVersionV1_5(){
		return new TargetVersionV1_5();
	}

	public TargetVersionV1_6 getTargetVersionV1_6(){
		return new TargetVersionV1_6();
	}

	public JoltTransformV6toV7 getJoltTransformV6toV7(){
		return new JoltTransformV6toV7();
	}

	public TargetVersionV1_12 getTargetVersionV1_12(){
		return new TargetVersionV1_12();
	}

	public JoltTransformV1toV2 getJoltTransformV1toV2(){
		return new JoltTransformV1toV2();
	}

	public TargetVersionV1_9 getTargetVersionV1_9(){
		return new TargetVersionV1_9();
	}


}
