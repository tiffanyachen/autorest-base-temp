/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.2.2.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package keyvault.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of the key backing a certificate.
 */
public class SecretProperties {
    /**
     * The media type (MIME type).
     */
    @JsonProperty(value = "contentType")
    private String contentType;

    /**
     * Get the contentType value.
     *
     * @return the contentType value
     */
    public String contentType() {
        return this.contentType;
    }

    /**
     * Set the contentType value.
     *
     * @param contentType the contentType value to set
     * @return the SecretProperties object itself.
     */
    public SecretProperties withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

}
