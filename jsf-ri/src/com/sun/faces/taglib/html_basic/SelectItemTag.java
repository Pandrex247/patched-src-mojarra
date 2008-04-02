/*
 * $Id: SelectItemTag.java,v 1.21 2003/09/25 16:36:32 rlubke Exp $
 */

/*
 * Copyright 2003 Sun Microsystems, Inc. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.sun.faces.taglib.html_basic;

import javax.faces.component.UIComponent;
import javax.faces.component.UISelectItem;
import com.sun.faces.taglib.BaseComponentTag;

/**
 * This class is the tag handler that evaluates the 
 * <code>selectitem</code> custom tag.
 */

public class SelectItemTag extends BaseComponentTag
{
    //
    // Protected Constants
    //

    //
    // Class Variables
    //

    //
    // Instance Variables
    //

    // Attribute Instance Variables

    protected String selected = null;
    protected String itemValue = null;
    protected String itemLabel = null;
    protected String description = null;
   
    // Relationship Instance Variables

    //
    // Constructors and Initializers    
    //

    public SelectItemTag()
    {
        super();
    }

    //
    // Class methods
    //

    // 
    // Accessors
    //

    public void setItemValue(String value) {
        this.itemValue = value;
    }

    public void setItemLabel(String label) {
        this.itemLabel = label;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    

    //
    // General Methods
    //
    public String getRendererType() { 
        return null;
    }
    public String getComponentType() { 
        return "SelectItem"; 
    }
    
    //
    // Methods from BaseComponentTag
    //

    protected void overrideProperties(UIComponent component) {
	super.overrideProperties(component);
	UISelectItem selectItem = (UISelectItem) component;
	
	if (null != itemValue) {
	    selectItem.setItemValue(itemValue);
	}
	if (null != itemLabel) {
	    selectItem.setItemLabel(itemLabel);
	}
	if (null != description) {
	    selectItem.setItemDescription(description);
	}
        
    }

} // end of class SelectItemTag
