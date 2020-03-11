/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_11_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2019_11_01.implementation.NetworkManager;
import java.util.List;
import com.microsoft.azure.management.network.v2019_11_01.implementation.VpnServerConfigurationInner;

/**
 * Type representing VpnServerConfiguration.
 */
public interface VpnServerConfiguration extends HasInner<VpnServerConfigurationInner>, Resource, GroupableResourceCore<NetworkManager, VpnServerConfigurationInner>, HasResourceGroup, Refreshable<VpnServerConfiguration>, Updatable<VpnServerConfiguration.Update>, HasManager<NetworkManager> {
    /**
     * @return the aadAuthenticationParameters value.
     */
    AadAuthenticationParameters aadAuthenticationParameters();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the p2SVpnGateways value.
     */
    List<P2SVpnGateway> p2SVpnGateways();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the radiusClientRootCertificates value.
     */
    List<VpnServerConfigRadiusClientRootCertificate> radiusClientRootCertificates();

    /**
     * @return the radiusServerAddress value.
     */
    String radiusServerAddress();

    /**
     * @return the radiusServerRootCertificates value.
     */
    List<VpnServerConfigRadiusServerRootCertificate> radiusServerRootCertificates();

    /**
     * @return the radiusServerSecret value.
     */
    String radiusServerSecret();

    /**
     * @return the vpnAuthenticationTypes value.
     */
    List<VpnAuthenticationType> vpnAuthenticationTypes();

    /**
     * @return the vpnClientIpsecPolicies value.
     */
    List<IpsecPolicy> vpnClientIpsecPolicies();

    /**
     * @return the vpnClientRevokedCertificates value.
     */
    List<VpnServerConfigVpnClientRevokedCertificate> vpnClientRevokedCertificates();

    /**
     * @return the vpnClientRootCertificates value.
     */
    List<VpnServerConfigVpnClientRootCertificate> vpnClientRootCertificates();

    /**
     * @return the vpnProtocols value.
     */
    List<VpnGatewayTunnelingProtocol> vpnProtocols();

    /**
     * @return the vpnServerConfigurationName value.
     */
    String vpnServerConfigurationName();

    /**
     * @return the vpnServerConfigurationPropertiesEtag value.
     */
    String vpnServerConfigurationPropertiesEtag();

    /**
     * The entirety of the VpnServerConfiguration definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of VpnServerConfiguration definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a VpnServerConfiguration definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the VpnServerConfiguration definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the vpnserverconfiguration definition allowing to specify AadAuthenticationParameters.
         */
        interface WithAadAuthenticationParameters {
            /**
             * Specifies aadAuthenticationParameters.
             * @param aadAuthenticationParameters The set of aad vpn authentication parameters
             * @return the next definition stage
             */
            WithCreate withAadAuthenticationParameters(AadAuthenticationParameters aadAuthenticationParameters);
        }

        /**
         * The stage of the vpnserverconfiguration definition allowing to specify RadiusClientRootCertificates.
         */
        interface WithRadiusClientRootCertificates {
            /**
             * Specifies radiusClientRootCertificates.
             * @param radiusClientRootCertificates Radius client root certificate of VpnServerConfiguration
             * @return the next definition stage
             */
            WithCreate withRadiusClientRootCertificates(List<VpnServerConfigRadiusClientRootCertificate> radiusClientRootCertificates);
        }

        /**
         * The stage of the vpnserverconfiguration definition allowing to specify RadiusServerAddress.
         */
        interface WithRadiusServerAddress {
            /**
             * Specifies radiusServerAddress.
             * @param radiusServerAddress The radius server address property of the VpnServerConfiguration resource for point to site client connection
             * @return the next definition stage
             */
            WithCreate withRadiusServerAddress(String radiusServerAddress);
        }

        /**
         * The stage of the vpnserverconfiguration definition allowing to specify RadiusServerRootCertificates.
         */
        interface WithRadiusServerRootCertificates {
            /**
             * Specifies radiusServerRootCertificates.
             * @param radiusServerRootCertificates Radius Server root certificate of VpnServerConfiguration
             * @return the next definition stage
             */
            WithCreate withRadiusServerRootCertificates(List<VpnServerConfigRadiusServerRootCertificate> radiusServerRootCertificates);
        }

        /**
         * The stage of the vpnserverconfiguration definition allowing to specify RadiusServerSecret.
         */
        interface WithRadiusServerSecret {
            /**
             * Specifies radiusServerSecret.
             * @param radiusServerSecret The radius secret property of the VpnServerConfiguration resource for point to site client connection
             * @return the next definition stage
             */
            WithCreate withRadiusServerSecret(String radiusServerSecret);
        }

