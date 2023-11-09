import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ea")
public class class140 extends class136 {
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "Lra;"
	)
	@Export("worldSelectRightSprite")
	static IndexedSprite worldSelectRightSprite;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 786830149
	)
	int field1676;
	@ObfuscatedName("e")
	byte field1677;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	final class139 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lem;)V"
	)
	class140(class139 var1) {
		this.this$0 = var1;
		this.field1676 = -1; // L: 128
	} // L: 131

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lqy;I)V",
		garbageValue = "1101327225"
	)
	void vmethod3349(Buffer var1) {
		this.field1676 = var1.readUnsignedShort(); // L: 134
		this.field1677 = var1.readByte(); // L: 135
	} // L: 136

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lep;I)V",
		garbageValue = "839088249"
	)
	void vmethod3350(ClanSettings var1) {
		var1.method3175(this.field1676, this.field1677); // L: 139
	} // L: 140

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1959996684"
	)
	static int method3105(int var0) {
		return KeyHandler.KeyHandler_keyCodes[var0]; // L: 99
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lly;I)V",
		garbageValue = "519981474"
	)
	public static void method3098(AbstractArchive var0) {
		class283.FloorUnderlayDefinition_archive = var0; // L: 21
	} // L: 22

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "76"
	)
	static int method3104(int var0, int var1, int var2) {
		return var0 << 28 | var1 << 14 | var2; // L: 34
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)Z",
		garbageValue = "-1039689208"
	)
	static final boolean method3095(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = ViewportMouse.ViewportMouse_y + var6; // L: 91
		if (var7 < var0 && var7 < var1 && var7 < var2) { // L: 92
			return false;
		} else {
			var7 = ViewportMouse.ViewportMouse_y - var6; // L: 93
			if (var7 > var0 && var7 > var1 && var7 > var2) { // L: 94
				return false;
			} else {
				var7 = ViewportMouse.ViewportMouse_x + var6; // L: 95
				if (var7 < var3 && var7 < var4 && var7 < var5) { // L: 96
					return false;
				} else {
					var7 = ViewportMouse.ViewportMouse_x - var6; // L: 97
					return var7 <= var3 || var7 <= var4 || var7 <= var5; // L: 98
				}
			}
		}
	}

	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1425199157"
	)
	static void method3102(int var0) {
		if (var0 != Client.gameState) { // L: 1206
			if (Client.gameState == 30) { // L: 1207
				Client.field572.method4068(); // L: 1208
			}

			if (Client.gameState == 0) { // L: 1210
				BuddyRankComparator.client.method527();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) { // L: 1211
				class37.method709(0); // L: 1212
				Client.field648 = 0; // L: 1213
				Client.field541 = 0; // L: 1214
				Client.timer.method7331(var0); // L: 1215
				if (var0 != 20) { // L: 1216
					InterfaceParent.method2251(false);
				}
			}

			if (var0 != 20 && var0 != 40 && class14.field83 != null) { // L: 1218 1219
				class14.field83.close(); // L: 1220
				class14.field83 = null; // L: 1221
			}

			if (Client.gameState == 25) { // L: 1224
				Client.field658 = 0; // L: 1225
				Client.field601 = 0; // L: 1226
				Client.field755 = 1; // L: 1227
				Client.field786 = 0; // L: 1228
				Client.field574 = 1; // L: 1229
			}

			if (var0 != 5 && var0 != 10) { // L: 1231
				if (var0 == 20) { // L: 1239
					int var3 = Client.gameState == 11 ? 4 : 0; // L: 1240
					UserComparator5.method2830(ClanChannelMember.field1666, ClientPreferences.archive8, false, var3); // L: 1241
				} else if (var0 == 11) { // L: 1243
					UserComparator5.method2830(ClanChannelMember.field1666, ClientPreferences.archive8, false, 4); // L: 1244
				} else if (var0 == 50) { // L: 1246
					TaskHandler.setLoginResponseString("", "Updating date of birth...", ""); // L: 1247
					UserComparator5.method2830(ClanChannelMember.field1666, ClientPreferences.archive8, false, 7); // L: 1248
				} else {
					FontName.method8199(); // L: 1250
				}
			} else {
				boolean var1 = StructComposition.clientPreferences.method2424() >= Client.field511; // L: 1234
				int var2 = var1 ? 0 : 12; // L: 1236
				UserComparator5.method2830(ClanChannelMember.field1666, ClientPreferences.archive8, true, var2); // L: 1237
			}

			Client.gameState = var0; // L: 1251
		}
	} // L: 1252
}
