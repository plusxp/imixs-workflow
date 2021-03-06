/*  
 *  Imixs-Workflow 
 *  
 *  Copyright (C) 2001-2020 Imixs Software Solutions GmbH,  
 *  http://www.imixs.com
 *  
 *  This program is free software; you can redistribute it and/or 
 *  modify it under the terms of the GNU General Public License 
 *  as published by the Free Software Foundation; either version 2 
 *  of the License, or (at your option) any later version.
 *  
 *  This program is distributed in the hope that it will be useful, 
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of 
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU 
 *  General Public License for more details.
 *  
 *  You can receive a copy of the GNU General Public
 *  License at http://www.gnu.org/licenses/gpl.html
 *  
 *  Project: 
 *      https://www.imixs.org
 *      https://github.com/imixs/imixs-workflow
 *  
 *  Contributors:  
 *      Imixs Software Solutions GmbH - Project Management
 *      Ralph Soika - Software Developer
 */
package org.imixs.workflow.exceptions;

/**
 * An AdapterException is thrown by an Imixs-Workflow Adapter implementation
 * 
 * @author rsoika
 * 
 */
public class AdapterException extends WorkflowException {

    private static final long serialVersionUID = 1L;
    private Object[] params = null;

    public AdapterException(String aErrorContext, String aErrorCode, String message) {
        super(aErrorContext, aErrorCode, message);
    }

    public AdapterException(String aErrorContext, String aErrorCode, String message, Exception e) {
        super(aErrorContext, aErrorCode, message, e);
    }

    public AdapterException(String aErrorContext, String aErrorCode, String message, Object[] params) {
        super(aErrorContext, aErrorCode, message);
        this.params = params;
    }
    
    public AdapterException(PluginException e) {
        super(e.getErrorContext(), e.getErrorCode(), e.getMessage(), e);
    }

    public Object[] getErrorParameters() {
        return params;
    }

    protected void setErrorParameters(Object[] aparams) {
        this.params = aparams;
    }

}
