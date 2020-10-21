import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kl")
@Implements("Buddy")
public class Buddy extends Nameable {
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 11106869
	)
	@Export("world")
	public int world;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -152395721
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -2046861125
	)
	@Export("rank")
	public int rank;

	Buddy() {
		this.world = -1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "-2040582240"
	)
	@Export("set")
	void set(int var1, int var2) {
		this.world = var1;
		this.int2 = var2;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-1227798999"
	)
	@Export("getWorld")
	public int getWorld() {
		return this.world;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "-17715809"
	)
	@Export("hasWorld")
	public boolean hasWorld() {
		return this.world > 0;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(S)I",
		garbageValue = "3913"
	)
	static int method5322() {
		return ++Messages.Messages_count - 1;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(IIIB)Llc;",
		garbageValue = "-95"
	)
	static SpritePixels method5321(int var0, int var1, int var2) {
		return (SpritePixels)WorldMapRegion.WorldMapRegion_cachedSprites.get(class8.method117(var0, var1, var2));
	}
}
