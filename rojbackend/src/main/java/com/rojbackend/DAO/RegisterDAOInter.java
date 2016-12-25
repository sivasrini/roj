package com.rojbackend.DAO;

import com.rojbackend.model.Register;

public interface RegisterDAOInter {

	
public void adduser(Register r);
public void updateuser(Register r);
public Register selectuser(Register r);

}
