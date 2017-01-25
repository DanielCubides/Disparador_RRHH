package util;

import java.util.*;

import co.com.unionsoluciones.servicios.dto.EmpleadoDTO;

public class QueueManager {
	
	
	
	public List<EmpleadoDTO> noDuplicates(List<EmpleadoDTO> list){
		List<EmpleadoDTO> listNoDup = new ArrayList();
		
		for(EmpleadoDTO item:list){
			if(!listNoDup.contains(item))
				listNoDup.add(item);	
		}
		
		return listNoDup;
	}

	public QueueManager() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
