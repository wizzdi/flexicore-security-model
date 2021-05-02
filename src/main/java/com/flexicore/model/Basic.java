package com.flexicore.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.databind.annotation.JsonTypeResolver;
import com.flexicore.data.jsoncontainers.FCTypeResolver;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.time.OffsetDateTime;

@MappedSuperclass
public abstract class Basic {

	@Id
	protected String id;
	protected String name;
	protected String description;
	private boolean softDelete;
	@Column(columnDefinition = "timestamp with time zone")
	private OffsetDateTime creationDate;
	@Column(columnDefinition = "timestamp with time zone")
	private OffsetDateTime updateDate;


	@Id
	public String getId() {
		return id;
	}

	public <T extends Basic> T setId(String id) {
		this.id = id;
		return (T) this;
	}

	public String getName() {
		return name;
	}

	public <T extends Basic> T setName(String name) {
		this.name = name;
		return (T) this;
	}

	public String getDescription() {
		return description;
	}

	public <T extends Basic> T setDescription(String description) {
		this.description = description;
		return (T) this;
	}

	public boolean isSoftDelete() {
		return softDelete;
	}

	public <T extends Basic> T setSoftDelete(boolean softDelete) {
		this.softDelete = softDelete;
		return (T) this;
	}

	public OffsetDateTime getCreationDate() {
		return creationDate;
	}

	public <T extends Basic> T setCreationDate(OffsetDateTime creationDate) {
		this.creationDate = creationDate;
		return (T) this;
	}

	public OffsetDateTime getUpdateDate() {
		return updateDate;
	}

	public <T extends Basic> T setUpdateDate(OffsetDateTime updateDate) {
		this.updateDate = updateDate;
		return (T) this;
	}

	@JsonProperty("json-type")
	public String getJsonType(){
		return getClass().getCanonicalName();
	}
}
