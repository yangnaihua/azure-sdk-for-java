/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2020_04_01_preview.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Shared access keys of the partner namespace.
 */
public class PartnerNamespaceSharedAccessKeysInner {
    /**
     * Shared access key1 for the partner namespace.
     */
    @JsonProperty(value = "key1")
    private String key1;

    /**
     * Shared access key2 for the partner namespace.
     */
    @JsonProperty(value = "key2")
    private String key2;

    /**
     * Get shared access key1 for the partner namespace.
     *
     * @return the key1 value
     */
    public String key1() {
        return this.key1;
    }

    /**
     * Set shared access key1 for the partner namespace.
     *
     * @param key1 the key1 value to set
     * @return the PartnerNamespaceSharedAccessKeysInner object itself.
     */
    public PartnerNamespaceSharedAccessKeysInner withKey1(String key1) {
        this.key1 = key1;
        return this;
    }

    /**
     * Get shared access key2 for the partner namespace.
     *
     * @return the key2 value
     */
    public String key2() {
        return this.key2;
    }

    /**
     * Set shared access key2 for the partner namespace.
     *
     * @param key2 the key2 value to set
     * @return the PartnerNamespaceSharedAccessKeysInner object itself.
     */
    public PartnerNamespaceSharedAccessKeysInner withKey2(String key2) {
        this.key2 = key2;
        return this;
    }

}
