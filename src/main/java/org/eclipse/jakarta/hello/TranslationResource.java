package org.eclipse.jakarta.hello;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.json.JSONObject;

@Path("translate")
public class TranslationResource {

    @GET
    //@Consumes(MediaType.APPLICATION_JSON)  // Expecting JSON input
    @Produces(MediaType.APPLICATION_JSON) // Returning JSON output
    public Response translate(@QueryParam("inputText")String inputText) {
        // Log the received text
        System.out.println("\nReceived text from body: " + inputText + "\n");

        // Instantiate the Translate class (ensure this class has a translate method)
        Translator translator = new Translator();
        String translatedText;

        try {
            // Call the translate method of the Translate class
            translatedText = translator.translate(inputText);  // Assuming translate method returns a string
        } catch (Exception e) {
            // Handle any errors in translation
        	System.out.println("funtion failed");
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                           .entity("{\"error\": \"Translation failed: " + e.getMessage() + "\"}")
                           .build();
        }

        // Create a JSON response with the translated text
        JSONObject jsonResponse = new JSONObject();
        jsonResponse.put("translatedText", translatedText);

        // Return the translated text as a JSON response
        return Response.ok(jsonResponse.toString(), MediaType.APPLICATION_JSON).build();

    }
}
