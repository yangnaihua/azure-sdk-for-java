// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for OSDiskType. */
public final class OSDiskType extends ExpandableStringEnum<OSDiskType> {
    /** Static value Managed for OSDiskType. */
    public static final OSDiskType MANAGED = fromString("Managed");

    /** Static value Ephemeral for OSDiskType. */
    public static final OSDiskType EPHEMERAL = fromString("Ephemeral");

    /**
     * Creates or finds a OSDiskType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OSDiskType.
     */
    @JsonCreator
    public static OSDiskType fromString(String name) {
        return fromString(name, OSDiskType.class);
    }

    /** @return known OSDiskType values. */
    public static Collection<OSDiskType> values() {
        return values(OSDiskType.class);
    }
}
