package domini;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

public class ControladorBuscarHabitacio {
	
	public ControladorBuscarHabitacio() {
		
	}
	
	public HashSet<String> obtePoblacions() throws Exception {
		ICtrlPoblacio cp = CtrlDataFactory.getInstance().getCtrlPoblacior();
		HashSet<Poblacio> poblacions = cp.tots();
		HashSet<String> nomPoblacions = new HashSet<String>();
		if (poblacions.size() == 0) throw new Exception("noHiHaPoblacions");
		Iterator<Poblacio> it = poblacions.iterator();
		while (it.hasNext()) nomPoblacions.add(it.next().getNom());
		return nomPoblacions;
	}
	
	public HashSet<HotelInformation> buscarHabitacio(String pob, Date dIni, Date dFi, Integer numOcup) throws Exception {
		ICtrlPoblacio cp = CtrlDataFactory.getInstance().getCtrlPoblacio();
		Poblacio p = cp.getPoblacio(pob);
		return p.buscarHotelsDisponibles(dIni, dFi, numOcup);
	}

}
