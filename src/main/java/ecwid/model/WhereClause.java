package ecwid.model;

import lombok.Data;

@Data
public class WhereClause {
	public enum Operator {
		IN, EXISTS
	};
	
	private Operator operator;
	private String column;
	
	private String condition;
	private Query subquery;
	
}
