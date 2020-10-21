import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kk")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
	@ObfuscatedName("u")
	public static short[] field3671;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1131935431
	)
	public int field3670;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "Lkm;"
	)
	@Export("username")
	public Username username;
	@ObfuscatedName("z")
	@Export("world")
	public short world;

	@ObfuscatedSignature(
		signature = "(Lkm;I)V"
	)
	FriendLoginUpdate(Username var1, int var2) {
		this.field3670 = (int)(Nameable.currentTimeMillis() / 1000L);
		this.username = var1;
		this.world = (short)var2;
	}
}
