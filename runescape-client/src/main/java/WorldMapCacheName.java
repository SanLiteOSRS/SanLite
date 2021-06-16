import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gt")
@Implements("WorldMapCacheName")
public class WorldMapCacheName {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final WorldMapCacheName field2131;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final WorldMapCacheName field2134;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final WorldMapCacheName field2130;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	static final WorldMapCacheName field2136;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	public static final WorldMapCacheName field2129;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("options_buttons_2Sprite")
	static IndexedSprite options_buttons_2Sprite;
	@ObfuscatedName("nw")
	@ObfuscatedSignature(
		descriptor = "[Liv;"
	)
	static Widget[] field2135;
	@ObfuscatedName("o")
	@Export("name")
	public final String name;

	static {
		field2131 = new WorldMapCacheName("details");
		field2134 = new WorldMapCacheName("compositemap");
		field2130 = new WorldMapCacheName("compositetexture");
		field2136 = new WorldMapCacheName("area");
		field2129 = new WorldMapCacheName("labels");
	}

	WorldMapCacheName(String var1) {
		this.name = var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lix;I)V",
		garbageValue = "-715270644"
	)
	public static void method3789(Huffman var0) {
		class250.huffman = var0;
	}

	@ObfuscatedName("kb")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "3274"
	)
	static final void method3788() {
		for (int var0 = 0; var0 < Players.Players_count; ++var0) {
			Player var1 = Client.players[Players.Players_indices[var0]];
			var1.clearIsInFriendsChat();
		}

	}
}
