// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: .\\ppkdc_schedule.proto
package com.tencent.protocol.tga.ppkdc_schedule;

import com.squareup.tga.ProtoEnum;

public enum ChannelSourceType
    implements ProtoEnum {
  E_CHANNEL_SOURCE_TYPE_PPKDC_SL(400);

  private final int value;

  private ChannelSourceType(int value) {
    this.value = value;
  }

  @Override
  public int getValue() {
    return value;
  }
}
