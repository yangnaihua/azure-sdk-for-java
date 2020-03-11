/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_11_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The source image from which the Image Version is going to be created.
 */
public class UserArtifactSource {
    /**
     * Required. The fileName of the artifact.
     */
    @JsonProperty(value = "fileName", required = true)
    private String fileName;

    /**
     * Required. The mediaLink of the artifact, must be a readable storage
     * blob.
     */
    @JsonProperty(value = "mediaLink", required = true)
    private String mediaLink;

    /**
     * Get required. The fileName of the artifact.
     *
     * @return the fileName value
     */
    public String fileName() {
        return this.fileName;
    }

    /**
     * Set required. The fileName of the artifact.
     *
     * @param fileName the fileName value to set
     * @return the UserArtifactSource object itself.
     */
    public UserArtifactSource withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * Get required. The mediaLink of the artifact, must be a readable storage blob.
     *
     * @return the mediaLink value
     */
    public String mediaLink() {
        return this.mediaLink;
    }

    /**
     * Set required. The mediaLink of the artifact, must be a readable storage blob.
     *
     * @param mediaLink the mediaLink value to set
     * @return the UserArtifactSource object itself.
     */
    public UserArtifactSource withMediaLink(String mediaLink) {
        this.mediaLink = mediaLink;
        return this;
    }

}
