/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.timeseriesinsights.v2017_11_15;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for AccessPolicyRole.
 */
public enum AccessPolicyRole {
    /** Enum value Reader. */
    READER("Reader"),

    /** Enum value Contributor. */
    CONTRIBUTOR("Contributor");

    /** The actual serialized value for a AccessPolicyRole instance. */
    private String value;

    AccessPolicyRole(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a AccessPolicyRole instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed AccessPolicyRole object, or null if unable to parse.
     */
    @JsonCreator
    public static AccessPolicyRole fromString(String value) {
        AccessPolicyRole[] items = AccessPolicyRole.values();
        for (AccessPolicyRole item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
