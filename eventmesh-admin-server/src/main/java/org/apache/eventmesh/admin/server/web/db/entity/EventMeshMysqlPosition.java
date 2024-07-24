/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.eventmesh.admin.server.web.db.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;

/**
 * event_mesh_mysql_position
 */
@TableName(value = "event_mesh_mysql_position")
@Data
public class EventMeshMysqlPosition implements Serializable {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private Integer jobID;

    private String serverUUID;

    private String address;

    private Long position;

    private String gtid;

    private String currentGtid;

    private Long timestamp;

    private String journalName;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;
}