// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: .\\chat.proto
package com.tencent.protocol.tga.chat;

import com.squareup.tga.ProtoEnum;

public enum chat_cmd_types
    implements ProtoEnum {
  CMD_CHAT(4112);

  private final int value;

  private chat_cmd_types(int value) {
    this.value = value;
  }

  @Override
  public int getValue() {
    return value;
  }
}