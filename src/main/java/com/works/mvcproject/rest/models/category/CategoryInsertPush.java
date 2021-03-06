
package com.works.mvcproject.rest.models.category;

import java.util.HashMap;
import java.util.Map;

public class CategoryInsertPush {

    private String categoryname;
    private String iconPath;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();        
    
	public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }

    public String getIconPath() {
        return iconPath;
    }

    public void setIconPath(String iconPath) {
        this.iconPath = iconPath;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
