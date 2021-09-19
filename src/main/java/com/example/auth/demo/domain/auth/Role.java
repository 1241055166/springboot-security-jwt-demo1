package com.example.auth.demo.domain.auth;

import lombok.Builder;
import lombok.Data;

/**
 * @author Henry
 * createAt: 2020/9/17
 */
@Data
@Builder
public class Role {
    private Long id;
    private String name;
    private String nameZh;
}
