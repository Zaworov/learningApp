package pl.zaworov.learningApp.application;

import java.util.ArrayList;
import java.util.List;

import pl.zaworov.learningApp.domain.River;
import org.springframework.stereotype.Repository;

@Repository
public class RiverDAO {

	List<River> rivers = new ArrayList<River>();
	
	public void addRiver(River river) {
		rivers.add(river);
	}
	
	public List<River> getListOfRivers() {
		return rivers;
	}
	
}

