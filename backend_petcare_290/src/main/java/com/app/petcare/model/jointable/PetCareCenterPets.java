package com.app.petcare.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.app.petcare.model.Manager;
import com.app.petcare.model.Pet;
import com.app.petcare.model.PetCareCenter;
import com.app.petcare.model.PetOwner;
import com.app.petcare.model.Document;
import com.app.petcare.model.PetService;
import com.app.petcare.enums.PetServiceType;
import com.app.petcare.converter.PetServiceTypeConverter;

@Entity(name = "PetCareCenterPets")
@Table(schema = "\"petcare_089\"", name = "\"PetCareCenterPets\"")
@Data
public class PetCareCenterPets{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"PcId\"")
	private Integer pcId;

    
    @Column(name = "\"PetId\"")
    private Integer petId;
 
}