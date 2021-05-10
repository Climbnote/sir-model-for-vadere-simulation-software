package org.vadere.state.attributes;

import org.vadere.state.attributes.Attributes;
import org.vadere.util.factory.attributes.AttributeBaseFactory;

import org.vadere.state.attributes.models.AttributesCGM;
import org.vadere.state.attributes.models.AttributesSIRG;
import org.vadere.state.attributes.models.AttributesPotentialRingExperiment;
import org.vadere.state.attributes.models.AttributesSTOM;
import org.vadere.state.attributes.models.AttributesPotentialOSM;
import org.vadere.state.attributes.models.AttributesFloorField;
import org.vadere.state.attributes.models.AttributesTimeCost;
import org.vadere.state.attributes.models.AttributesGFM;
import org.vadere.state.attributes.models.AttributesPotentialSFM;
import org.vadere.state.attributes.models.AttributesBMM;
import org.vadere.state.attributes.models.AttributesQueuingGame;
import org.vadere.state.attributes.models.AttributesPotentialGNM;
import org.vadere.state.attributes.models.AttributesPotentialCompactSoftshell;
import org.vadere.state.attributes.models.AttributesOSM;
import org.vadere.state.attributes.models.AttributesReynolds;
import org.vadere.state.attributes.models.AttributesGNM;
import org.vadere.state.attributes.models.AttributesODEIntegrator;
import org.vadere.state.attributes.models.AttributesSeating;
import org.vadere.state.attributes.models.AttributesSingleTargetStrategy;
import org.vadere.state.attributes.models.AttributesSFM;
import org.vadere.state.attributes.models.AttributesCA;
import org.vadere.state.attributes.models.AttributesOVM;
import org.vadere.state.attributes.models.AttributesPotentialParticles;
import org.vadere.state.attributes.models.AttributesPotentialCompact;
import org.vadere.state.attributes.models.AttributesBHM;
import org.vadere.state.attributes.models.AttributesParticles;



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
		addMember(AttributesSIRG.class, this::getAttributesSIRG);
		addMember(AttributesPotentialRingExperiment.class, this::getAttributesPotentialRingExperiment);
		addMember(AttributesSTOM.class, this::getAttributesSTOM);
		addMember(AttributesPotentialOSM.class, this::getAttributesPotentialOSM);
		addMember(AttributesFloorField.class, this::getAttributesFloorField);
		addMember(AttributesTimeCost.class, this::getAttributesTimeCost);
		addMember(AttributesGFM.class, this::getAttributesGFM);
		addMember(AttributesPotentialSFM.class, this::getAttributesPotentialSFM);
		addMember(AttributesBMM.class, this::getAttributesBMM);
		addMember(AttributesQueuingGame.class, this::getAttributesQueuingGame);
		addMember(AttributesPotentialGNM.class, this::getAttributesPotentialGNM);
		addMember(AttributesPotentialCompactSoftshell.class, this::getAttributesPotentialCompactSoftshell);
		addMember(AttributesOSM.class, this::getAttributesOSM);
		addMember(AttributesReynolds.class, this::getAttributesReynolds);
		addMember(AttributesGNM.class, this::getAttributesGNM);
		addMember(AttributesODEIntegrator.class, this::getAttributesODEIntegrator);
		addMember(AttributesSeating.class, this::getAttributesSeating);
		addMember(AttributesSingleTargetStrategy.class, this::getAttributesSingleTargetStrategy);
		addMember(AttributesSFM.class, this::getAttributesSFM);
		addMember(AttributesCA.class, this::getAttributesCA);
		addMember(AttributesOVM.class, this::getAttributesOVM);
		addMember(AttributesPotentialParticles.class, this::getAttributesPotentialParticles);
		addMember(AttributesPotentialCompact.class, this::getAttributesPotentialCompact);
		addMember(AttributesBHM.class, this::getAttributesBHM);
		addMember(AttributesParticles.class, this::getAttributesParticles);
	}


	// Getters
	public AttributesCGM getAttributesCGM(){
		return new AttributesCGM();
	}

	public AttributesSIRG getAttributesSIRG(){
		return new AttributesSIRG();
	}

	public AttributesPotentialRingExperiment getAttributesPotentialRingExperiment(){
		return new AttributesPotentialRingExperiment();
	}

	public AttributesSTOM getAttributesSTOM(){
		return new AttributesSTOM();
	}

	public AttributesPotentialOSM getAttributesPotentialOSM(){
		return new AttributesPotentialOSM();
	}

	public AttributesFloorField getAttributesFloorField(){
		return new AttributesFloorField();
	}

	public AttributesTimeCost getAttributesTimeCost(){
		return new AttributesTimeCost();
	}

	public AttributesGFM getAttributesGFM(){
		return new AttributesGFM();
	}

	public AttributesPotentialSFM getAttributesPotentialSFM(){
		return new AttributesPotentialSFM();
	}

	public AttributesBMM getAttributesBMM(){
		return new AttributesBMM();
	}

	public AttributesQueuingGame getAttributesQueuingGame(){
		return new AttributesQueuingGame();
	}

	public AttributesPotentialGNM getAttributesPotentialGNM(){
		return new AttributesPotentialGNM();
	}

	public AttributesPotentialCompactSoftshell getAttributesPotentialCompactSoftshell(){
		return new AttributesPotentialCompactSoftshell();
	}

	public AttributesOSM getAttributesOSM(){
		return new AttributesOSM();
	}

	public AttributesReynolds getAttributesReynolds(){
		return new AttributesReynolds();
	}

	public AttributesGNM getAttributesGNM(){
		return new AttributesGNM();
	}

	public AttributesODEIntegrator getAttributesODEIntegrator(){
		return new AttributesODEIntegrator();
	}

	public AttributesSeating getAttributesSeating(){
		return new AttributesSeating();
	}

	public AttributesSingleTargetStrategy getAttributesSingleTargetStrategy(){
		return new AttributesSingleTargetStrategy();
	}

	public AttributesSFM getAttributesSFM(){
		return new AttributesSFM();
	}

	public AttributesCA getAttributesCA(){
		return new AttributesCA();
	}

	public AttributesOVM getAttributesOVM(){
		return new AttributesOVM();
	}

	public AttributesPotentialParticles getAttributesPotentialParticles(){
		return new AttributesPotentialParticles();
	}

	public AttributesPotentialCompact getAttributesPotentialCompact(){
		return new AttributesPotentialCompact();
	}

	public AttributesBHM getAttributesBHM(){
		return new AttributesBHM();
	}

	public AttributesParticles getAttributesParticles(){
		return new AttributesParticles();
	}


}
