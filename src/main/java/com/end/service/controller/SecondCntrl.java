package com.end.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@RestController
@RequestMapping("newone")
public class SecondCntrl {

    @GetMapping("gfg")
    public String newTwo(){
        return "from new one";
    }

    public static void main(String[] args) {
        String s = "RaghuRa";
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Integer sum = numbers.stream().mapToInt(Integer::valueOf).sum();


        IntSummaryStatistics max = numbers.stream().collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println(max.getMax());
        System.out.println(max.getMin());

       Integer hi= numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow();
        System.out.println(hi);
    }
}
