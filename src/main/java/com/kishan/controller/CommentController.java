package com.kishan.controller;

import com.kishan.dto.CommentDto;
import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Controller
@Path("v1")
@Produces(MediaType.APPLICATION_JSON)
public class CommentController {

    @GET
    @Path("/comments.json")
    public List<CommentDto> getComments(){
        List<CommentDto> returnList = new ArrayList<>();
        returnList.add(new CommentDto().builder().comment("First comment").build());
        returnList.add(new CommentDto().builder().comment("Second comment").build());
        returnList.add(new CommentDto().builder().comment("Third comment").build());
        returnList.add(new CommentDto().builder().comment("Fourth comment").build());

        return returnList;
    }
}
