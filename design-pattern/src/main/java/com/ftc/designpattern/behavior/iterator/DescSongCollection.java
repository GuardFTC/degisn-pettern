package com.ftc.designpattern.behavior.iterator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collections;
import java.util.List;

/**
 * @author: 冯铁城 [fengtiecheng@pwrd.com]
 * @date: 2025-05-09 10:14:09
 * @describe: 倒序歌单
 * @see SongIterator
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DescSongCollection implements SongCollection {

    /**
     * 歌曲集合
     */
    private List<Song> songs;

    @Override
    public SongIterator getSongIterator() {
        return new DescSongIterator(songs.size() - 1, songs);
    }

    /**
     * 顺序遍历迭代器
     */
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class DescSongIterator implements SongIterator {

        /**
         * 索引
         */
        private int index;

        /**
         * 歌曲集合
         */
        private List<Song> songs = Collections.emptyList();

        @Override
        public boolean hasNext() {
            return index >= 0;
        }

        @Override
        public Song next() {
            return songs.get(index--);
        }
    }
}
