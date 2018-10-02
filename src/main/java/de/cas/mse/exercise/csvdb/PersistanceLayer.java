package de.cas.mse.exercise.csvdb;

import java.util.List;

// insert / read Funktion f�r Zeilen w�ren ausreichend gewesen f�r dieses Interface
// PersistenceLayer ist nicht gl�cklich, da nicht aussagekr�ftig genug. Es soll ja nur
// gespeichert und geladen werden. Storage w�re eine nette Alternative.
public interface PersistanceLayer {
		
	public void persist(String data);
	
	public List<String> loadCsVDB();

}
