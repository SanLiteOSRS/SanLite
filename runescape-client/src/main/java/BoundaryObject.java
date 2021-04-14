import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gs")
@Implements("BoundaryObject")
public final class BoundaryObject {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1487980993
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -2109183059
	)
	@Export("x")
	int x;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1229979648
	)
	@Export("y")
	int y;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1907463847
	)
	@Export("orientationA")
	int orientationA;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 334995477
	)
	@Export("orientationB")
	int orientationB;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "Lfm;"
	)
	@Export("entity1")
	public Renderable entity1;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Lfm;"
	)
	@Export("entity2")
	public Renderable entity2;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		longValue = 4648548109869818167L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 512629061
	)
	@Export("flags")
	int flags;

	BoundaryObject() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "77"
	)
	@Export("playPcmPlayers")
	static final void playPcmPlayers() {
		if (class43.pcmPlayer1 != null) {
			class43.pcmPlayer1.run();
		}

		if (ApproximateRouteStrategy.pcmPlayer0 != null) {
			ApproximateRouteStrategy.pcmPlayer0.run();
		}

	}

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		signature = "(II)Z",
		garbageValue = "-230387884"
	)
	static boolean method3787(int var0) {
		for (int var1 = 0; var1 < Client.field827; ++var1) {
			if (Client.field792[var1] == var0) {
				return true;
			}
		}

		return false;
	}
}
