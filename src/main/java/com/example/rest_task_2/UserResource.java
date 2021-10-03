package com.example.rest_task_2;


import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;

@Path("/hello-world")

public class UserResource {
   // User user = new User(1,2,3,4,5,6,7,8);

    @Inject
    SummaryService summaryService;


    @Inject
    Input input_value;

    @GET
    @Path("/input/{number_1}/{number_2}/{number_3}/{number_4}/{number_5}/{number_6}/{number_7}/{number_8}")
    @Produces(MediaType.APPLICATION_JSON)

        public Response getUsers(@QueryParam("number_1") int first, @QueryParam ("number_2") int second, @QueryParam ("number_3") int third,
                                 @QueryParam ("number_4") int fourth, @QueryParam ("number_5") int five, @QueryParam ("number_6") int six,
                                 @QueryParam("number_7") int seven,@QueryParam("number_8") int eight) {


        try {

            return Response.ok(input_value.getInput(first, second, third, fourth, five, six, seven, eight)).build();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;

    }

    @Inject

    Output output;

    @GET
    @Path("/output/{number_1_a}/{number_2_a}/{number_3_a}/{number_4_a}/{number_5_a}/{number_6_a}/{number_7_a}/{number_8_a}")
    @Produces(MediaType.APPLICATION_JSON)
        public Response getUsers_1(@QueryParam("number_1_a") int first_1, @QueryParam ("number_2_a") int second_1, @QueryParam ("number_3_a") int third_1,
                                   @QueryParam ("number_4_a") int fourth_1, @QueryParam ("number_5_a") int five_1, @QueryParam ("number_6_a") int six_1,
                                   @QueryParam("number_7_a") int seven_1,@QueryParam("number_8_a") int eight_1) {

        try {

            return Response.ok(output.getOutput(first_1, second_1, third_1, fourth_1, five_1, six_1, seven_1, eight_1)).build();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;

    }



}
