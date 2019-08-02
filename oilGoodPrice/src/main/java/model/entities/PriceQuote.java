package model.entities;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class PriceQuote {
	private Resale resale;
	private Product product;
	private Date date;
	private double purchasePrice;
	private double saleprice;
	private double value;
}
