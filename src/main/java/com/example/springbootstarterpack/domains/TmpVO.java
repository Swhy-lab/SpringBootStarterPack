package com.example.springbootstarterpack.domains;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
@Data
public class TmpVO {
    @Min(value = 0, message="err.1") int val;
    @Max(value = 100, message="err.2") int val2;

}