        /**
         * The stage of the vpnserverconfiguration definition allowing to specify VpnAuthenticationTypes.
         */
        interface WithVpnAuthenticationTypes {
            /**
             * Specifies vpnAuthenticationTypes.
             * @param vpnAuthenticationTypes VPN authentication types for the VpnServerConfiguration
             * @return the next definition stage
             */
            WithCreate withVpnAuthenticationTypes(List<VpnAuthenticationType> vpnAuthenticationTypes);
        }

        /**
         * The stage of the vpnserverconfiguration definition allowing to specify VpnClientIpsecPolicies.
         */
        interface WithVpnClientIpsecPolicies {
            /**
             * Specifies vpnClientIpsecPolicies.
             * @param vpnClientIpsecPolicies VpnClientIpsecPolicies for VpnServerConfiguration
             * @return the next definition stage
             */
            WithCreate withVpnClientIpsecPolicies(List<IpsecPolicy> vpnClientIpsecPolicies);
        }

        /**
         * The stage of the vpnserverconfiguration definition allowing to specify VpnClientRevokedCertificates.
         */
        interface WithVpnClientRevokedCertificates {
            /**
             * Specifies vpnClientRevokedCertificates.
             * @param vpnClientRevokedCertificates VPN client revoked certificate of VpnServerConfiguration
             * @return the next definition stage
             */
            WithCreate withVpnClientRevokedCertificates(List<VpnServerConfigVpnClientRevokedCertificate> vpnClientRevokedCertificates);
        }

        /**
         * The stage of the vpnserverconfiguration definition allowing to specify VpnClientRootCertificates.
         */
        interface WithVpnClientRootCertificates {
            /**
             * Specifies vpnClientRootCertificates.
             * @param vpnClientRootCertificates VPN client root certificate of VpnServerConfiguration
             * @return the next definition stage
             */
            WithCreate withVpnClientRootCertificates(List<VpnServerConfigVpnClientRootCertificate> vpnClientRootCertificates);
        }

        /**
         * The stage of the vpnserverconfiguration definition allowing to specify VpnProtocols.
         */
        interface WithVpnProtocols {
            /**
             * Specifies vpnProtocols.
             * @param vpnProtocols VPN protocols for the VpnServerConfiguration
             * @return the next definition stage
             */
            WithCreate withVpnProtocols(List<VpnGatewayTunnelingProtocol> vpnProtocols);
        }

        /**
         * The stage of the vpnserverconfiguration definition allowing to specify VpnServerConfigurationName.
         */
        interface WithVpnServerConfigurationName {
            /**
             * Specifies vpnServerConfigurationName.
             * @param vpnServerConfigurationName The name of the VpnServerConfiguration that is unique within a resource group
             * @return the next definition stage
             */
            WithCreate withVpnServerConfigurationName(String vpnServerConfigurationName);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<VpnServerConfiguration>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithAadAuthenticationParameters, DefinitionStages.WithRadiusClientRootCertificates, DefinitionStages.WithRadiusServerAddress, DefinitionStages.WithRadiusServerRootCertificates, DefinitionStages.WithRadiusServerSecret, DefinitionStages.WithVpnAuthenticationTypes, DefinitionStages.WithVpnClientIpsecPolicies, DefinitionStages.WithVpnClientRevokedCertificates, DefinitionStages.WithVpnClientRootCertificates, DefinitionStages.WithVpnProtocols, DefinitionStages.WithVpnServerConfigurationName {
        }
    }
    /**
     * The template for a VpnServerConfiguration update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<VpnServerConfiguration>, Resource.UpdateWithTags<Update>, UpdateStages.WithAadAuthenticationParameters, UpdateStages.WithRadiusClientRootCertificates, UpdateStages.WithRadiusServerAddress, UpdateStages.WithRadiusServerRootCertificates, UpdateStages.WithRadiusServerSecret, UpdateStages.WithVpnAuthenticationTypes, UpdateStages.WithVpnClientIpsecPolicies, UpdateStages.WithVpnClientRevokedCertificates, UpdateStages.WithVpnClientRootCertificates, UpdateStages.WithVpnProtocols, UpdateStages.WithVpnServerConfigurationName {
    }

    /**
     * Grouping of VpnServerConfiguration update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the vpnserverconfiguration update allowing to specify AadAuthenticationParameters.
         */
        interface WithAadAuthenticationParameters {
            /**
             * Specifies aadAuthenticationParameters.
             * @param aadAuthenticationParameters The set of aad vpn authentication parameters
             * @return the next update stage
             */
            Update withAadAuthenticationParameters(AadAuthenticationParameters aadAuthenticationParameters);
        }

