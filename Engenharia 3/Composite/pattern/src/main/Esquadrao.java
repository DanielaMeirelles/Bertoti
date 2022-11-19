package main;

import java.util.ArrayList;
import java.util.List;

public class Esquadrao implements Militar {
	public List<Militar> esquadrao = new ArrayList<Militar>();
	
	public void add(Militar militar) {
		esquadrao.add(militar);
	}
	
	public void remove(Militar militar) {
		esquadrao.remove(militar);
	}
	
	public void executarOrdem(String ordem) {
		for(Militar membro : esquadrao) {
			membro.executarOrdem(ordem);
		}
	}

}
