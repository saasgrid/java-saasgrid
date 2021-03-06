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
import saasgrids.Note;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NotesApi
 */
@Ignore
public class NotesApiTest {

    private final NotesApi api = new NotesApi();

    
    /**
     * Creates a new note
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createNoteTest() throws ApiException {
        String userId = null;
        Note body = null;
        api.createNote(userId, body);

        // TODO: test validations
    }
    
    /**
     * Delete note by Id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNoteByIdTest() throws ApiException {
        String userId = null;
        api.deleteNoteById(userId);

        // TODO: test validations
    }
    
    /**
     * Get all notes
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllNotesTest() throws ApiException {
        String userId = null;
        String email = null;
        List<Note> response = api.getAllNotes(userId, email);

        // TODO: test validations
    }
    
    /**
     * Get note by Id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNoteByIdTest() throws ApiException {
        String userId = null;
        String noteId = null;
        Note response = api.getNoteById(userId, noteId);

        // TODO: test validations
    }
    
    /**
     * Update note by Id
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateNoteByIdTest() throws ApiException {
        String userId = null;
        Note body = null;
        api.updateNoteById(userId, body);

        // TODO: test validations
    }
    
}
