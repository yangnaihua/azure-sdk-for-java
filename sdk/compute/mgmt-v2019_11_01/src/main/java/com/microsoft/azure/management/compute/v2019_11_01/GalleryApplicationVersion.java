/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_11_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.compute.v2019_11_01.implementation.GalleryApplicationVersionInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.compute.v2019_11_01.implementation.ComputeManager;
import java.util.Map;

/**
 * Type representing GalleryApplicationVersion.
 */
public interface GalleryApplicationVersion extends HasInner<GalleryApplicationVersionInner>, Indexable, Refreshable<GalleryApplicationVersion>, Updatable<GalleryApplicationVersion.Update>, HasManager<ComputeManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the publishingProfile value.
     */
    GalleryApplicationVersionPublishingProfile publishingProfile();

    /**
     * @return the replicationStatus value.
     */
    ReplicationStatus replicationStatus();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the GalleryApplicationVersion definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithApplication, DefinitionStages.WithLocation, DefinitionStages.WithPublishingProfile, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of GalleryApplicationVersion definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a GalleryApplicationVersion definition.
         */
        interface Blank extends WithApplication {
        }

        /**
         * The stage of the galleryapplicationversion definition allowing to specify Application.
         */
        interface WithApplication {
           /**
            * Specifies resourceGroupName, galleryName, galleryApplicationName.
            * @param resourceGroupName The name of the resource group
            * @param galleryName The name of the Shared Application Gallery in which the Application Definition resides
            * @param galleryApplicationName The name of the gallery Application Definition in which the Application Version is to be created
            * @return the next definition stage
            */
            WithLocation withExistingApplication(String resourceGroupName, String galleryName, String galleryApplicationName);
        }

        /**
         * The stage of the galleryapplicationversion definition allowing to specify Location.
         */
        interface WithLocation {
           /**
            * Specifies location.
            * @param location Resource location
            * @return the next definition stage
            */
            WithPublishingProfile withLocation(String location);
        }

        /**
         * The stage of the galleryapplicationversion definition allowing to specify PublishingProfile.
         */
        interface WithPublishingProfile {
           /**
            * Specifies publishingProfile.
            * @param publishingProfile the publishingProfile parameter value
            * @return the next definition stage
            */
            WithCreate withPublishingProfile(GalleryApplicationVersionPublishingProfile publishingProfile);
        }

        /**
         * The stage of the galleryapplicationversion definition allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags Resource tags
             * @return the next definition stage
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<GalleryApplicationVersion>, DefinitionStages.WithTags {
        }
    }
    /**
     * The template for a GalleryApplicationVersion update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<GalleryApplicationVersion>, UpdateStages.WithTags {
    }

    /**
     * Grouping of GalleryApplicationVersion update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the galleryapplicationversion update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags Resource tags
             * @return the next update stage
             */
            Update withTags(Map<String, String> tags);
        }

    }
}
