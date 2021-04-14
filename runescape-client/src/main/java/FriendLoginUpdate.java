import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lk")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
	@ObfuscatedName("sl")
	@ObfuscatedSignature(
		signature = "Llp;"
	)
	@Export("masterDisk")
	static ArchiveDisk masterDisk;
	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		signature = "Lfn;"
	)
	@Export("textureProvider")
	static TextureProvider textureProvider;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1609482177
	)
	public int field3833;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Llw;"
	)
	@Export("username")
	public Username username;
	@ObfuscatedName("u")
	@Export("world")
	public short world;

	@ObfuscatedSignature(
		signature = "(Llw;I)V"
	)
	FriendLoginUpdate(Username var1, int var2) {
		this.field3833 = (int)(ObjectSound.currentTimeMillis() / 1000L);
		this.username = var1;
		this.world = (short)var2;
	}
}
