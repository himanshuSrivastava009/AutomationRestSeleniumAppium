package com.qa.rest.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class PojoTest {


    private int marks;
    private String name;
    private int age;
    private long phoneNumber;
}

class Student{

    public static void main(String[] args) throws JsonProcessingException {
        PojoTest pojoTest = PojoTest.builder()
                .age(30)
                .name("Himanshu")
                .marks(100)
                .phoneNumber(9980774417l).build();

        System.out.println(pojoTest.getName());

        ObjectMapper mapper = new ObjectMapper();
       String value =  mapper.writeValueAsString(pojoTest);

      PojoTest pt =  mapper.readValue(value, PojoTest.class );

        System.out.println(pt.getName());

    }
}
