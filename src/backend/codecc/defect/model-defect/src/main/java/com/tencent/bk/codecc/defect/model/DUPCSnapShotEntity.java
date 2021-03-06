/*
 * Tencent is pleased to support the open source community by making BK-CI 蓝鲸持续集成平台 available.
 *
 * Copyright (C) 2019 THL A29 Limited, a Tencent company.  All rights reserved.
 *
 * BK-CI 蓝鲸持续集成平台 is licensed under the MIT license.
 *
 * A copy of the MIT License is included in this file.
 *
 *
 * Terms of the MIT License:
 * ---------------------------------------------------
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy,
 * modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT
 * LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN
 * NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
 
package com.tencent.bk.codecc.defect.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tencent.bk.codecc.defect.model.common.ToolSnapShotEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

/**
 * 重复率工具快照实体类
 * 
 * @date 2019/6/30
 * @version V1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DUPCSnapShotEntity extends ToolSnapShotEntity
{
    /**
     * 最近一次分析，总的重复的文件个数
     */
    @Field("total_dupfile_count")
    @JsonProperty("total_dupfile_count")
    private int totalDupfileCount;

    /**
     * 最近一次分析，变化的重复文件个数
     */
    @Field("changed_dupfile_count")
    @JsonProperty("changed_dupfile_count")
    private int changedDupfileCount;

    /**
     * 最近一次分析，当前的代码重复率
     */
    @Field("current_dup_rate")
    @JsonProperty("current_dup_rate")
    private String currentDupRate;

    /**
     * 最近一次分析，变化的代码重复率
     */
    @Field("changed_dup_rate")
    @JsonProperty("changed_dup_rate")
    private String changedDupRate;

    /**
     * 风险函数级别分布
     */
    @Field("super_high")
    @JsonProperty("super_high")
    private int superHigh;

    private int high;

    private int medium;

    //平均圈复杂度趋势
    @Field("dupc_chart")
    @JsonProperty("dupc_chart")
    private List<DupcChartTrendEntity> dupcChart;
}
