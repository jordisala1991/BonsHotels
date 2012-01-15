package domini;

import java.util.HashSet;

public interface ICtrlPoblacio {
	
	public abstract HashSet<Poblacio> tots();
	
	public abstract Poblacio getPoblacio(String nomPoblacio) throws Exception;
	
}
