package ecwid.model;

import java.util.List;

import lombok.Data;


@Data
public class Query {
	private List<Column> columns;
	private List<Source> fromSources;  
	private List<Join> joins;
	private WhereClause whereClause;
	private List<String> groupByColumns;
	private List<String> havingClauses;
	private List<Sort> sortColumns;
	private Integer limit;
	private Integer offset;
	
	
	
}
