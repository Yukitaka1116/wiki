package com.solaluna.wiki.pojo.page;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


@Data
@TableName("chara")
public class Chara {
    @TableId(type = IdType.AUTO)
    private int id;
    private String chara;
    private String cast;
    private String info;

    public Chara(String chara, String cast, String info) {
    }
}

