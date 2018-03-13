/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.keyvault.models;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The deleted certificate item containing metadata about the deleted
 * certificate.
 */
public class DeletedCertificateItem extends CertificateItem {
    /**
     * The url of the recovery object, used to identify and recover the deleted
     * certificate.
     */
    @JsonProperty(value = "recoveryId")
    private String recoveryId;

    /**
     * The time when the certificate is scheduled to be purged, in UTC.
     */
    @JsonProperty(value = "scheduledPurgeDate", access = JsonProperty.Access.WRITE_ONLY)
    private Long scheduledPurgeDate;

    /**
     * The time when the certificate was deleted, in UTC.
     */
    @JsonProperty(value = "deletedDate", access = JsonProperty.Access.WRITE_ONLY)
    private Long deletedDate;

    /**
     * Get the recoveryId value.
     *
     * @return the recoveryId value
     */
    public String recoveryId() {
        return this.recoveryId;
    }

    /**
     * Set the recoveryId value.
     *
     * @param recoveryId the recoveryId value to set
     * @return the DeletedCertificateItem object itself.
     */
    public DeletedCertificateItem withRecoveryId(String recoveryId) {
        this.recoveryId = recoveryId;
        return this;
    }

    /**
     * Get the scheduledPurgeDate value.
     *
     * @return the scheduledPurgeDate value
     */
    public DateTime scheduledPurgeDate() {
        if (this.scheduledPurgeDate == null) {
            return null;
        }
        return new DateTime(this.scheduledPurgeDate * 1000L, DateTimeZone.UTC);
    }

    /**
     * Get the deletedDate value.
     *
     * @return the deletedDate value
     */
    public DateTime deletedDate() {
        if (this.deletedDate == null) {
            return null;
        }
        return new DateTime(this.deletedDate * 1000L, DateTimeZone.UTC);
    }

}
