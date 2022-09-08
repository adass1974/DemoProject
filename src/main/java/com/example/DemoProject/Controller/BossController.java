package com.example.DemoProject.Controller;

import com.example.DemoProject.Model.Boss;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BossController {

    @GetMapping("/boss")
    public List<Boss> getAllBoss() {

        List<Boss> bossList = new ArrayList<Boss>();
        bossList.add(new Boss(1, "Tomas", 22));
        bossList.add(new Boss(47, "Emina", 21));
        bossList.add(new Boss(420, "Anoop", 48));
        bossList.add(new Boss(10, "Boss2", 80));
        bossList.add(new Boss(2, "BabyBoss", 12));
        return bossList;
    }
    @GetMapping("boss/{bossID}")
        public Boss getBosswithID(@PathVariable Integer bossID){

        return new Boss(3, "Mr Bean", 44);
        }

        @PostMapping("/boss/newBoss")
        public void addPerson(@RequestBody Boss boss){
            System.out.println("Saving Boss Information to the Database");
        }

    }

