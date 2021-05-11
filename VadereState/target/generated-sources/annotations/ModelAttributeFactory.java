package org.vadere.state.attributes;

import org.vadere.state.attributes.Attributes;
import org.vadere.util.factory.attributes.AttributeBaseFactory;

import org.vadere.state.attributes.models.AttributesCGM;
import org.vadere.state.attributes.models.AttributesSFM;
import org.vadere.state.attributes.models.AttributesOSM;
import org.vadere.state.attributes.models.AttributesReynolds;
import org.vadere.state.attributes.models.AttributesSIRG;
import org.vadere.state.attributes.models.AttributesPotentialCompact;
import org.vadere.state.attributes.models.AttributesQueuingGame;
import org.vadere.state.attributes.models.AttributesPotentialCompactSoftshell;
import org.vadere.state.attributes.models.AttributesPotentialParticles;
import org.vadere.state.attributes.models.AttributesOVM;
import org.vadere.state.attributes.models.AttributesGFM;
import org.vadere.state.attributes.models.AttributesPotentialOSM;
import org.vadere.state.attributes.models.AttributesGNM;
import org.vadere.state.attributes.models.AttributesSeating;
import org.vadere.state.attributes.models.AttributesParticles;
import org.vadere.state.attributes.models.AttributesTimeCost;
import org.vadere.state.attributes.models.AttributesFloorField;
import org.vadere.state.attributes.models.AttributesBMM;
import org.vadere.state.attributes.models.AttributesSTOM;
import org.vadere.state.attributes.models.AttributesBHM;
import org.vadere.state.attributes.models.AttributesPotentialGNM;
import org.vadere.state.attributes.models.AttributesPotentialRingExperiment;
import org.vadere.state.attributes.models.AttributesSingleTargetStrategy;
import org.vadere.state.attributes.models.AttributesPotentialSFM;
import org.vadere.state.attributes.models.AttributesODEIntegrator;
import org.vadere.state.attributes.models.AttributesCA;



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

		addMember(AttributesCGM.class, this::getAttributesCGM);
		addMember(AttributesSFM.class, this::getAttributesSFM);
		addMember(AttributesOSM.class, this::getAttributesOSM);
		addMember(AttributesReynolds.class, this::getAttributesReynolds);
		addMember(AttributesSIRG.class, this::getAttributesSIRG);
		addMember(AttributesPotentialCompact.class, this::getAttributesPotentialCompact);
		addMember(AttributesQueuingGame.class, this::getAttributesQueuingGame);
		addMember(AttributesPotentialCompactSoftshell.class, this::getAttributesPotentialCompactSoftshell);
		addMember(AttributesPotentialParticles.class, this::getAttributesPotentialParticles);
		addMember(AttributesOVM.class, this::getAttributesOVM);
		addMember(AttributesGFM.class, this::getAttributesGFM);
		addMember(AttributesPotentialOSM.class, this::getAttributesPotentialOSM);
		addMember(AttributesGNM.class, this::getAttributesGNM);
		addMember(AttributesSeating.class, this::getAttributesSeating);
		addMember(AttributesParticles.class, this::getAttributesParticles);
		addMember(AttributesTimeCost.class, this::getAttributesTimeCost);
		addMember(AttributesFloorField.class, this::getAttributesFloorField);
		addMember(AttributesBMM.class, this::getAttributesBMM);
		addMember(AttributesSTOM.class, this::getAttributesSTOM);
		addMember(AttributesBHM.class, this::getAttributesBHM);
		addMember(AttributesPotentialGNM.class, this::getAttributesPotentialGNM);
		addMember(AttributesPotentialRingExperiment.class, this::getAttributesPotentialRingExperiment);
		addMember(AttributesSingleTargetStrategy.class, this::getAttributesSingleTargetStrategy);
		addMember(AttributesPotentialSFM.class, this::getAttributesPotentialSFM);
		addMember(AttributesODEIntegrator.class, this::getAttributesODEIntegrator);
		addMember(AttributesCA.class, this::getAttributesCA);
	}


	// Getters
	public AttributesCGM getAttributesCGM(){
		return new AttributesCGM();
	}

	public AttributesSFM getAttributesSFM(){
		return new AttributesSFM();
	}

	public AttributesOSM getAttributesOSM(){
		return new AttributesOSM();
	}

	public AttributesReynolds getAttributesReynolds(){
		return new AttributesReynolds();
	}

	public AttributesSIRG getAttributesSIRG(){
		return new AttributesSIRG();
	}

	public AttributesPotentialCompact getAttributesPotentialCompact(){
		return new AttributesPotentialCompact();
	}

	public AttributesQueuingGame getAttributesQueuingGame(){
		return new AttributesQueuingGame();
	}

	public AttributesPotentialCompactSoftshell getAttributesPotentialCompactSoftshell(){
		return new AttributesPotentialCompactSoftshell();
	}

	public AttributesPotentialParticles getAttributesPotentialParticles(){
		return new AttributesPotentialParticles();
	}

	public AttributesOVM getAttributesOVM(){
		return new AttributesOVM();
	}

	public AttributesGFM getAttributesGFM(){
		return new AttributesGFM();
	}

	public AttributesPotentialOSM getAttributesPotentialOSM(){
		return new AttributesPotentialOSM();
	}

	public AttributesGNM getAttributesGNM(){
		return new AttributesGNM();
	}

	public AttributesSeating getAttributesSeating(){
		return new AttributesSeating();
	}

	public AttributesParticles getAttributesParticles(){
		return new AttributesParticles();
	}

	public AttributesTimeCost getAttributesTimeCost(){
		return new AttributesTimeCost();
	}

	public AttributesFloorField getAttributesFloorField(){
		return new AttributesFloorField();
	}

	public AttributesBMM getAttributesBMM(){
		return new AttributesBMM();
	}

	public AttributesSTOM getAttributesSTOM(){
		return new AttributesSTOM();
	}

	public AttributesBHM getAttributesBHM(){
		return new AttributesBHM();
	}

	public AttributesPotentialGNM getAttributesPotentialGNM(){
		return new AttributesPotentialGNM();
	}

	public AttributesPotentialRingExperiment getAttributesPotentialRingExperiment(){
		return new AttributesPotentialRingExperiment();
	}

	public AttributesSingleTargetStrategy getAttributesSingleTargetStrategy(){
		return new AttributesSingleTargetStrategy();
	}

	public AttributesPotentialSFM getAttributesPotentialSFM(){
		return new AttributesPotentialSFM();
	}

	public AttributesODEIntegrator getAttributesODEIntegrator(){
		return new AttributesODEIntegrator();
	}

	public AttributesCA getAttributesCA(){
		return new AttributesCA();
	}


}
