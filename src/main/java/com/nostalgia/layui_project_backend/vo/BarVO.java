package com.nostalgia.layui_project_backend.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
public class BarVO {
    List<String> name=new ArrayList<>();
    List<Integer> count=new ArrayList<>();
}
