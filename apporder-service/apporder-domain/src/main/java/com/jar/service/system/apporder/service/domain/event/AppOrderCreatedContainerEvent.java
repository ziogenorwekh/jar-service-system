package com.jar.service.system.apporder.service.domain.event;

import com.jar.service.system.apporder.service.domain.entity.AppOrder;
import com.jar.service.system.common.domain.valueobject.MessageType;

import java.time.ZonedDateTime;

public class AppOrderCreatedContainerEvent extends AppOrderEvent<AppOrder> {

    public AppOrderCreatedContainerEvent(AppOrder domainType, ZonedDateTime publishedAt) {
        super(domainType, MessageType.CREATE, publishedAt);
    }
}
