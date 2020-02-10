// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: .\\chat_msg.proto
package com.tencent.protocol.tga.chatMsg;

import com.squareup.tga.Message;
import com.squareup.tga.ProtoField;
import okiotga.ByteString;

import static com.squareup.tga.Message.Datatype.BYTES;
import static com.squareup.tga.Message.Datatype.INT32;
import static com.squareup.tga.Message.Datatype.UINT32;
import static com.squareup.tga.Message.Label.REQUIRED;

/**
 * 玩家赠送消息
 */
public final class PlayerGiveCardMsg extends Message {

  public static final ByteString DEFAULT_USER_ID = ByteString.EMPTY;
  public static final ByteString DEFAULT_USER_NAME = ByteString.EMPTY;
  public static final ByteString DEFAULT_ANCHOR_ID = ByteString.EMPTY;
  public static final ByteString DEFAULT_ROOM_ID = ByteString.EMPTY;
  public static final Integer DEFAULT_ID = 0;
  public static final Integer DEFAULT_CARD_TYPE = 0;
  public static final Integer DEFAULT_CONSUME_ENERGY = 0;
  public static final Integer DEFAULT_CHARGE_ENERGY = 0;
  public static final Integer DEFAULT_SCALE = 0;
  public static final ByteString DEFAULT_NAME = ByteString.EMPTY;
  public static final ByteString DEFAULT_PICTURE = ByteString.EMPTY;
  public static final ByteString DEFAULT_USER_FACE = ByteString.EMPTY;
  public static final Integer DEFAULT_SEQ = 0;

  @ProtoField(tag = 1, type = BYTES, label = REQUIRED)
  public final ByteString user_id;

  /**
   * 玩家id
   */
  @ProtoField(tag = 2, type = BYTES, label = REQUIRED)
  public final ByteString user_name;

  /**
   * 玩家名称
   */
  @ProtoField(tag = 3, type = BYTES, label = REQUIRED)
  public final ByteString anchor_id;

  /**
   * 主播id
   */
  @ProtoField(tag = 4, type = BYTES, label = REQUIRED)
  public final ByteString room_id;

  /**
   * 主播房间id
   */
  @ProtoField(tag = 5, type = UINT32)
  public final Integer id;

  /**
   * 卡牌id
   */
  @ProtoField(tag = 6, type = UINT32)
  public final Integer card_type;

  /**
   * 卡牌类型,参见cards.proto中的ENUM_CARD_TYPE
   */
  @ProtoField(tag = 7, type = INT32)
  public final Integer consume_energy;

  /**
   * 消耗的能量值,普通卡为负值,充能卡为正值
   */
  @ProtoField(tag = 8, type = INT32)
  public final Integer charge_energy;

  /**
   * 卡的充能值
   */
  @ProtoField(tag = 9, type = UINT32)
  public final Integer scale;

  /**
   * 卡的倍率
   */
  @ProtoField(tag = 10, type = BYTES)
  public final ByteString name;

  /**
   * 卡命名
   */
  @ProtoField(tag = 11, type = BYTES)
  public final ByteString picture;

  /**
   * 图片url
   */
  @ProtoField(tag = 12, type = BYTES)
  public final ByteString user_face;

  /**
   * 玩家头像url
   */
  @ProtoField(tag = 13, type = UINT32)
  public final Integer seq;

  public PlayerGiveCardMsg(ByteString user_id, ByteString user_name, ByteString anchor_id, ByteString room_id, Integer id, Integer card_type, Integer consume_energy, Integer charge_energy, Integer scale, ByteString name, ByteString picture, ByteString user_face, Integer seq) {
    this.user_id = user_id;
    this.user_name = user_name;
    this.anchor_id = anchor_id;
    this.room_id = room_id;
    this.id = id;
    this.card_type = card_type;
    this.consume_energy = consume_energy;
    this.charge_energy = charge_energy;
    this.scale = scale;
    this.name = name;
    this.picture = picture;
    this.user_face = user_face;
    this.seq = seq;
  }

