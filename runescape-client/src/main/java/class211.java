import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("is")
public enum class211 implements class352 {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lis;"
	)
	field2336((byte)-1),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lis;"
	)
	field2333((byte)0),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lis;"
	)
	field2332((byte)1),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lis;"
	)
	field2335((byte)2);

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "Lne;"
	)
	@Export("Widget_modelsArchive")
	static AbstractArchive Widget_modelsArchive;
	@ObfuscatedName("hn")
	static String field2334;
	@ObfuscatedName("an")
	public byte field2338;

	class211(byte var3) {
		this.field2338 = var3; // L: 18
	} // L: 19

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1409646049"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field2338; // L: 23
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)[Lmn;",
		garbageValue = "2085906620"
	)
	@Export("PlayerType_values")
	public static PlayerType[] PlayerType_values() {
		return new PlayerType[]{PlayerType.field4140, PlayerType.field4138, PlayerType.field4136, PlayerType.PlayerType_playerModerator, PlayerType.field4141, PlayerType.PlayerType_ultimateIronman, PlayerType.field4129, PlayerType.PlayerType_ironman, PlayerType.field4144, PlayerType.PlayerType_normal, PlayerType.field4143, PlayerType.field4142, PlayerType.PlayerType_hardcoreIronman, PlayerType.field4137, PlayerType.PlayerType_jagexModerator, PlayerType.field4146, PlayerType.field4139}; // L: 30
	}

	@ObfuscatedName("an")
	public static int method4150(long var0) {
		return (int)(var0 >>> 7 & 127L); // L: 65
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "45"
	)
	public static int method4151(int var0) {
		if (var0 > 0) { // L: 219
			return 1;
		} else {
			return var0 < 0 ? -1 : 0; // L: 220 221
		}
	}

	@ObfuscatedName("mu")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1285650077"
	)
	static void method4147(int var0) {
		for (IntegerNode var1 = (IntegerNode)Client.widgetFlags.first(); var1 != null; var1 = (IntegerNode)Client.widgetFlags.next()) { // L: 12062
			if ((long)var0 == (var1.key >> 48 & 65535L)) { // L: 12063
				var1.remove(); // L: 12064
			}
		}

	} // L: 12067
}
