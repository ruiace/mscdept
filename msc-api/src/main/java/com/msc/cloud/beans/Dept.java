package com.msc.cloud.beans;

import com.sun.xml.internal.ws.runtime.config.TubelineFeatureReader;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Created by JF on 2018/8/8.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable{

    /**
     * `deptno` bigint(20) NOT NULL AUTO_INCREMENT,
     `dname` varchar(60) DEFAULT NULL,
     `db_source` varchar(60) DEFAULT NULL,
     */


    private Long deptno;
    private String dname;
    private String dbSource;


}