  private PlayerGiveCardMsg(Builder builder) {
    this(builder.user_id, builder.user_name, builder.anchor_id, builder.room_id, builder.id, builder.card_type, builder.consume_energy, builder.charge_energy, builder.scale, builder.name, builder.picture, builder.user_face, builder.seq);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof PlayerGiveCardMsg)) return false;
    PlayerGiveCardMsg o = (PlayerGiveCardMsg) other;
    return equals(user_id, o.user_id)
        && equals(user_name, o.user_name)
        && equals(anchor_id, o.anchor_id)
        && equals(room_id, o.room_id)
        && equals(id, o.id)
        && equals(card_type, o.card_type)
        && equals(consume_energy, o.consume_energy)
        && equals(charge_energy, o.charge_energy)
        && equals(scale, o.scale)
        && equals(name, o.name)
        && equals(picture, o.picture)
        && equals(user_face, o.user_face)
        && equals(seq, o.seq);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = user_id != null ? user_id.hashCode() : 0;
      result = result * 37 + (user_name != null ? user_name.hashCode() : 0);
      result = result * 37 + (anchor_id != null ? anchor_id.hashCode() : 0);
      result = result * 37 + (room_id != null ? room_id.hashCode() : 0);
      result = result * 37 + (id != null ? id.hashCode() : 0);
      result = result * 37 + (card_type != null ? card_type.hashCode() : 0);
      result = result * 37 + (consume_energy != null ? consume_energy.hashCode() : 0);
      result = result * 37 + (charge_energy != null ? charge_energy.hashCode() : 0);
      result = result * 37 + (scale != null ? scale.hashCode() : 0);
      result = result * 37 + (name != null ? name.hashCode() : 0);
      result = result * 37 + (picture != null ? picture.hashCode() : 0);
      result = result * 37 + (user_face != null ? user_face.hashCode() : 0);
      result = result * 37 + (seq != null ? seq.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<PlayerGiveCardMsg> {

    public ByteString user_id;
    public ByteString user_name;
    public ByteString anchor_id;
    public ByteString room_id;
    public Integer id;
    public Integer card_type;
    public Integer consume_energy;
    public Integer charge_energy;
    public Integer scale;
    public ByteString name;
    public ByteString picture;
    public ByteString user_face;
    public Integer seq;

    public Builder() {
    }

    public Builder(PlayerGiveCardMsg message) {
      super(message);
      if (message == null) return;
      this.user_id = message.user_id;
      this.user_name = message.user_name;
      this.anchor_id = message.anchor_id;
      this.room_id = message.room_id;
      this.id = message.id;
      this.card_type = message.card_type;
      this.consume_energy = message.consume_energy;
      this.charge_energy = message.charge_energy;
      this.scale = message.scale;
      this.name = message.name;
      this.picture = message.picture;
      this.user_face = message.user_face;
      this.seq = message.seq;
    }

    public Builder user_id(ByteString user_id) {
      this.user_id = user_id;
      return this;
    }

    /**
     * 玩家id
     */
    public Builder user_name(ByteString user_name) {
      this.user_name = user_name;
      return this;
    }

    /**
     * 玩家名称
     */
    public Builder anchor_id(ByteString anchor_id) {
      this.anchor_id = anchor_id;
      return this;
    }

    /**
     * 主播id
     */
    public Builder room_id(ByteString room_id) {
      this.room_id = room_id;
      return this;
    }

    /**
     * 主播房间id
     */
    public Builder id(Integer id) {
      this.id = id;
      return this;
    }

    /**
     * 卡牌id
     */
    public Builder card_type(Integer card_type) {
      this.card_type = card_type;
      return this;
    }

    /**
     * 卡牌类型,参见cards.proto中的ENUM_CARD_TYPE
     */
    public Builder consume_energy(Integer consume_energy) {
      this.consume_energy = consume_energy;
      return this;
    }

    /**
     * 消耗的能量值,普通卡为负值,充能卡为正值
     */
    public Builder charge_energy(Integer charge_energy) {
      this.charge_energy = charge_energy;
      return this;
    }

    /**
     * 卡的充能值
     */
    public Builder scale(Integer scale) {
      this.scale = scale;
      return this;
    }

    /**
     * 卡的倍率
     */
    public Builder name(ByteString name) {
      this.name = name;
      return this;
    }

    /**
     * 卡命名
     */
    public Builder picture(ByteString picture) {
      this.picture = picture;
      return this;
    }

    /**
     * 图片url
     */
    public Builder user_face(ByteString user_face) {
      this.user_face = user_face;
      return this;
    }

    /**
     * 玩家头像url
     */
    public Builder seq(Integer seq) {
      this.seq = seq;
      return this;
    }

    @Override
    public PlayerGiveCardMsg build() {
      checkRequiredFields();
      return new PlayerGiveCardMsg(this);
    }
  }
}