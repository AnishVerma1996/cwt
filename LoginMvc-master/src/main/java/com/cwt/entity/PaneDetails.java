package com.cwt.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="SCORECARD_DETAILS")
public class PaneDetails implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	private long id;
	@Column(name="SECTION_ID")
	private String section_ID;
	
	@Column(name="SECTION_NAME")
	private String section_name;
	@Column(name="REGION")
	private String region;
	@Column(name="ICON")
	private String icon;
	@Column(name="STACK")
	private String stack;
	@Column(name="SORT_ID")
	private Integer sort_id;
	
	@OneToMany(cascade=CascadeType.ALL)
	 @JoinColumn(name="SECTION_ID")
	 private Set<PaneSectionDetails> paneSectionDetails;
	
	@OneToMany(cascade=CascadeType.ALL)
	 @JoinColumn(name="MetrixDetails_Id")
	 private Set<MetrixDetails> metrixDetails;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSection_ID() {
		return section_ID;
	}

	public void setSection_ID(String section_ID) {
		this.section_ID = section_ID;
	}

	public String getSection_name() {
		return section_name;
	}

	public void setSection_name(String section_name) {
		this.section_name = section_name;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getStack() {
		return stack;
	}

	public void setStack(String stack) {
		this.stack = stack;
	}

	public Integer getSort_id() {
		return sort_id;
	}

	public void setSort_id(Integer sort_id) {
		this.sort_id = sort_id;
	}

	public Set<PaneSectionDetails> getPaneSectionDetails() {
		return paneSectionDetails;
	}

	public void setPaneSectionDetails(Set<PaneSectionDetails> paneSectionDetails) {
		this.paneSectionDetails = paneSectionDetails;
	}

	public Set<MetrixDetails> getMetrixDetails() {
		return metrixDetails;
	}

	public void setMetrixDetails(Set<MetrixDetails> metrixDetails) {
		this.metrixDetails = metrixDetails;
	}
	
	
	
}
