package demo.demo.controller;

import demo.demo.entity.Assortment;
import demo.demo.repository.AssortmentRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/assortment")
public class AssortmentController {

    private final AssortmentRepo assortmentRepo;

    public AssortmentController(AssortmentRepo assortmentRepo) {
        this.assortmentRepo = assortmentRepo;
    }

    @GetMapping("get")
    public List<Assortment> getAssortment(){
        return assortmentRepo.findAll();
    }
    @GetMapping("bathroom")
    public List<Assortment> getBathroomAssortment(){
        return assortmentRepo.findAllByRoomType("bathroom");
    }

    @GetMapping("kitchen")
    public List<Assortment> getKitchenAssortment(){
        return assortmentRepo.findAllByRoomType("kitchen");
    }

    @GetMapping("living_room")
    public List<Assortment> getLivingRoomAssortment(){
        return assortmentRepo.findAllByRoomType("livingRoom");
    }

    @GetMapping("bedroom")
    public List<Assortment> getBedroomAssortment(){
        return assortmentRepo.findAllByRoomType("bedroom");
    }

    @PostMapping("add")
    public Assortment addNewAssortment(@RequestBody Assortment assortment){
        return assortmentRepo.save(assortment);
    }

    @DeleteMapping("delete/{assortmentId}")
    public void deleteAssortment(@PathVariable Long assortmentId){
        assortmentRepo.deleteById(assortmentId);
    }
}

