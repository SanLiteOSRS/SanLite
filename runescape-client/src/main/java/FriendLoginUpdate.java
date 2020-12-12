import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ke")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
	@ObfuscatedName("qv")
	@ObfuscatedSignature(
		signature = "Ldp;"
	)
	@Export("pcmPlayer1")
	static PcmPlayer pcmPlayer1;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1005138925
	)
	public int field3680;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		signature = "Lki;"
	)
	@Export("username")
	public Username username;
	@ObfuscatedName("t")
	@Export("world")
	public short world;

	@ObfuscatedSignature(
		signature = "(Lki;I)V"
	)
	FriendLoginUpdate(Username var1, int var2) {
		this.field3680 = (int)(class298.currentTimeMillis() / 1000L);
		this.username = var1;
		this.world = (short)var2;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(IB)Z",
		garbageValue = "-1"
	)
	public static boolean method5290(int var0) {
		return var0 >= WorldMapDecorationType.field2761.id && var0 <= WorldMapDecorationType.field2747.id || var0 == WorldMapDecorationType.field2748.id;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(CI)Z",
		garbageValue = "-1404693123"
	)
	@Export("isAlphaNumeric")
	public static boolean isAlphaNumeric(char var0) {
		return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}
}
