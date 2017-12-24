package com.tw.wow.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
class Person {

    private String name;
    private int age;
}
