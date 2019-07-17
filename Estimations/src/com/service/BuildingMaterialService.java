package com.service;

import com.data.BuildingMaterial;
import com.data.BuildingMaterialDAO;

public class BuildingMaterialService {
	BuildingMaterialDAO daoOb=new BuildingMaterialDAO();
	
	public boolean save(BuildingMaterial material){
		boolean result=daoOb.save(material);
		return result;
	}
    public boolean update(BuildingMaterial material){
    	boolean result=daoOb.Update(material);
    	return result;
    }
}
