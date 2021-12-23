package src;

public class Event {
	Event priorEvent;
	String output;
	char choice;
	Event nextEvent;
	public Event(Event priorEvent, String output, char choice, Event nextEvent) {
		this.priorEvent = priorEvent;
		this.output = output;
		this.choice = choice;
		this.nextEvent = nextEvent;
	}
}
