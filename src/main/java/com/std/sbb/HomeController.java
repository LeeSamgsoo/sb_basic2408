package com.std.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HomeController {
    private int num;

    public HomeController() {
        num = -1;
    }

    @GetMapping("/home/return/array")
    @ResponseBody
    public int[] showArray() {
        int[] arr = new int[]{10, 20, 30};
        return arr;
    }

    @GetMapping("/home/return/list")
    @ResponseBody
    public List<Integer> showList() {
        List<Integer> list = new ArrayList<>() {{
            add(20);
            add(20);
            add(30);
        }};
        return list;
    }

    @GetMapping("/home/return/map")
    @ResponseBody
    public Map<String, Object> showMap() {
        Map<String, Object> map = new LinkedHashMap<>() {{
            put("id", 1);
            put("speed", 100);
            put("name", "카니발");
            put("relatedIds", new ArrayList<>() {{
                add(2);
                add(3);
                add(4);
            }});
        }};
        return map;
    }

    @GetMapping("/home/return/car")
    @ResponseBody
    public Car showCar() {
        Car car = new Car(1, 100, "카니발",
                new ArrayList<>() {{
                    add(2);
                    add(3);
                    add(4);
                }});
        return car;
    }

    @GetMapping("/home/plus")
    @ResponseBody
    public int showPlus(@RequestParam int a, @RequestParam int b) {
        return a + b;
    }

    @GetMapping("/home/minus")
    @ResponseBody
    public int showMinus(@RequestParam int a, @RequestParam int b) {
        return a - b;
    }

    @GetMapping("/home/multiply")
    @ResponseBody
    public int showMultiply(@RequestParam int a, @RequestParam int b) {
        return a * b;
    }

    @GetMapping("/home/divide")
    @ResponseBody
    public int showDivide(@RequestParam int a, @RequestParam int b) {
        return a / b;
    }

    @GetMapping("/home/increase")
    @ResponseBody
    public int getA() {
        num++;
        return num;
    }

    @GetMapping("/home/main")
    @ResponseBody
    public String ShowMain() {
        return "안녕하세요";
    }

    @GetMapping("/home/main2")
    @ResponseBody
    public String ShowMain2() {
        return "반갑습니다.";
    }

    @GetMapping("/home/main3")
    @ResponseBody
    public String ShowMain3() {
        return "즐거웠습니다.";
    }
}

class Car {
    private int id;
    private int speed;
    private String name;
    private List<Integer> relatedIds;

    public Car(int id, int speed, String name, List<Integer> relatedIds) {
        this.id = id;
        this.speed = speed;
        this.name = name;
        this.relatedIds = relatedIds;
    }

    public int getId() {
        return id;
    }

    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getRelatedIds() {
        return relatedIds;
    }
}
