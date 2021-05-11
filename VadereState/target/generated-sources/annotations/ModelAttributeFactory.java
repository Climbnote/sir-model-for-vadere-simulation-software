package org.vadere.state.attributes;

import org.vadere.state.attributes.Attributes;
import org.vadere.util.factory.attributes.AttributeBaseFactory;

import org.vadere.state.attributes.models.AttributesSIRG;



public class ModelAttributeFactory extends AttributeBaseFactory<Attributes> {


	private static ModelAttributeFactory instance;

	//good performance threadsafe Singletone. Sync block will only be used once
	public static ModelAttributeFactory instance(){
		if(instance ==  null){
			synchronized (ModelAttributeFactory.class){
				if(instance == null){
					instance = new ModelAttributeFactory();
				}
			}
		}
		return instance;
	}


	private ModelAttributeFactory(){

		addMember(AttributesSIRG.class, this::getAttributesSIRG);
	}


	// Getters
	public AttributesSIRG getAttributesSIRG(){
		return new AttributesSIRG();
	}


}
