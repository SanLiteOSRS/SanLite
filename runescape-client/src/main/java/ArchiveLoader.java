import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cr")
@Implements("ArchiveLoader")
public class ArchiveLoader {
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("archive")
	final Archive archive;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 322604319
	)
	@Export("groupCount")
	final int groupCount;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1823567525
	)
	@Export("loadedCount")
	int loadedCount;

	@ObfuscatedSignature(
		descriptor = "(Llm;Ljava/lang/String;)V"
	)
	ArchiveLoader(Archive var1, String var2) {
		this.loadedCount = 0; // L: 9
		this.archive = var1; // L: 12
		this.groupCount = var1.getGroupCount(); // L: 13
	} // L: 14

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-100"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		this.loadedCount = 0; // L: 17

		for (int var1 = 0; var1 < this.groupCount; ++var1) { // L: 18
			if (!this.archive.method6484(var1) || this.archive.method6483(var1)) {
				++this.loadedCount; // L: 19
			}
		}

		return this.loadedCount >= this.groupCount; // L: 21
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)[Llu;",
		garbageValue = "1369192932"
	)
	@Export("PlayerType_values")
	public static PlayerType[] PlayerType_values() {
		return new PlayerType[]{PlayerType.field4175, PlayerType.field4169, PlayerType.PlayerType_jagexModerator, PlayerType.PlayerType_ironman, PlayerType.field4178, PlayerType.field4184, PlayerType.PlayerType_ultimateIronman, PlayerType.field4182, PlayerType.PlayerType_normal, PlayerType.PlayerType_playerModerator, PlayerType.PlayerType_hardcoreIronman, PlayerType.field4176, PlayerType.field4177, PlayerType.field4180, PlayerType.field4174, PlayerType.field4190, PlayerType.field4179}; // L: 30
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lru;B)I",
		garbageValue = "38"
	)
	static int method2283(PacketBuffer var0) {
		int var1 = var0.readBits(2); // L: 189
		int var2;
		if (var1 == 0) { // L: 191
			var2 = 0;
		} else if (var1 == 1) {
			var2 = var0.readBits(5); // L: 192
		} else if (var1 == 2) { // L: 193
			var2 = var0.readBits(8);
		} else {
			var2 = var0.readBits(11); // L: 194
		}

		return var2; // L: 195
	}
}
