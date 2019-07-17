package com.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.connection.DatabaseConnectin;

public class BuildingMaterialDAO {

	public boolean save(BuildingMaterial material) {
		boolean isAdded = false;
		try {
			Connection con = null;
			PreparedStatement statement = null;
			con = DatabaseConnectin.getDbConnectin();
			String query = "insert into buildingmaterial(item,quantity,unit)" + " values(?,?,?)";

			statement = con.prepareStatement(query);
			statement.setString(1, material.getItem());
			statement.setInt(2, material.getQuantity());
			statement.setString(3, material.getUnit());

			int rowsUpdated = statement.executeUpdate();
			if (rowsUpdated > 0) {
				System.out.println("Record added to table");
				isAdded = true;
			} else {
				System.out.println("record not added");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return isAdded;
	}
	
	public boolean Update(BuildingMaterial material) {
		
		boolean isUpdated = false;
		try {
			Connection con = null;
			Statement statement = null;
			con = DatabaseConnectin.getDbConnectin();
			statement = con.createStatement();
			String upadteQuery = "Update buildingmaterial SET item='" + material.getItem() + "',quantity="
					+ material.getQuantity() + ",unit='" + material.getUnit() + "' where id=" + material.getId();
			int rowsUpdated = statement.executeUpdate(upadteQuery);
			System.out.println(upadteQuery);
			if (rowsUpdated > 0) {
				isUpdated= true;
			} else {
				isUpdated = false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return isUpdated;

	}

	public List Get() {
		BuildingMaterial material = new BuildingMaterial();
		List materialList = new ArrayList<>();
		try {
			Connection con = null;
			Statement statement = null;
			con = DatabaseConnectin.getDbConnectin();
			statement = con.createStatement();
			String selectList = "select * from buildingmaterial";
			ResultSet rs = statement.executeQuery(selectList);
			while (rs.next()) {

				material.setId(rs.getInt(1));
				material.setItem(rs.getString(2));
				material.setQuantity(rs.getInt(3));
				material.setUnit(rs.getString(4));
				materialList.add(material);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return materialList;
	}

	public BuildingMaterial Get(int id) {
		BuildingMaterial material = new BuildingMaterial();
		material = null;
		try {
			Connection con = null;
			Statement statement = null;
			con = DatabaseConnectin.getDbConnectin();

			statement = con.createStatement();
			String selectQuery = "select * from buildingmaterial where id=" + id;
			ResultSet rs = statement.executeQuery(selectQuery);
			if (rs.next()) {

				material.setId(rs.getInt(1));
				material.setItem(rs.getString(2));
				material.setQuantity(rs.getInt(3));
				material.setUnit(rs.getString(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return material;
	}
}

