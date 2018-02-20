package de.cas.mse.exercise.csvdb.data;

public interface DbObject {
	// csv Separator Konstante geh�rt in die CsvDB Klasse
	final String CSV_SEPARATOR = ",";

	public String getGuid();
	
	public void setGuid(String guid);
	
	// csv spezifische Methode geh�rt zu CsvDB Klasse. Erstellen von DbObject 
	// geh�rt nicht zu Interface
	public DbObject convertFromCsv(String csvLine, String csvSeparator);
	// Kein Bezug auf csv bei Methoden- und Parameterbenamung
	public String toCsvLine(String csvSeparator);
}
