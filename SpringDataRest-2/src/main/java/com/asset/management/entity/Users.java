package com.asset.management.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table(name="users")
	public class Users {
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name="userid")
		private Long uid;
		@Column(name="username")
		private String name;
		public Users(Long uid, String name) {
			super();
			this.uid = uid;
			this.name = name;
		}
		public Users() {
			super();
		}
		public Long getUid() {
			return uid;
		}
		public void setUid(Long id) {
			this.uid = uid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		@Override
		public String toString() {
			return "Users [uid=" + uid + ", name=" + name + "]";
		}
		

}
