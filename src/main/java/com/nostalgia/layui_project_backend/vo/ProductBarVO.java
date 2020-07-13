package com.nostalgia.layui_project_backend.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ProductBarVO {
    String name;
    @JsonProperty("value")
    Integer count;
}
