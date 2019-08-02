package model.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.enums.State;

@Getter @Setter @NoArgsConstructor
public class City {
	private String name;
	private State state;

}