        /**
         * The stage of the vpnserverconfiguration update allowing to specify RadiusClientRootCertificates.
         */
        interface WithRadiusClientRootCertificates {
            /**
             * Specifies radiusClientRootCertificates.
             * @param radiusClientRootCertificates Radius client root certificate of VpnServerConfiguration
             * @return the next update stage
             */
            Update withRadiusClientRootCertificates(List<VpnServerConfigRadiusClientRootCertificate> radiusClientRootCertificates);
        }

        /**
         * The stage of the vpnserverconfiguration update allowing to specify RadiusServerAddress.
         */
        interface WithRadiusServerAddress {
            /**
             * Specifies radiusServerAddress.
             * @param radiusServerAddress The radius server address property of the VpnServerConfiguration resource for point to site client connection
             * @return the next update stage
             */
            Update withRadiusServerAddress(String radiusServerAddress);
        }

        /**
         * The stage of the vpnserverconfiguration update allowing to specify RadiusServerRootCertificates.
         */
        interface WithRadiusServerRootCertificates {
            /**
             * Specifies radiusServerRootCertificates.
             * @param radiusServerRootCertificates Radius Server root certificate of VpnServerConfiguration
             * @return the next update stage
             */
            Update withRadiusServerRootCertificates(List<VpnServerConfigRadiusServerRootCertificate> radiusServerRootCertificates);
        }

        /**
         * The stage of the vpnserverconfiguration update allowing to specify RadiusServerSecret.
         */
        interface WithRadiusServerSecret {
            /**
             * Specifies radiusServerSecret.
             * @param radiusServerSecret The radius secret property of the VpnServerConfiguration resource for point to site client connection
             * @return the next update stage
             */
            Update withRadiusServerSecret(String radiusServerSecret);
        }

        /**
         * The stage of the vpnserverconfiguration update allowing to specify VpnAuthenticationTypes.
         */
        interface WithVpnAuthenticationTypes {
            /**
             * Specifies vpnAuthenticationTypes.
             * @param vpnAuthenticationTypes VPN authentication types for the VpnServerConfiguration
             * @return the next update stage
             */
            Update withVpnAuthenticationTypes(List<VpnAuthenticationType> vpnAuthenticationTypes);
        }

        /**
         * The stage of the vpnserverconfiguration update allowing to specify VpnClientIpsecPolicies.
         */
        interface WithVpnClientIpsecPolicies {
            /**
             * Specifies vpnClientIpsecPolicies.
             * @param vpnClientIpsecPolicies VpnClientIpsecPolicies for VpnServerConfiguration
             * @return the next update stage
             */
            Update withVpnClientIpsecPolicies(List<IpsecPolicy> vpnClientIpsecPolicies);
        }

        /**
         * The stage of the vpnserverconfiguration update allowing to specify VpnClientRevokedCertificates.
         */
        interface WithVpnClientRevokedCertificates {
            /**
             * Specifies vpnClientRevokedCertificates.
             * @param vpnClientRevokedCertificates VPN client revoked certificate of VpnServerConfiguration
             * @return the next update stage
             */
            Update withVpnClientRevokedCertificates(List<VpnServerConfigVpnClientRevokedCertificate> vpnClientRevokedCertificates);
        }

        /**
         * The stage of the vpnserverconfiguration update allowing to specify VpnClientRootCertificates.
         */
        interface WithVpnClientRootCertificates {
            /**
             * Specifies vpnClientRootCertificates.
             * @param vpnClientRootCertificates VPN client root certificate of VpnServerConfiguration
             * @return the next update stage
             */
            Update withVpnClientRootCertificates(List<VpnServerConfigVpnClientRootCertificate> vpnClientRootCertificates);
        }

        /**
         * The stage of the vpnserverconfiguration update allowing to specify VpnProtocols.
         */
        interface WithVpnProtocols {
            /**
             * Specifies vpnProtocols.
             * @param vpnProtocols VPN protocols for the VpnServerConfiguration
             * @return the next update stage
             */
            Update withVpnProtocols(List<VpnGatewayTunnelingProtocol> vpnProtocols);
        }

        /**
         * The stage of the vpnserverconfiguration update allowing to specify VpnServerConfigurationName.
         */
        interface WithVpnServerConfigurationName {
            /**
             * Specifies vpnServerConfigurationName.
             * @param vpnServerConfigurationName The name of the VpnServerConfiguration that is unique within a resource group
             * @return the next update stage
             */
            Update withVpnServerConfigurationName(String vpnServerConfigurationName);
        }

    }
}
