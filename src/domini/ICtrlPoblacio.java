package domini;

import java.util.Set;

public interface ICtrlPoblacio {
	
	public abstract Set<Poblacio> tots();
	
	public abstract Poblacio getPoblacio(String nomPoblacio) throws Exception;
	
}
