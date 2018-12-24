package com.app.model;

import java.io.Serializable;
import java.util.Set;

public class PaneForm  implements Serializable
{
	
	
	
	
	private static final long serialVersionUID = 3247092455513377244L;
	
	
	private String SectionName;
	private String Region;
	private  String Icone;
	private Set <MetricsName> metricsName;
	private String  ColorCoode;
	private Integer Axies;
	private String ViewType;
	public String getSectionName() {
		return SectionName;
	}
	public void setSectionName(String sectionName) {
		SectionName = sectionName;
	}
	public String getRegion() {
		return Region;
	}
	public void setRegion(String region) {
		Region = region;
	}
	public String getIcone() {
		return Icone;
	}
	public void setIcone(String icone) {
		Icone = icone;
	}
	public Set<MetricsName> getMetricsName() {
		return metricsName;
	}
	public void setMetricsName(Set<MetricsName> metricsName) {
		this.metricsName = metricsName;
	}
	public String getColorCoode() {
		return ColorCoode;
	}
	public void setColorCoode(String colorCoode) {
		ColorCoode = colorCoode;
	}
	public Integer getAxies() {
		return Axies;
	}
	public void setAxies(Integer axies) {
		Axies = axies;
	}
	public String getViewType() {
		return ViewType;
	}
	public void setViewType(String viewType) {
		ViewType = viewType;
	}
	
	
	
	
	

}
