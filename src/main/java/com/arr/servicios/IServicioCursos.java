package com.arr.servicios;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface IServicioCursos {

	@WebMethod
	List<String> getCursos();
}
