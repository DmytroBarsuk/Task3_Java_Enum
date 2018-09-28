import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;


@Getter
@Setter
@ToString
public class Ticket {
    String category;
    String id;
    Integer place;
    String title;
    Date date;
}
