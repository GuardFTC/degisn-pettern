package com.ftc.designpattern.behavior.iterator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: 冯铁城 [fengtiecheng@pwrd.com]
 * @date: 2025-05-09 10:09:54
 * @describe: 歌曲类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Song {

    /**
     * 歌曲名称
     */
    private String name;

    /**
     * 播放歌曲
     */
    public void play() {
        System.out.println(STR."播放歌曲：\{name}");
    }
}
