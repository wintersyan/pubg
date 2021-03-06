// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: .\\ppkdc_schedule.proto
package com.tencent.protocol.tga.ppkdc_schedule;

import com.squareup.tga.ProtoEnum;

public enum VideoPlayType
    implements ProtoEnum {
  VIDEO_PLAY_TYPE_LIVE(0),
  /**
   * 直播
   */
  VIDEO_PLAY_TYPE_RECORD(1),
  /**
   * 回看
   */
  VIDEO_PLAY_TYPE_PROGRAM(2);

  private final int value;

  private VideoPlayType(int value) {
    this.value = value;
  }

  @Override
  public int getValue() {
    return value;
  }
}
