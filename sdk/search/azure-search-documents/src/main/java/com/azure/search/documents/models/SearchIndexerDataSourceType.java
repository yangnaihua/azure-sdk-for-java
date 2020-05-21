// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for SearchIndexerDataSourceType.
 */
public final class SearchIndexerDataSourceType extends ExpandableStringEnum<SearchIndexerDataSourceType> {
    /**
     * Static value azuresql for SearchIndexerDataSourceType.
     */
    public static final SearchIndexerDataSourceType AZURE_SQL = fromString("azuresql");

    /**
     * Static value cosmosdb for SearchIndexerDataSourceType.
     */
    public static final SearchIndexerDataSourceType COSMOS_DB = fromString("cosmosdb");

    /**
     * Static value azureblob for SearchIndexerDataSourceType.
     */
    public static final SearchIndexerDataSourceType AZURE_BLOB = fromString("azureblob");

    /**
     * Static value azuretable for SearchIndexerDataSourceType.
     */
    public static final SearchIndexerDataSourceType AZURE_TABLE = fromString("azuretable");

    /**
     * Static value mysql for SearchIndexerDataSourceType.
     */
    public static final SearchIndexerDataSourceType MY_SQL = fromString("mysql");

    /**
     * Creates or finds a SearchIndexerDataSourceType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SearchIndexerDataSourceType.
     */
    @JsonCreator
    public static SearchIndexerDataSourceType fromString(String name) {
        return fromString(name, SearchIndexerDataSourceType.class);
    }

    /**
     * @return known SearchIndexerDataSourceType values.
     */
    public static Collection<SearchIndexerDataSourceType> values() {
        return values(SearchIndexerDataSourceType.class);
    }
}