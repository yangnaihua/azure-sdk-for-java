/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_11_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters that define the create packet capture operation.
 */
public class PacketCaptureParameters {
    /**
     * The ID of the targeted resource, only VM is currently supported.
     */
    @JsonProperty(value = "target", required = true)
    private String target;

    /**
     * Number of bytes captured per packet, the remaining bytes are truncated.
     */
    @JsonProperty(value = "bytesToCapturePerPacket")
    private Integer bytesToCapturePerPacket;

    /**
     * Maximum size of the capture output.
     */
    @JsonProperty(value = "totalBytesPerSession")
    private Integer totalBytesPerSession;

    /**
     * Maximum duration of the capture session in seconds.
     */
    @JsonProperty(value = "timeLimitInSeconds")
    private Integer timeLimitInSeconds;

    /**
     * The storage location for a packet capture session.
     */
    @JsonProperty(value = "storageLocation", required = true)
    private PacketCaptureStorageLocation storageLocation;

    /**
     * A list of packet capture filters.
     */
    @JsonProperty(value = "filters")
    private List<PacketCaptureFilter> filters;

    /**
     * Get the ID of the targeted resource, only VM is currently supported.
     *
     * @return the target value
     */
    public String target() {
        return this.target;
    }

    /**
     * Set the ID of the targeted resource, only VM is currently supported.
     *
     * @param target the target value to set
     * @return the PacketCaptureParameters object itself.
     */
    public PacketCaptureParameters withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * Get number of bytes captured per packet, the remaining bytes are truncated.
     *
     * @return the bytesToCapturePerPacket value
     */
    public Integer bytesToCapturePerPacket() {
        return this.bytesToCapturePerPacket;
    }

    /**
     * Set number of bytes captured per packet, the remaining bytes are truncated.
     *
     * @param bytesToCapturePerPacket the bytesToCapturePerPacket value to set
     * @return the PacketCaptureParameters object itself.
     */
    public PacketCaptureParameters withBytesToCapturePerPacket(Integer bytesToCapturePerPacket) {
        this.bytesToCapturePerPacket = bytesToCapturePerPacket;
        return this;
    }

    /**
     * Get maximum size of the capture output.
     *
     * @return the totalBytesPerSession value
     */
    public Integer totalBytesPerSession() {
        return this.totalBytesPerSession;
    }

    /**
     * Set maximum size of the capture output.
     *
     * @param totalBytesPerSession the totalBytesPerSession value to set
     * @return the PacketCaptureParameters object itself.
     */
    public PacketCaptureParameters withTotalBytesPerSession(Integer totalBytesPerSession) {
        this.totalBytesPerSession = totalBytesPerSession;
        return this;
    }

    /**
     * Get maximum duration of the capture session in seconds.
     *
     * @return the timeLimitInSeconds value
     */
    public Integer timeLimitInSeconds() {
        return this.timeLimitInSeconds;
    }

    /**
     * Set maximum duration of the capture session in seconds.
     *
     * @param timeLimitInSeconds the timeLimitInSeconds value to set
     * @return the PacketCaptureParameters object itself.
     */
    public PacketCaptureParameters withTimeLimitInSeconds(Integer timeLimitInSeconds) {
        this.timeLimitInSeconds = timeLimitInSeconds;
        return this;
    }

    /**
     * Get the storage location for a packet capture session.
     *
     * @return the storageLocation value
     */
    public PacketCaptureStorageLocation storageLocation() {
        return this.storageLocation;
    }

    /**
     * Set the storage location for a packet capture session.
     *
     * @param storageLocation the storageLocation value to set
     * @return the PacketCaptureParameters object itself.
     */
    public PacketCaptureParameters withStorageLocation(PacketCaptureStorageLocation storageLocation) {
        this.storageLocation = storageLocation;
        return this;
    }

    /**
     * Get a list of packet capture filters.
     *
     * @return the filters value
     */
    public List<PacketCaptureFilter> filters() {
        return this.filters;
    }

    /**
     * Set a list of packet capture filters.
     *
     * @param filters the filters value to set
     * @return the PacketCaptureParameters object itself.
     */
    public PacketCaptureParameters withFilters(List<PacketCaptureFilter> filters) {
        this.filters = filters;
        return this;
    }

}
