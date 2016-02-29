/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.validation.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The product documentation.
 */
public class ChildProduct {
    /**
     * Constant string.
     */
    @JsonProperty(required = true)
    private String constProperty;

    /**
     * Count.
     */
    private Integer count;

    /**
     * Creates an instance of ChildProduct class.
     */
    public ChildProduct() {
        constProperty = "constant";
    }

    /**
     * Get the constProperty value.
     *
     * @return the constProperty value
     */
    public String getConstProperty() {
        return this.constProperty;
    }

    /**
     * Set the constProperty value.
     *
     * @param constProperty the constProperty value to set
     */
    public void setConstProperty(String constProperty) {
        this.constProperty = constProperty;
    }

    /**
     * Get the count value.
     *
     * @return the count value
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * Set the count value.
     *
     * @param count the count value to set
     */
    public void setCount(Integer count) {
        this.count = count;
    }

}
