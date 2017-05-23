package it.polito.tdp.bar;

public class Event implements Comparable<Event> {
	
	public enum EventType { ARRIVO_GRUPPO_CLIENTI  } ;
	
	private int time ; //minuti dalla mezzanotte
	private int numPersone ; //persone che vogliono sedersi al tavolo
	private int durata ; //minuti di permanenza al tavolo
	private float tolleranza ; //tolleranza ad essere soddisfatti stando al bancone
	private EventType type;
	

	public Event(int time, int numPersone, int durata, float tolleranza, EventType type) {
		super();
		this.time = time;
		this.numPersone = numPersone;
		this.durata = durata;
		this.tolleranza = tolleranza;
		this.type = type;
	}

	

	/**
	 * @return the time
	 */
	public int getTime() {
		return time;
	}



	/**
	 * @param time the time to set
	 */
	public void setTime(int time) {
		this.time = time;
	}



	/**
	 * @return the numPersone
	 */
	public int getNumPersone() {
		return numPersone;
	}



	/**
	 * @param numPersone the numPersone to set
	 */
	public void setNumPersone(int numPersone) {
		this.numPersone = numPersone;
	}



	/**
	 * @return the durata
	 */
	public int getDurata() {
		return durata;
	}



	/**
	 * @param durata the durata to set
	 */
	public void setDurata(int durata) {
		this.durata = durata;
	}



	/**
	 * @return the tolleranza
	 */
	public float getTolleranza() {
		return tolleranza;
	}



	/**
	 * @param tolleranza the tolleranza to set
	 */
	public void setTolleranza(float tolleranza) {
		this.tolleranza = tolleranza;
	}



	/**
	 * @return the type
	 */
	public EventType getType() {
		return type;
	}



	/**
	 * @param type the type to set
	 */
	public void setType(EventType type) {
		this.type = type;
	}



	@Override
	public int compareTo(Event other) {
		return this.time - other.time ;
	}

}
