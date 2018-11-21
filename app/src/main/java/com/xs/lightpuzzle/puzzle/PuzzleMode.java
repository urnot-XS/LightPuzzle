package com.xs.lightpuzzle.puzzle;

import com.xs.lightpuzzle.data.DataConstant;

public class PuzzleMode {
    //普通模板
    public static final int MODE_WAG = 0x4001;
    //拼接
    public static final int MODE_JOIN = 0x4003;
    //长图
    public static final int MODE_LONG = 0x4004;
    //视频
    public static final int MODE_VIDEO = 0x4005;
    //布局
    public static final int MODE_LAYOUT = 0x4006;
    //基础拼接
    public static final int MODE_LAYOUT_JOIN = 0x4007;

    public static int getMode(int theme) {
        switch (theme) {
            case DataConstant.TEMPLATE_CATEGORY.LONG_COLLAGE_GROUP:
            case DataConstant.TEMPLATE_CATEGORY.LONG_COLLAGE_SUB:
                return MODE_LONG;
            case DataConstant.TEMPLATE_CATEGORY.COLLAGE:
                return MODE_JOIN;
            default:
                return MODE_WAG;
        }
    }
}