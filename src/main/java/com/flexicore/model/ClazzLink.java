/*******************************************************************************
 *  Copyright (C) FlexiCore, Inc - All Rights Reserved
 *  Unauthorized copying of this file, via any medium is strictly prohibited
 *  Proprietary and confidential
 *  Written by Avishay Ben Natan And Asaf Ben Natan, October 2015
 ******************************************************************************/
package com.flexicore.model;

import com.flexicore.annotations.AnnotatedClazz;
import com.flexicore.security.SecurityContextBase;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@AnnotatedClazz(Category="core",  Name="ClazzLink",Description="Describes all other Link classes in the system")
@Entity
public class ClazzLink extends Clazz {



	public ClazzLink() {
	}

	public ClazzLink(String name, SecurityContextBase securityContext) {
		super(name, securityContext);
	}

	@ManyToOne(targetEntity = Clazz.class,cascade = CascadeType.MERGE)
	private Clazz left;
	@ManyToOne(targetEntity = Clazz.class,cascade = CascadeType.MERGE)

	private Clazz right;
	@ManyToOne(targetEntity = Clazz.class,cascade = CascadeType.MERGE)

	private Clazz value;
	
	@ManyToOne(targetEntity=Clazz.class,cascade = CascadeType.MERGE)

	public Clazz getLeft() {
		return left;
	}
	public void setLeft(Clazz left) {
		this.left = left;
	}
	@ManyToOne(targetEntity=Clazz.class,cascade = CascadeType.MERGE)

	public Clazz getRight() {
		return right;
	}
	public void setRight(Clazz right) {
		this.right = right;
	}
	
	@ManyToOne(targetEntity=Clazz.class,cascade = CascadeType.MERGE)

	public Clazz getValue() {
		return value;
	}
	public void setValue(Clazz value) {
		this.value = value;
	}
	
	
	
	

	
	
	
}