package com.arr.servicios;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

@WebService
public class ServicioCursos implements IServicioCursos {

	@Override
	public List<String> getCursos() {
		List<String> cursos = new ArrayList<String>();
		cursos.add("Java");
		cursos.add("Web");
		cursos.add("Frameworks");
		cursos.add("Web Services");
		cursos.add("Android");
		
		return cursos;
	}

}
