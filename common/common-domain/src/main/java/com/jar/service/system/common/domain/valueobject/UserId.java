package com.jar.service.system.common.domain.valueobject;

import java.util.UUID;

public class UserId extends BaseId<UUID> {

    public UserId(UUID userId) {
        super(userId);
    }
}
