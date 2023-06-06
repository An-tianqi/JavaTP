package sakila.spring.controllers;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import sakila.spring.entities.Country;
import sakila.spring.entities.Staff;
import sakila.spring.services.StaffService;

@RestController
@AllArgsConstructor
@Slf4j
@RequestMapping("/staff")
public class StaffController {

    private StaffService service;

    @GetMapping(value = "/picture/{id}", produces = {MediaType.IMAGE_JPEG_VALUE})
    public byte[] getPicture(@PathVariable Long id){
        log.trace("get picture for id :{}",id);
        return service.read(id).getPicture();
    }

    @PostMapping("/create")
    public Staff create(@RequestBody Staff staff){
        log.trace("Country create -->{}",staff);
        return service.create(staff);
    }

    @PutMapping("/update/{id}")
    public Staff update(@PathVariable Long id,@RequestBody byte[] picture){
        var staff = service.read(id);
            staff.setPicture(picture);
            return service.update(staff);
    }
}
