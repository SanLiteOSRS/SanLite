import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("pa")
@Implements("FriendsChatManager")
public class FriendsChatManager extends NameableContainer {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lrm;"
	)
	@Export("loginType")
	final LoginType loginType;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lpd;"
	)
	@Export("localUser")
	final Usernamed localUser;
	@ObfuscatedName("ab")
	@Export("name")
	public String name;
	@ObfuscatedName("an")
	@Export("owner")
	public String owner;
	@ObfuscatedName("ao")
	@Export("minKick")
	public byte minKick;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1348750425
	)
	@Export("rank")
	public int rank;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1707717227
	)
	int field4507;

	@ObfuscatedSignature(
		descriptor = "(Lrm;Lpd;)V"
	)
	public FriendsChatManager(LoginType var1, Usernamed var2) {
		super(500); // L: 19
		this.name = null; // L: 12
		this.owner = null; // L: 13
		this.field4507 = 1; // L: 16
		this.loginType = var1; // L: 20
		this.localUser = var2; // L: 21
	} // L: 22

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Lpb;",
		garbageValue = "1708206647"
	)
	@Export("newInstance")
	Nameable newInstance() {
		return new FriendsChatMember(); // L: 26
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)[Lpb;",
		garbageValue = "0"
	)
	@Export("newTypedArray")
	Nameable[] newTypedArray(int var1) {
		return new FriendsChatMember[var1]; // L: 31
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-612546541"
	)
	final void method7488(String var1) {
		this.name = class110.method2819(var1); // L: 35
	} // L: 36

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-104"
	)
	final void method7505(String var1) {
		this.owner = class110.method2819(var1); // L: 39
	} // L: 40

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lsy;II)V",
		garbageValue = "1528114624"
	)
	public final void method7479(Buffer var1, int var2) {
		this.method7505(var1.readStringCp1252NullTerminated()); // L: 43
		long var3 = var1.readLong(); // L: 44
		this.method7488(class207.method4073(var3)); // L: 45
		this.minKick = var1.readByte(); // L: 46
		int var5;
		short var6;
		if (var2 == 1) { // L: 49
			var5 = var1.readUnsignedByte(); // L: 50
			var6 = 255; // L: 51
		} else {
			if (var2 != 2) { // L: 53
				throw new IllegalArgumentException("Invalid friend chat full update version: " + var2); // L: 58
			}

			var5 = var1.method8628(); // L: 54
			var6 = -1; // L: 55
		}

		if (var5 != var6) { // L: 60
			int var7 = var5; // L: 63
			this.clear(); // L: 64

			for (int var8 = 0; var8 < var7; ++var8) { // L: 65
				FriendsChatMember var9 = (FriendsChatMember)this.addLastNoPreviousUsername(new Username(var1.readStringCp1252NullTerminated(), this.loginType)); // L: 66
				int var10 = var1.readUnsignedShort(); // L: 67
				var9.set(var10, ++this.field4507 - 1); // L: 68
				var9.rank = var1.readByte(); // L: 69
				var1.readStringCp1252NullTerminated(); // L: 70
				this.isLocalPlayer(var9); // L: 71
			}

		}
	} // L: 61 73

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lsy;I)V",
		garbageValue = "426960419"
	)
	public final void method7480(Buffer var1) {
		Username var2 = new Username(var1.readStringCp1252NullTerminated(), this.loginType); // L: 76
		int var3 = var1.readUnsignedShort(); // L: 77
		byte var4 = var1.readByte(); // L: 78
		boolean var5 = false; // L: 79
		if (var4 == -128) { // L: 80
			var5 = true;
		}

		FriendsChatMember var6;
		if (var5) { // L: 81
			if (this.getSize() == 0) { // L: 82
				return;
			}

			var6 = (FriendsChatMember)this.getByCurrentUsername(var2); // L: 83
			if (var6 != null && var6.getWorld() == var3) { // L: 84
				this.remove(var6); // L: 85
			}
		} else {
			var1.readStringCp1252NullTerminated(); // L: 89
			var6 = (FriendsChatMember)this.getByCurrentUsername(var2); // L: 90
			if (var6 == null) { // L: 91
				if (this.getSize() > super.capacity) { // L: 92
					return;
				}

				var6 = (FriendsChatMember)this.addLastNoPreviousUsername(var2); // L: 93
			}

			var6.set(var3, ++this.field4507 - 1); // L: 95
			var6.rank = var4; // L: 96
			this.isLocalPlayer(var6); // L: 97
		}

	} // L: 99

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "5"
	)
	@Export("clearFriends")
	public final void clearFriends() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) { // L: 102
			((FriendsChatMember)this.get(var1)).clearIsFriend(); // L: 103
		}

	} // L: 105

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "274384897"
	)
	@Export("invalidateIgnoreds")
	public final void invalidateIgnoreds() {
		for (int var1 = 0; var1 < this.getSize(); ++var1) { // L: 108
			((FriendsChatMember)this.get(var1)).clearIsIgnored(); // L: 109
		}

	} // L: 111

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lpo;I)V",
		garbageValue = "715375008"
	)
	@Export("isLocalPlayer")
	final void isLocalPlayer(FriendsChatMember var1) {
		if (var1.getUsername().equals(this.localUser.username())) { // L: 114
			this.rank = var1.rank;
		}

	} // L: 115

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILcv;ZI)I",
		garbageValue = "643710583"
	)
	static int method7509(int var0, Script var1, boolean var2) {
		boolean var3 = true; // L: 1046
		Widget var4;
		if (var0 >= 2000) { // L: 1048
			var0 -= 1000; // L: 1049
			var4 = WorldMapSection1.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1050
			var3 = false; // L: 1051
		} else {
			var4 = var2 ? GameObject.scriptDotWidget : SoundSystem.field319; // L: 1053
		}

		int var11;
		if (var0 == ScriptOpcodes.CC_SETOP) { // L: 1054
			var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] - 1; // L: 1055
			if (var11 >= 0 && var11 <= 9) { // L: 1056
				var4.setAction(var11, Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize]); // L: 1060
				return 1; // L: 1061
			} else {
				--HealthBar.Interpreter_stringStackSize; // L: 1057
				return 1; // L: 1058
			}
		} else {
			int var6;
			if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) { // L: 1063
				Interpreter.Interpreter_intStackSize -= 2; // L: 1064
				var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1065
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1066
				var4.parent = class36.getWidgetChild(var11, var6); // L: 1067
				return 1; // L: 1068
			} else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) { // L: 1070
				var4.isScrollBar = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1071
				return 1; // L: 1072
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) { // L: 1074
				var4.dragZoneSize = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1075
				return 1; // L: 1076
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) { // L: 1078
				var4.dragThreshold = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1079
				return 1; // L: 1080
			} else if (var0 == ScriptOpcodes.CC_SETOPBASE) { // L: 1082
				var4.dataText = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize]; // L: 1083
				return 1; // L: 1084
			} else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) { // L: 1086
				var4.spellActionName = Interpreter.Interpreter_stringStack[--HealthBar.Interpreter_stringStackSize]; // L: 1087
				return 1; // L: 1088
			} else if (var0 == ScriptOpcodes.CC_CLEAROPS) { // L: 1090
				var4.actions = null; // L: 1091
				return 1; // L: 1092
			} else if (var0 == 1308) { // L: 1094
				var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1095
				return 1; // L: 1096
			} else if (var0 == 1309) { // L: 1098
				--Interpreter.Interpreter_intStackSize; // L: 1099
				return 1; // L: 1100
			} else {
				int var7;
				byte[] var8;
				if (var0 != ScriptOpcodes.CC_SETOPKEY) { // L: 1102
					byte var5;
					if (var0 == ScriptOpcodes.CC_SETOPTKEY) { // L: 1132
						Interpreter.Interpreter_intStackSize -= 2; // L: 1133
						var5 = 10; // L: 1134
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]}; // L: 1135
						byte[] var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]}; // L: 1136
						GrandExchangeOffer.Widget_setKey(var4, var5, var8, var9); // L: 1137
						return 1; // L: 1138
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) { // L: 1140
						Interpreter.Interpreter_intStackSize -= 3; // L: 1141
						var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] - 1; // L: 1142
						var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1143
						var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 1144
						if (var11 >= 0 && var11 <= 9) { // L: 1145
							Timer.Widget_setKeyRate(var4, var11, var6, var7); // L: 1148
							return 1; // L: 1149
						} else {
							throw new RuntimeException(); // L: 1146
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) { // L: 1151
						var5 = 10; // L: 1152
						var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1153
						var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1154
						Timer.Widget_setKeyRate(var4, var5, var6, var7); // L: 1155
						return 1; // L: 1156
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) { // L: 1158
						--Interpreter.Interpreter_intStackSize; // L: 1159
						var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] - 1; // L: 1160
						if (var11 >= 0 && var11 <= 9) { // L: 1161
							class173.Widget_setKeyIgnoreHeld(var4, var11); // L: 1164
							return 1; // L: 1165
						} else {
							throw new RuntimeException(); // L: 1162
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) { // L: 1167
						var5 = 10; // L: 1168
						class173.Widget_setKeyIgnoreHeld(var4, var5); // L: 1169
						return 1; // L: 1170
					} else {
						return 2; // L: 1172
					}
				} else {
					byte[] var10 = null; // L: 1103
					var8 = null; // L: 1104
					if (var3) { // L: 1105
						Interpreter.Interpreter_intStackSize -= 10; // L: 1106

						for (var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + Interpreter.Interpreter_intStackSize] >= 0; var7 += 2) { // L: 1108 1109
						}

						if (var7 > 0) { // L: 1111
							var10 = new byte[var7 / 2]; // L: 1112
							var8 = new byte[var7 / 2]; // L: 1113

							for (var7 -= 2; var7 >= 0; var7 -= 2) { // L: 1114
								var10[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + Interpreter.Interpreter_intStackSize]; // L: 1115
								var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + Interpreter.Interpreter_intStackSize + 1]; // L: 1116
							}
						}
					} else {
						Interpreter.Interpreter_intStackSize -= 2; // L: 1121
						var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]}; // L: 1122
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]}; // L: 1123
					}

					var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] - 1; // L: 1125
					if (var7 >= 0 && var7 <= 9) { // L: 1126
						GrandExchangeOffer.Widget_setKey(var4, var7, var10, var8); // L: 1129
						return 1; // L: 1130
					} else {
						throw new RuntimeException(); // L: 1127
					}
				}
			}
		}
	}
}
