package net.raissa.students.web;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import net.raissa.students.models.dtos.ApiErrorResponse;
import net.raissa.students.models.entities.Teacher;
import net.raissa.students.repository.TeacherRepository;
import net.raissa.students.services.TeacherService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@CrossOrigin({"*"})
@Slf4j
public class TeacherController {
    private final  TeacherRepository teacherRepository;
    private final TeacherService teacherService;

    public TeacherController(TeacherRepository teacherRepository, TeacherService teacherService) {
        this.teacherRepository = teacherRepository;
        this.teacherService = teacherService;
    }


    @Operation(summary = "Get all teachers", description = "Retrieve a list of all teachers")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved list",
                    content = {@Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Teacher.class)))}),
            @ApiResponse(responseCode = "500", description = "Internal server error",
                    content = @Content(mediaType = "application/json",schema = @Schema(implementation = ApiErrorResponse.class)))
    })
    @GetMapping
    public List<Teacher> getAllTeachers(){
       return this.teacherRepository.findAll();}
}
