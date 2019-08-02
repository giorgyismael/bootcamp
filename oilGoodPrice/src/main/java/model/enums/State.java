package model.enums;

import java.util.Arrays;

public enum State {
	RO(11,"Rond�nia", Region.NORTE),
	AC(12,"Acre", Region.NORTE),
	AM(13,"Amazonas", Region.NORTE),
	RR(14,"Roraima", Region.NORTE ),
	PA(15,"Par�", Region.NORTE),
	AP(16,"Amap�", Region.NORTE),
	TO(17,"Tocantins", Region.NORTE),
	MA(21,"Maranh�o", Region.NORDESTE),
	PI(22,"Piau�",Region.NORDESTE),
	CE(23,"Cear�", Region.NORDESTE),
	RN(24,"Rio Grande do Norte", Region.NORDESTE),
	PB(25,"Para�ba", Region.NORDESTE),
	PE(26,"Pernambuco", Region.NORDESTE),
	AL(27,"Alagoas", Region.NORDESTE),
	SE(28,"Sergipe", Region.NORDESTE),
	BA(29,"Bahia", Region.NORDESTE),
	MG(31,"Minas Gerais", Region.SUDESTE),
	ES(32,"Esp�rito Santo", Region.SUDESTE),
	RJ(33,"Rio de Janeiro", Region.SUDESTE),
	SP(35,"S�o Paulo", Region.SUDESTE),
	PR(41,"Paran�", Region.SUL),
	SC(42,"Santa Catarina",Region.SUL),
	RS(43,"Rio Grande do Sul", Region.SUL),
	MS(50,"Mato Grosso do Sul", Region.CENTROOESTE),
	MT(51,"Mato Grosso", Region.CENTROOESTE),
	GO(52,"Goi�s", Region.CENTROOESTE),
	DF(53,"Distrito Federal", Region.CENTROOESTE);

	private final int codeIbge;
	private final String name;
	private final Region region;

	private State(int codeIbge,String name, Region region) {
		this.codeIbge = codeIbge;
		this.name = name;
		this.region = region;
	}
	
	public String getCode() {
		return Integer.toString(codeIbge);
	}
	
	public String getName(){
		return name;
	}
	
	public int getCodeIbge(){
		return codeIbge;
	}
	public Region getRegion(){
		return region;
	}
//	public State find(String state) {
//		return Arrays.stream(State.values())
//				.filter(e -> e.equals(state))
//				.findFirst()
//				.orElseThrow(() -> new IllegalStateException(String.format("Unsupported type %s.", state)));
//	}
}
