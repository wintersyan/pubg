// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: .\\hpjy_treasure.proto
package com.tencent.protocol.tga.hpjy_treasure;

import com.squareup.tga.ProtoEnum;

public enum RET_CODE
    implements ProtoEnum {
  kSuccess(0),
  /**
   * 领取成功
   */
  kAreadyReceive(1),
  /**
   * 已经领取
   */
  kServerError(2);

  private final int value;

  private RET_CODE(int value) {
    this.value = value;
  }

  @Override
  public int getValue() {
    return value;
  }
}