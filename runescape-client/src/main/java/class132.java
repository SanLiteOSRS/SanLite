import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ek")
public class class132 extends class128 {
	@ObfuscatedName("mt")
	@ObfuscatedGetter(
		intValue = -785479869
	)
	@Export("menuWidth")
	static int menuWidth;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1004156633
	)
	int field1566;
	@ObfuscatedName("h")
	byte field1562;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	final class131 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lei;)V"
	)
	class132(class131 var1) {
		this.this$0 = var1;
		this.field1566 = -1; // L: 128
	} // L: 131

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "-885940784"
	)
	void vmethod3087(Buffer var1) {
		this.field1566 = var1.readUnsignedShort(); // L: 134
		this.field1562 = var1.readByte(); // L: 135
	} // L: 136

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Leh;B)V",
		garbageValue = "0"
	)
	void vmethod3084(ClanSettings var1) {
		var1.method2910(this.field1566, this.field1562); // L: 139
	} // L: 140

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[SIII)V",
		garbageValue = "-1978534658"
	)
	@Export("sortItemsByName")
	public static void sortItemsByName(String[] var0, short[] var1, int var2, int var3) {
		if (var2 < var3) { // L: 9
			int var4 = (var3 + var2) / 2; // L: 10
			int var5 = var2; // L: 11
			String var6 = var0[var4]; // L: 12
			var0[var4] = var0[var3]; // L: 13
			var0[var3] = var6; // L: 14
			short var7 = var1[var4]; // L: 15
			var1[var4] = var1[var3]; // L: 16
			var1[var3] = var7; // L: 17

			for (int var8 = var2; var8 < var3; ++var8) { // L: 18
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) { // L: 19
					String var9 = var0[var8]; // L: 20
					var0[var8] = var0[var5]; // L: 21
					var0[var5] = var9; // L: 22
					short var10 = var1[var8]; // L: 23
					var1[var8] = var1[var5]; // L: 24
					var1[var5++] = var10; // L: 25
				}
			}

			var0[var3] = var0[var5]; // L: 29
			var0[var5] = var6; // L: 30
			var1[var3] = var1[var5]; // L: 31
			var1[var5] = var7; // L: 32
			sortItemsByName(var0, var1, var2, var5 - 1); // L: 33
			sortItemsByName(var0, var1, var5 + 1, var3); // L: 34
		}

	} // L: 36

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lpm;ILjava/lang/String;B)Ljava/lang/String;",
		garbageValue = "-101"
	)
	static String method2837(IterableNodeHashTable var0, int var1, String var2) {
		if (var0 == null) { // L: 41
			return var2;
		} else {
			ObjectNode var3 = (ObjectNode)var0.get((long)var1); // L: 42
			return var3 == null ? var2 : (String)var3.obj; // L: 43 44
		}
	}

	@ObfuscatedName("fh")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "-13470"
	)
	@Export("addNpcsToScene")
	static final void addNpcsToScene(boolean var0) {
		for (int var1 = 0; var1 < Client.npcCount; ++var1) { // L: 4860
			NPC var2 = Client.npcs[Client.npcIndices[var1]]; // L: 4861
			if (var2 != null && var2.isVisible() && var2.definition.isVisible == var0 && var2.definition.transformIsVisible()) { // L: 4862
				int var3 = var2.x >> 7; // L: 4863
				int var4 = var2.y >> 7; // L: 4864
				if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) { // L: 4865
					if (var2.field1190 * 1116880781 == 1 && (var2.x & 127) == 64 && (var2.y & 127) == 64) { // L: 4866
						if (Client.tileLastDrawnActor[var3][var4] == Client.viewportDrawCount) { // L: 4867
							continue;
						}

						Client.tileLastDrawnActor[var3][var4] = Client.viewportDrawCount; // L: 4868
					}

					long var5 = GroundObject.calculateTag(0, 0, 1, !var2.definition.isInteractable, Client.npcIndices[var1]); // L: 4870
					var2.playerCycle = Client.cycle; // L: 4871
					class12.scene.drawEntity(class268.Client_plane, var2.x, var2.y, ObjectComposition.getTileHeight(var2.field1190 * -1534074048 - 64 + var2.x, var2.field1190 * -1534074048 - 64 + var2.y, class268.Client_plane), var2.field1190 * -1534074048 - 64 + 60, var2, var2.rotation, var5, var2.isWalking); // L: 4872
				}
			}
		}

	} // L: 4876

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-12232330"
	)
	static final void method2838(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127); // L: 11645
		FriendsChatMember.clientPreferences.method2225(var0); // L: 11646
	} // L: 11647

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(Lqr;IB)V",
		garbageValue = "19"
	)
	static void method2828(Buffer var0, int var1) {
		Actor.method2148(var0.array, var1); // L: 12168
		if (JagexCache.JagexCache_randomDat != null) { // L: 12170
			try {
				JagexCache.JagexCache_randomDat.seek(0L); // L: 12172
				JagexCache.JagexCache_randomDat.write(var0.array, var1, 24); // L: 12173
			} catch (Exception var3) { // L: 12175
			}
		}

	} // L: 12178
}
