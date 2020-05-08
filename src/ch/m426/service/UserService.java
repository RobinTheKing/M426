package ch.m426.service;

import ch.bzz.book.data.UserDao;
import ch.bzz.book.model.User;
import ch.bzz.book.util.TokenHandler;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.NewCookie;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

/**
 * service controller for authentication
 * <p>
 * M151: BookDB
 *
 * @author Marcel Suter
 * @version 1.0
 * @since 2019-10-13
 */
@Path("user")
public class UserService {

    /**
     * authenticate the user with username/password
     *
     * @param username the username
     * @param password the password
     * @return empty String
     */
    @GET
    @Path("test")
    @Produces(MediaType.TEXT_PLAIN)
    public Response login() {

        return Response
                .status(httpStatus)
                .entity("FUNKTIONIERT!")
                .cookie()
                .build();
    }



}
