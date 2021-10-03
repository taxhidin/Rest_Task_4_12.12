package com.example.rest_task_2;



import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.HashMap;

@Path("/hello-world")

public class UserResource {
    User message = new User(1, 2, 3, 4, 5, 6,7,8);



    @GET
    @Path("/input")
    @Produces(MediaType.APPLICATION_JSON)

        public Response getUsers() {


        try {
            int[] test = new int[8];
            test[0] = message.getFirst();
            test[1] = message.getSecond();
            test[2] = message.getThird();
            test[3] = message.getFourth();
            test[4] = message.getFive();
            test[5] = message.getSix();
            test[6] = message.getSeven();
            test[7] = message.getEight();

            return Response.ok(test).build();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;

    }


    @GET
    @Path("/output")
    @Produces(MediaType.APPLICATION_JSON)
        public Response getUsers_1() {


        try {

            HashMap<String, Integer> map = new HashMap<>();

            int value = message.getFirst() + message.getSecond() + message.getThird() + message.getFourth() + message.getFive() +
                    message.getSix()+message.getSeven()+message.getEight();

            map.put("result: ", value);


            return Response.ok(map).build();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;

    }







}
