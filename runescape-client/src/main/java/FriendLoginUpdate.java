import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lw")
@Implements("FriendLoginUpdate")
public class FriendLoginUpdate extends Link {
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1837653609
	)
	static int field3943;
	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("fontPlain11")
	static Font fontPlain11;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1663283777
	)
	public int field3945;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lpb;"
	)
	@Export("username")
	public Username username;
	@ObfuscatedName("s")
	@Export("world")
	public short world;

	@ObfuscatedSignature(
		descriptor = "(Lpb;I)V"
	)
	FriendLoginUpdate(Username var1, int var2) {
		this.field3945 = (int)(class111.method2516() / 1000L);
		this.username = var1;
		this.world = (short)var2;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-106"
	)
	static void method6058() {
		for (ObjectSound var0 = (ObjectSound)ObjectSound.objectSounds.last(); var0 != null; var0 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var0.obj != null) {
				var0.set();
			}
		}

	}
}
