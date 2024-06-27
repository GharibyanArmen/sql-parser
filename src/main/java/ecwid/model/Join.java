package ecwid.model;

import lombok.Data;

@Data
public class Join {
  private String joinType;
  private Source source;
  private String condition;
 
}
