package com.Bakery.Backend.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;
@Component
@Entity
public class Authorization implements Serializable {
	
				@Id
				@GeneratedValue(strategy=GenerationType.SEQUENCE)
				private int roleId;
				private String roleName="ROLE_USER";
				private String userName;
				
				
				
				
				
				public int getRoleId() {
					return roleId;
				}
				public void setRoleId(int roleId) {
					this.roleId = roleId;
				}
				public String getRoleName() {
					return roleName;
				}
				public void setRoleName(String roleName) {
					this.roleName = roleName;
				}
				public String getUserName() {
					return userName;
				}
				public void setUserName(String userName) {
					this.userName = userName;
				}
				
}
