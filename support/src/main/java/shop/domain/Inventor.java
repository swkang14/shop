package shop.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import shop.domain.*;
import shop.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class Inventor extends AbstractEvent {

    private Long id;

    public Inventor() {
        super();
    }
}
//>>> DDD / Domain Event
