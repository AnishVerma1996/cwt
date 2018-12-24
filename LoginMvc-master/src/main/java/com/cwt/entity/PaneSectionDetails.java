package com.cwt.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="SCORECARD_SECTION_DETAILS")
public class PaneSectionDetails implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6915310611567049408L;
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	private long id;
	@Column(name="SECTION_ID")
	private String section_ID;
	@Column(name="METRIC_ID")
	private long metric_id;
	@Column(name="VIEW_TYPE")
	private String view_type;
	@Column(name="STATUES")
	private  String statues;
	@Column(name="AXIS")
	private  Integer axis;
	@Column(name="COLOR_COODE")
	private String color_coode;
	@Column(name="SORT_ID")
	private Integer sort_id;
	@Column(name="SHOW_DETAILS")
	private String show_details;
	
	 @ManyToOne
	 private PaneDetails paneDetails;

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

	public long getMetric_id() {
		return metric_id;
	}

	public void setMetric_id(long metric_id) {
		this.metric_id = metric_id;
	}

	public String getView_type() {
		return view_type;
	}

	public void setView_type(String view_type) {
		this.view_type = view_type;
	}

	public String getStatues() {
		return statues;
	}

	public void setStatues(String statues) {
		this.statues = statues;
	}

	public Integer getAxis() {
		return axis;
	}

	public void setAxis(Integer axis) {
		this.axis = axis;
	}

	public String getColor_coode() {
		return color_coode;
	}

	public void setColor_coode(String color_coode) {
		this.color_coode = color_coode;
	}

	public Integer getSort_id() {
		return sort_id;
	}

	public void setSort_id(Integer sort_id) {
		this.sort_id = sort_id;
	}

	public String getShow_details() {
		return show_details;
	}

	public void setShow_details(String show_details) {
		this.show_details = show_details;
	}

	public PaneDetails getPaneDetails() {
		return paneDetails;
	}

	public void setPaneDetails(PaneDetails paneDetails) {
		this.paneDetails = paneDetails;
	}
	 
	 
}
