package ecwid.model;

import lombok.Data;

@Data
public class Sort {
	public enum Ordering {
		ASC, DESC
	};

	private Ordering order = Ordering.ASC;
	private String column;
}
