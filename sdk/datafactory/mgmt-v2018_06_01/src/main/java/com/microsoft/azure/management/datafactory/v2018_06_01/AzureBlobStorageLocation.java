/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The location of azure blob dataset.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = AzureBlobStorageLocation.class)
@JsonTypeName("AzureBlobStorageLocation")
public class AzureBlobStorageLocation extends DatasetLocation {
    /**
     * Specify the container of azure blob. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "container")
    private Object container;

    /**
     * Get specify the container of azure blob. Type: string (or Expression with resultType string).
     *
     * @return the container value
     */
    public Object container() {
        return this.container;
    }

    /**
     * Set specify the container of azure blob. Type: string (or Expression with resultType string).
     *
     * @param container the container value to set
     * @return the AzureBlobStorageLocation object itself.
     */
    public AzureBlobStorageLocation withContainer(Object container) {
        this.container = container;
        return this;
    }

}
