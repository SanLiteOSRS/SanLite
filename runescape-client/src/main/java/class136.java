import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eq")
public class class136 extends class144 {
	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "Lpb;"
	)
	@Export("WorldMapElement_fonts")
	static Fonts WorldMapElement_fonts;
	@ObfuscatedName("nx")
	@ObfuscatedSignature(
		descriptor = "Lbe;"
	)
	@Export("tempMenuAction")
	static MenuAction tempMenuAction;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1569891361
	)
	int field1598;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Let;"
	)
	final class145 this$0;

	@ObfuscatedSignature(
		descriptor = "(Let;)V"
	)
	class136(class145 var1) {
		this.this$0 = var1;
		this.field1598 = -1; // L: 82
	} // L: 84

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lqw;I)V",
		garbageValue = "-1897546377"
	)
	void vmethod3146(Buffer var1) {
		this.field1598 = var1.readUnsignedShort(); // L: 87
		var1.readUnsignedByte(); // L: 88
		if (var1.readUnsignedByte() != 255) { // L: 89
			--var1.offset; // L: 90
			var1.readLong(); // L: 91
		}

	} // L: 93

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ley;I)V",
		garbageValue = "-406744366"
	)
	void vmethod3145(ClanChannel var1) {
		var1.removeMember(this.field1598); // L: 96
	} // L: 97

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1572525862"
	)
	public static boolean method2955(int var0) {
		return (var0 >> 21 & 1) != 0; // L: 21
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIII[Lgr;I)V",
		garbageValue = "1308241235"
	)
	static final void method2954(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, CollisionMap[] var8) {
		int var10;
		for (int var9 = 0; var9 < 8; ++var9) { // L: 111
			for (var10 = 0; var10 < 8; ++var10) { // L: 112
				if (var9 + var2 > 0 && var9 + var2 < 103 && var3 + var10 > 0 && var3 + var10 < 103) { // L: 113
					int[] var10000 = var8[var1].flags[var9 + var2];
					var10000[var3 + var10] &= -16777217;
				}
			}
		}

		Buffer var21 = new Buffer(var0); // L: 116

		for (var10 = 0; var10 < 4; ++var10) { // L: 117
			for (int var11 = 0; var11 < 64; ++var11) { // L: 118
				for (int var12 = 0; var12 < 64; ++var12) { // L: 119
					if (var10 == var4 && var11 >= var5 && var11 < var5 + 8 && var12 >= var6 && var12 < var6 + 8) { // L: 120
						int var15 = var2 + class286.method5524(var11 & 7, var12 & 7, var7); // L: 123
						int var18 = var11 & 7; // L: 126
						int var19 = var12 & 7; // L: 127
						int var20 = var7 & 3; // L: 130
						int var17;
						if (var20 == 0) { // L: 131
							var17 = var19; // L: 132
						} else if (var20 == 1) { // L: 135
							var17 = 7 - var18; // L: 136
						} else if (var20 == 2) { // L: 139
							var17 = 7 - var19; // L: 140
						} else {
							var17 = var18; // L: 143
						}

						class174.loadTerrain(var21, var1, var15, var3 + var17, 0, 0, var7); // L: 145
					} else {
						class174.loadTerrain(var21, 0, -1, -1, 0, 0, 0); // L: 147
					}
				}
			}
		}

	} // L: 151

	@ObfuscatedName("fi")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "237156850"
	)
	@Export("forceDisconnect")
	static final void forceDisconnect(int var0) {
		class433.logOut(); // L: 2958
		switch(var0) { // L: 2959
		case 1:
			MenuAction.method1933(); // L: 2967
			break;
		case 2:
			SoundSystem.method768(); // L: 2962
		}

	} // L: 2971

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "86287097"
	)
	static final void method2949(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127); // L: 11832
		class260.clientPreferences.method2332(var0); // L: 11833
	} // L: 11834
}
