import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oy")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -934585325
	)
	public int field4520;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lrp;"
	)
	@Export("username")
	public Username username;
	@ObfuscatedName("v")
	@Export("world")
	public short world;

	@ObfuscatedSignature(
		descriptor = "(Lrp;I)V"
	)
	FriendLoginUpdate(Username var1, int var2) {
		this.field4520 = (int)(Message.method1197() / 1000L); // L: 109
		this.username = var1; // L: 110
		this.world = (short)var2; // L: 111
	} // L: 112
}
