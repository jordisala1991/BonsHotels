package domini;


import java.util.HashSet;

public interface CtrlPoblacio {
	
	public abstract HashSet<Poblacio> tots();
	
	public abstract Poblacio get(String nomPoblacio);
	
}
