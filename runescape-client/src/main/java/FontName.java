import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ry")
@Implements("FontName")
public class FontName {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lry;"
	)
	@Export("FontName_plain11")
	public static final FontName FontName_plain11;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lry;"
	)
	@Export("FontName_plain12")
	public static final FontName FontName_plain12;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lry;"
	)
	@Export("FontName_bold12")
	public static final FontName FontName_bold12;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lry;"
	)
	@Export("FontName_verdana11")
	public static final FontName FontName_verdana11;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lry;"
	)
	@Export("FontName_verdana13")
	public static final FontName FontName_verdana13;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lry;"
	)
	@Export("FontName_verdana15")
	public static final FontName FontName_verdana15;
	@ObfuscatedName("cc")
	static String field4790;
	@ObfuscatedName("av")
	@Export("name")
	String name;

	static {
		FontName_plain11 = new FontName("p11_full"); // L: 7
		FontName_plain12 = new FontName("p12_full"); // L: 8
		FontName_bold12 = new FontName("b12_full"); // L: 9
		FontName_verdana11 = new FontName("verdana_11pt_regular"); // L: 10
		FontName_verdana13 = new FontName("verdana_13pt_regular"); // L: 11
		FontName_verdana15 = new FontName("verdana_15pt_regular"); // L: 12
	}

	FontName(String var1) {
		this.name = var1; // L: 20
	} // L: 21

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(S)[Lmr;",
		garbageValue = "-27167"
	)
	static class326[] method8260() {
		return new class326[]{class326.field3762, class326.field3763}; // L: 35
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(S)[Lry;",
		garbageValue = "8828"
	)
	public static FontName[] method8254() {
		return new FontName[]{FontName_plain12, FontName_verdana13, FontName_bold12, FontName_verdana11, FontName_plain11, FontName_verdana15}; // L: 16
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Lcz;",
		garbageValue = "70"
	)
	@Export("worldListStart")
	static World worldListStart() {
		World.World_listCount = 0; // L: 237
		return class467.getNextWorldListWorld(); // L: 238
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1950859515"
	)
	@Export("Login_promptCredentials")
	static void Login_promptCredentials(boolean var0) {
		if (!class392.client.method1222() && !class392.client.isOtlTokenRequesterInitialized() && !class392.client.method1223()) { // L: 1236
			Login.Login_response1 = ""; // L: 1240
			Login.Login_response2 = "Enter your username/email & password."; // L: 1241
			Login.Login_response3 = ""; // L: 1242
			class14.method173(2); // L: 1243
			if (var0) { // L: 1244
				Login.Login_password = "";
			}

			if (Login.Login_username == null || Login.Login_username.length() <= 0) { // L: 1246
				if (WorldMapSectionType.clientPreferences.method2446() != null) { // L: 1247
					Login.Login_username = WorldMapSectionType.clientPreferences.method2446(); // L: 1248
					Client.Login_isUsernameRemembered = true; // L: 1249
				} else {
					Client.Login_isUsernameRemembered = false; // L: 1251
				}
			}

			ReflectionCheck.method678(); // L: 1253
		} else {
			class14.method173(10); // L: 1237
		}
	} // L: 1238 1254

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILcv;ZB)I",
		garbageValue = "103"
	)
	static int method8261(int var0, Script var1, boolean var2) {
		Widget var3 = WorldMapSection1.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1832
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) { // L: 1833
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapDecorationType.Widget_unpackTargetMask(ParamComposition.getWidgetFlags(var3)); // L: 1834
			return 1; // L: 1835
		} else if (var0 != ScriptOpcodes.IF_GETOP) { // L: 1837
			if (var0 == ScriptOpcodes.IF_GETOPBASE) { // L: 1844
				if (var3.dataText == null) { // L: 1845
					Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1846
				}

				return 1; // L: 1847
			} else {
				return 2; // L: 1849
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1838
			--var4; // L: 1839
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1840
				Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1841
			} else {
				Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1842
		}
	}

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "1033960923"
	)
	static void method8257(int var0, String var1) {
		int var2 = Players.Players_count; // L: 9518
		int[] var3 = Players.Players_indices; // L: 9519
		boolean var4 = false; // L: 9520
		Username var5 = new Username(var1, Occluder.loginType); // L: 9521

		for (int var6 = 0; var6 < var2; ++var6) { // L: 9522
			Player var7 = Client.players[var3[var6]]; // L: 9523
			if (var7 != null && var7 != BuddyRankComparator.localPlayer && var7.username != null && var7.username.equals(var5)) { // L: 9524
				PacketBufferNode var8;
				if (var0 == 1) { // L: 9525
					var8 = UserComparator9.getPacketBufferNode(ClientPacket.field3069, Client.packetWriter.isaacCipher); // L: 9527
					var8.packetBuffer.writeShort(var3[var6]); // L: 9528
					var8.packetBuffer.method8782(0); // L: 9529
					Client.packetWriter.addNode(var8); // L: 9530
				} else if (var0 == 4) { // L: 9532
					var8 = UserComparator9.getPacketBufferNode(ClientPacket.field3087, Client.packetWriter.isaacCipher); // L: 9534
					var8.packetBuffer.method8659(var3[var6]); // L: 9535
					var8.packetBuffer.method8620(0); // L: 9536
					Client.packetWriter.addNode(var8); // L: 9537
				} else if (var0 == 6) { // L: 9539
					var8 = UserComparator9.getPacketBufferNode(ClientPacket.field3086, Client.packetWriter.isaacCipher); // L: 9541
					var8.packetBuffer.writeByte(0); // L: 9542
					var8.packetBuffer.method8658(var3[var6]); // L: 9543
					Client.packetWriter.addNode(var8); // L: 9544
				} else if (var0 == 7) { // L: 9546
					var8 = UserComparator9.getPacketBufferNode(ClientPacket.field3129, Client.packetWriter.isaacCipher); // L: 9548
					var8.packetBuffer.writeShort(var3[var6]); // L: 9549
					var8.packetBuffer.writeByte(0); // L: 9550
					Client.packetWriter.addNode(var8); // L: 9551
				}

				var4 = true; // L: 9553
				break;
			}
		}

		if (!var4) { // L: 9557
			MusicPatchNode.addGameMessage(4, "", "Unable to find " + var1);
		}

	} // L: 9558
}
