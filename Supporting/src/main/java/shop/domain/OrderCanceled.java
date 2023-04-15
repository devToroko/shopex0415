package shop.domain;

import java.util.*;
import lombok.*;
import shop.domain.*;
import shop.infra.AbstractEvent;

@Data
@ToString
public class OrderCanceled extends AbstractEvent {

    private Long id;

    public OrderCanceled(Inventory aggregate) {
        super(aggregate);
    }

    public OrderCanceled() {
        super();
    }
}
