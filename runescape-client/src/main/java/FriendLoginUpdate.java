import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kb")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1710257939
	)
	public int field3664;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "Lku;"
	)
	@Export("username")
	public Username username;
	@ObfuscatedName("i")
	@Export("world")
	public short world;

	@ObfuscatedSignature(
		signature = "(Lku;I)V"
	)
	FriendLoginUpdate(Username var1, int var2) {
		this.field3664 = (int)(PacketWriter.currentTimeMillis() / 1000L);
		this.username = var1;
		this.world = (short)var2;
	}
}
