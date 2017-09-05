/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.2.2.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package keyvault.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The key list result.
 */
public class KeyListResult {
    /**
     * A response message containing a list of keys in the key vault along with
     * a link to the next page of keys.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<KeyItem> value;

    /**
     * The URL to get the next set of keys.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public List<KeyItem> value() {
        return this.value;
    }

    /**
     * Get the nextLink value.
     *
     * @return the nextLink value
     */
    public String nextLink() {
        return this.nextLink;
    }

}
