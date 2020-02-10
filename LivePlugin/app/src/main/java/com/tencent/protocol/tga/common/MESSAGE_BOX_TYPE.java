// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: .\\common.proto
package com.tencent.protocol.tga.common;

import com.squareup.tga.ProtoEnum;

public enum MESSAGE_BOX_TYPE
    implements ProtoEnum {
  /**
   * 1000~1999分配给助手
   */
  E_SHN_MESSAGE_TYPE_MEDAL(1000),
  /**
   *  有新的活动勋章
   */
  E_SMH_MESSAGE_TYPE_ZUOQI(1001),
  /**
   *  坐骑通知
   */
  E_SMH_MESSAGE_TYPE_TEAM_MEDAL(1002),
  /**
   *  战队勋章通知
   */
  E_SMH_MESSAGE_TYPE_BACKPACK(1003),
  /**
   *  背包礼物通知
   */
  E_SMH_MESSAGE_TYPE_VIP_UPGRADE(1004),
  /**
   *  VIP等级提升通知
   * 2000~2999分配给王者
   */
  E_SMOBA_MESSAGE_TYPE_BACKPACK(2000),
  /**
   * 背包通知
   */
  E_SMOBA_MESSAGE_TYPE_ZUOQI(2001),
  /**
   * 坐骑通知
   */
  E_SMOBA_MESSAGE_TYPE_MEDAL(2002),
  /**
   * 活动勋章通知
   * 3000~3999分配给飞车
   */
  E_MSPEED_MESSAGE_TYPE_BADGE_CHANGE(3000);

  private final int value;

  private MESSAGE_BOX_TYPE(int value) {
    this.value = value;
  }

  @Override
  public int getValue() {
    return value;
  }
}