import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;
import org.bouncycastle.crypto.tls.DefaultTlsClient;
import org.bouncycastle.crypto.tls.TlsAuthentication;

@ObfuscatedName("ad")
class class13 extends DefaultTlsClient {
	@ObfuscatedName("wp")
	@ObfuscatedGetter(
		intValue = -846704087
	)
	@Export("foundItemIndex")
	static int foundItemIndex;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ltj;"
	)
	@Export("logoSprite")
	static IndexedSprite logoSprite;
	@ObfuscatedName("aa")
	public static short[][] field65;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("Widget_fontsArchive")
	public static AbstractArchive Widget_fontsArchive;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Laj;"
	)
	final class12 this$1;

	@ObfuscatedSignature(
		descriptor = "(Laj;)V"
	)
	class13(class12 var1) {
		this.this$1 = var1; // L: 292
	}

	public Hashtable getClientExtensions() throws IOException {
		Hashtable var1 = super.getClientExtensions(); // L: 295
		if (var1 == null) { // L: 296
			var1 = new Hashtable(); // L: 297
		}

		byte[] var2 = this.this$1.val$host.getBytes(); // L: 299
		ByteArrayOutputStream var3 = new ByteArrayOutputStream(); // L: 300
		DataOutputStream var4 = new DataOutputStream(var3); // L: 301
		var4.writeShort(var2.length + 3); // L: 302
		var4.writeByte(0); // L: 303
		var4.writeShort(var2.length); // L: 304
		var4.write(var2); // L: 305
		var4.close(); // L: 306
		var1.put(0, var3.toByteArray()); // L: 307
		return var1; // L: 308
	}

	public TlsAuthentication getAuthentication() throws IOException {
		return new class11(this); // L: 313
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "1260252109"
	)
	static int method165(int var0, Script var1, boolean var2) {
		boolean var3 = true; // L: 1071
		Widget var4;
		if (var0 >= 2000) { // L: 1073
			var0 -= 1000; // L: 1074
			var4 = FriendSystem.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1075
			var3 = false; // L: 1076
		} else {
			var4 = var2 ? class53.scriptDotWidget : Interpreter.field864; // L: 1078
		}

		int var11;
		if (var0 == ScriptOpcodes.CC_SETOP) { // L: 1079
			var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] - 1; // L: 1080
			if (var11 >= 0 && var11 <= 9) { // L: 1081
				var4.setAction(var11, Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize]); // L: 1085
				return 1; // L: 1086
			} else {
				--class149.Interpreter_stringStackSize; // L: 1082
				return 1; // L: 1083
			}
		} else {
			int var6;
			if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) { // L: 1088
				Interpreter.Interpreter_intStackSize -= 2; // L: 1089
				var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1090
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1091
				var4.parent = class158.getWidgetChild(var11, var6); // L: 1092
				return 1; // L: 1093
			} else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) { // L: 1095
				var4.isScrollBar = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1096
				return 1; // L: 1097
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) { // L: 1099
				var4.dragZoneSize = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1100
				return 1; // L: 1101
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) { // L: 1103
				var4.dragThreshold = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1104
				return 1; // L: 1105
			} else if (var0 == ScriptOpcodes.CC_SETOPBASE) { // L: 1107
				var4.dataText = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize]; // L: 1108
				return 1; // L: 1109
			} else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) { // L: 1111
				var4.spellActionName = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize]; // L: 1112
				return 1; // L: 1113
			} else if (var0 == ScriptOpcodes.CC_CLEAROPS) { // L: 1115
				var4.actions = null; // L: 1116
				return 1; // L: 1117
			} else if (var0 == 1308) { // L: 1119
				var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 1120
				return 1; // L: 1121
			} else if (var0 == 1309) { // L: 1123
				--Interpreter.Interpreter_intStackSize; // L: 1124
				return 1; // L: 1125
			} else {
				int var7;
				byte[] var8;
				if (var0 != ScriptOpcodes.CC_SETOPKEY) { // L: 1127
					byte var5;
					if (var0 == ScriptOpcodes.CC_SETOPTKEY) { // L: 1157
						Interpreter.Interpreter_intStackSize -= 2; // L: 1158
						var5 = 10; // L: 1159
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]}; // L: 1160
						byte[] var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]}; // L: 1161
						Login.Widget_setKey(var4, var5, var8, var9); // L: 1162
						return 1; // L: 1163
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) { // L: 1165
						Interpreter.Interpreter_intStackSize -= 3; // L: 1166
						var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] - 1; // L: 1167
						var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1168
						var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 1169
						if (var11 >= 0 && var11 <= 9) { // L: 1170
							JagexCache.Widget_setKeyRate(var4, var11, var6, var7); // L: 1173
							return 1; // L: 1174
						} else {
							throw new RuntimeException(); // L: 1171
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) { // L: 1176
						var5 = 10; // L: 1177
						var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1178
						var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1179
						JagexCache.Widget_setKeyRate(var4, var5, var6, var7); // L: 1180
						return 1; // L: 1181
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) { // L: 1183
						--Interpreter.Interpreter_intStackSize; // L: 1184
						var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] - 1; // L: 1185
						if (var11 >= 0 && var11 <= 9) { // L: 1186
							SceneTilePaint.Widget_setKeyIgnoreHeld(var4, var11); // L: 1189
							return 1; // L: 1190
						} else {
							throw new RuntimeException(); // L: 1187
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) { // L: 1192
						var5 = 10; // L: 1193
						SceneTilePaint.Widget_setKeyIgnoreHeld(var4, var5); // L: 1194
						return 1; // L: 1195
					} else {
						return 2; // L: 1197
					}
				} else {
					byte[] var10 = null; // L: 1128
					var8 = null; // L: 1129
					if (var3) { // L: 1130
						Interpreter.Interpreter_intStackSize -= 10; // L: 1131

						for (var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + Interpreter.Interpreter_intStackSize] >= 0; var7 += 2) { // L: 1133 1134
						}

						if (var7 > 0) { // L: 1136
							var10 = new byte[var7 / 2]; // L: 1137
							var8 = new byte[var7 / 2]; // L: 1138

							for (var7 -= 2; var7 >= 0; var7 -= 2) { // L: 1139
								var10[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + Interpreter.Interpreter_intStackSize]; // L: 1140
								var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + Interpreter.Interpreter_intStackSize + 1]; // L: 1141
							}
						}
					} else {
						Interpreter.Interpreter_intStackSize -= 2; // L: 1146
						var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]}; // L: 1147
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]}; // L: 1148
					}

					var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] - 1; // L: 1150
					if (var7 >= 0 && var7 <= 9) { // L: 1151
						Login.Widget_setKey(var4, var7, var10, var8); // L: 1154
						return 1; // L: 1155
					} else {
						throw new RuntimeException(); // L: 1152
					}
				}
			}
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "-1982471719"
	)
	static int method168(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) { // L: 2621
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.cycle; // L: 2622
			return 1; // L: 2623
		} else {
			int var3;
			int var4;
			if (var0 == ScriptOpcodes.INV_GETOBJ) { // L: 2625
				Interpreter.Interpreter_intStackSize -= 2; // L: 2626
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2627
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2628
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapIcon_1.method5081(var3, var4); // L: 2629
				return 1; // L: 2630
			} else if (var0 == ScriptOpcodes.INV_GETNUM) { // L: 2632
				Interpreter.Interpreter_intStackSize -= 2; // L: 2633
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2634
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2635
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class215.ItemContainer_getCount(var3, var4); // L: 2636
				return 1; // L: 2637
			} else if (var0 == ScriptOpcodes.INV_TOTAL) { // L: 2639
				Interpreter.Interpreter_intStackSize -= 2; // L: 2640
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2641
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2642
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class316.method5952(var3, var4); // L: 2643
				return 1; // L: 2644
			} else if (var0 == ScriptOpcodes.INV_SIZE) { // L: 2646
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2647
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class381.getInvDefinition(var3).size; // L: 2648
				return 1; // L: 2649
			} else if (var0 == ScriptOpcodes.STAT) { // L: 2651
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2652
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.currentLevels[var3]; // L: 2653
				return 1; // L: 2654
			} else if (var0 == ScriptOpcodes.STAT_BASE) { // L: 2656
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2657
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.levels[var3]; // L: 2658
				return 1; // L: 2659
			} else if (var0 == ScriptOpcodes.STAT_XP) { // L: 2661
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2662
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.experience[var3]; // L: 2663
				return 1; // L: 2664
			} else {
				int var5;
				if (var0 == ScriptOpcodes.COORD) { // L: 2666
					var3 = Clock.Client_plane; // L: 2667
					var4 = class213.baseX * 64 + (Projectile.localPlayer.x >> 7); // L: 2668
					var5 = class101.baseY * 64 + (Projectile.localPlayer.y >> 7); // L: 2669
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var4 << 14) + var5 + (var3 << 28); // L: 2670
					return 1; // L: 2671
				} else if (var0 == ScriptOpcodes.COORDX) { // L: 2673
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2674
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 >> 14 & 16383; // L: 2675
					return 1; // L: 2676
				} else if (var0 == ScriptOpcodes.COORDZ) { // L: 2678
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2679
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 >> 28; // L: 2680
					return 1; // L: 2681
				} else if (var0 == ScriptOpcodes.COORDY) { // L: 2683
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2684
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 & 16383; // L: 2685
					return 1; // L: 2686
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) { // L: 2688
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.isMembersWorld ? 1 : 0; // L: 2689
					return 1; // L: 2690
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) { // L: 2692
					Interpreter.Interpreter_intStackSize -= 2; // L: 2693
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] + 32768; // L: 2694
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2695
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapIcon_1.method5081(var3, var4); // L: 2696
					return 1; // L: 2697
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) { // L: 2699
					Interpreter.Interpreter_intStackSize -= 2; // L: 2700
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] + 32768; // L: 2701
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2702
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class215.ItemContainer_getCount(var3, var4); // L: 2703
					return 1; // L: 2704
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) { // L: 2706
					Interpreter.Interpreter_intStackSize -= 2; // L: 2707
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] + 32768; // L: 2708
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2709
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class316.method5952(var3, var4); // L: 2710
					return 1; // L: 2711
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) { // L: 2713
					if (Client.staffModLevel >= 2) { // L: 2714
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.staffModLevel;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2715
					}

					return 1; // L: 2716
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) { // L: 2718
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.rebootTimer; // L: 2719
					return 1; // L: 2720
				} else if (var0 == ScriptOpcodes.MAP_WORLD) { // L: 2722
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.worldId; // L: 2723
					return 1; // L: 2724
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) { // L: 2726
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field679 / 100; // L: 2727
					return 1; // L: 2728
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) { // L: 2730
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.weight; // L: 2731
					return 1; // L: 2732
				} else if (var0 == ScriptOpcodes.PLAYERMOD) { // L: 2734
					if (Client.playerMod) { // L: 2735
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2736
					}

					return 1; // L: 2737
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) { // L: 2739
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.worldProperties; // L: 2740
					return 1; // L: 2741
				} else if (var0 == ScriptOpcodes.MOVECOORD) { // L: 2743
					Interpreter.Interpreter_intStackSize -= 4; // L: 2744
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2745
					var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2746
					var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 2747
					int var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 2748
					var3 += var4 << 14; // L: 2749
					var3 += var5 << 28; // L: 2750
					var3 += var6; // L: 2751
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3; // L: 2752
					return 1; // L: 2753
				} else if (var0 == 3326) { // L: 2755
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field519; // L: 2756
					return 1; // L: 2757
				} else if (var0 == 3327) { // L: 2759
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field520; // L: 2760
					return 1; // L: 2761
				} else if (var0 == 3331) { // L: 2763
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field679; // L: 2764
					return 1; // L: 2765
				} else {
					return 2; // L: 2767
				}
			}
		}
	}

	@ObfuscatedName("ld")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "350235403"
	)
	static final void method170(int var0, int var1, int var2, boolean var3) {
		if (Client.loadInterface(var0)) { // L: 11067
			class104.resizeInterface(class16.Widget_interfaceComponents[var0], -1, var1, var2, var3); // L: 11068
		}
	} // L: 11069
}
