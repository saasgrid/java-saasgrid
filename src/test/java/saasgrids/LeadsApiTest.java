/*
 * Saasgrids CRM grid
 * Saasgrids CRM grid
 *
 * OpenAPI spec version: 1.0.0
 * Contact: hello@saasgrids.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package saasgrids;

import crms.ApiException;
import saasgrids.InlineResponse2001;
import saasgrids.InlineResponse2002;
import saasgrids.Lead;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LeadsApi
 */
@Ignore
public class LeadsApiTest {

    private final LeadsApi api = new LeadsApi();

    
    /**
     * Creates a new lead
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createLeadTest() throws ApiException {
        String userId = null;
        Lead body = null;
        Lead response = api.createLead(userId, body);

        // TODO: test validations
    }
    
    /**
     * Delete lead by Id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteLeadByIdTest() throws ApiException {
        String userId = null;
        api.deleteLeadById(userId);

        // TODO: test validations
    }
    
    /**
     * Get all leads
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllLeadsTest() throws ApiException {
        String userId = null;
        String email = null;
        InlineResponse2001 response = api.getAllLeads(userId, email);

        // TODO: test validations
    }
    
    /**
     * Get lead by Id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLeadByIdTest() throws ApiException {
        String userId = null;
        String leadId = null;
        Lead response = api.getLeadById(userId, leadId);

        // TODO: test validations
    }
    
    /**
     * Get all lead filters
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLeadFiltersTest() throws ApiException {
        String userId = null;
        InlineResponse2002 response = api.getLeadFilters(userId);

        // TODO: test validations
    }
    
    /**
     * Get all leads by filter
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getLeadsByFilterTest() throws ApiException {
        String userId = null;
        String filterId = null;
        InlineResponse2001 response = api.getLeadsByFilter(userId, filterId);

        // TODO: test validations
    }
    
    /**
     * Update lead by Id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateLeadByIdTest() throws ApiException {
        String userId = null;
        Lead body = null;
        api.updateLeadById(userId, body);

        // TODO: test validations
    }
    
}
