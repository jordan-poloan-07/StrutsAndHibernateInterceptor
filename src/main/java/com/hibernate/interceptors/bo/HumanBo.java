package com.hibernate.interceptors.bo;

import com.hibernate.interceptors.dao.HumanDao;
import com.hibernate.interceptors.entities.Human;

public class HumanBo {

	private HumanDao hd = new HumanDao();
	
	public boolean add(Human human){
		return hd.addHuman(human);
	}
}
