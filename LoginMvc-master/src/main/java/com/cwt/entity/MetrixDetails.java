package com.cwt.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="metrix_details")
public class MetrixDetails  implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long Id;
	
	private String metricsName;
	private String colorCode;
	private String axis;
	private String  viewType;
	@ManyToOne
	private PaneDetails paneDetails;
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getMetricsName() {
		return metricsName;
	}
	public void setMetricsName(String metricsName) {
		this.metricsName = metricsName;
	}
	public String getColorCode() {
		return colorCode;
	}
	public void setColorCode(String colorCode) {
		this.colorCode = colorCode;
	}
	public String getAxis() {
		return axis;
	}
	public void setAxis(String axis) {
		this.axis = axis;
	}
	public String getViewType() {
		return viewType;
	}
	public void setViewType(String viewType) {
		this.viewType = viewType;
	}
	public PaneDetails getPaneDetails() {
		return paneDetails;
	}
	public void setPaneDetails(PaneDetails paneDetails) {
		this.paneDetails = paneDetails;
	}
	
}
