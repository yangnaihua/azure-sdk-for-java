/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_11_01.implementation;

import com.microsoft.azure.management.compute.v2019_11_01.AccessUri;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class AccessUriImpl extends WrapperImpl<AccessUriInner> implements AccessUri {
    private final ComputeManager manager;
    AccessUriImpl(AccessUriInner inner, ComputeManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ComputeManager manager() {
        return this.manager;
    }

    @Override
    public String accessSAS() {
        return this.inner().accessSAS();
    }

}
