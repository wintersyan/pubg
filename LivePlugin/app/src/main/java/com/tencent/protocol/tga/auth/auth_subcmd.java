// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: .\\auth.proto
package com.tencent.protocol.tga.auth;

import com.squareup.tga.ProtoEnum;

public enum auth_subcmd
    implements ProtoEnum {
  SUBCMD_AUTH_TOKEN(1);

  private final int value;

  private auth_subcmd(int value) {
    this.value = value;
  }

  @Override
  public int getValue() {
    return value;
  }
}
