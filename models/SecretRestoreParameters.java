/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.2.2.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package keyvault.models;

import com.microsoft.rest.Base64Url;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The secret restore parameters.
 */
public class SecretRestoreParameters {
    /**
     * The backup blob associated with a secret bundle.
     */
    @JsonProperty(value = "value", required = true)
    private Base64Url secretBundleBackup;

    /**
     * Get the secretBundleBackup value.
     *
     * @return the secretBundleBackup value
     */
    public byte[] secretBundleBackup() {
        if (this.secretBundleBackup == null) {
            return null;
        }
        return this.secretBundleBackup.decodedBytes();
    }

    /**
     * Set the secretBundleBackup value.
     *
     * @param secretBundleBackup the secretBundleBackup value to set
     * @return the SecretRestoreParameters object itself.
     */
    public SecretRestoreParameters withSecretBundleBackup(byte[] secretBundleBackup) {
        if (secretBundleBackup == null) {
            this.secretBundleBackup = null;
        } else {
            this.secretBundleBackup = Base64Url.encode(secretBundleBackup);
        }
        return this;
    }

}
