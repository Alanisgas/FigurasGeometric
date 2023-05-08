package controllers;

import model.Circle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.CircleService;

import java.util.List;

@RestController
@RequestMapping(value = "/circle")
public class CircleController {

    @Autowired
    CircleService circleService = new CircleService();
    @GetMapping("/{id}")
    public ResponseEntity<?> getCircleId(@PathVariable("id") int id){
        List<Circle> circles = (List<Circle>) circleService.findCircleById(id);
        if (circles.isEmpty()){
            return  new ResponseEntity<List<Circle>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Circle>>(circles,HttpStatus.OK);
    }


}
