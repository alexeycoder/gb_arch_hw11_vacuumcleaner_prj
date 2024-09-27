package io.swagger.api;

import io.swagger.model.Group;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-09-27T16:36:05.325149630Z[GMT]")
@RestController
public class GroupsApiController implements GroupsApi {

    private static final Logger log = LoggerFactory.getLogger(GroupsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public GroupsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addGroup(@Parameter(in = ParameterIn.HEADER, description = "Имя для входа пользователя" ,required=true,schema=@Schema()) @RequestHeader(value="username", required=true) Object username
,@Parameter(in = ParameterIn.DEFAULT, description = "Создание новой группы пользоватей в базе", required=true, schema=@Schema()) @Valid @RequestBody Group body
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteGroup(@Parameter(in = ParameterIn.HEADER, description = "Имя для входа пользователя" ,required=true,schema=@Schema()) @RequestHeader(value="username", required=true) Object username
,@Parameter(in = ParameterIn.PATH, description = "Идентификатор группы", required=true, schema=@Schema()) @PathVariable("groupId") Object groupId
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Group> findGroupById(@Parameter(in = ParameterIn.HEADER, description = "Имя для входа пользователя" ,required=true,schema=@Schema()) @RequestHeader(value="username", required=true) Object username
,@Parameter(in = ParameterIn.PATH, description = "Идентификатор группы", required=true, schema=@Schema()) @PathVariable("groupId") Object groupId
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Group>(objectMapper.readValue("{\n  \"groupId\" : \"\",\n  \"members\" : \"\",\n  \"name\" : \"\"\n}", Group.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Group>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Group>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateGroup(@Parameter(in = ParameterIn.HEADER, description = "Имя для входа пользователя" ,required=true,schema=@Schema()) @RequestHeader(value="username", required=true) Object username
,@Parameter(in = ParameterIn.PATH, description = "Идентификатор группы", required=true, schema=@Schema()) @PathVariable("groupId") Object groupId
,@Parameter(in = ParameterIn.DEFAULT, description = "Обновить группу", required=true, schema=@Schema()) @Valid @RequestBody Group body
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
