import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("io")
public class class249 {
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(I)[Ljx;",
		garbageValue = "1095870927"
	)
	@Export("PlayerType_values")
	public static PlayerType[] PlayerType_values() {
		return new PlayerType[]{PlayerType.PlayerType_jagexModerator, PlayerType.PlayerType_ultimateIronman, PlayerType.PlayerType_hardcoreIronman, PlayerType.PlayerType_normal, PlayerType.field3551, PlayerType.PlayerType_playerModerator, PlayerType.PlayerType_ironman};
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILci;ZB)I",
		garbageValue = "59"
	)
	static int method4732(int var0, Script var1, boolean var2) {
		if (var0 == 6900) {
			++class13.Interpreter_stringStackSize;
			return 1;
		} else if (var0 == 6950) {
			++WorldMapCacheName.Interpreter_intStackSize;
			return 1;
		} else {
			return 2;
		}
	}
}
