import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nz")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1135268835
	)
	@Export("compass")
	public int compass;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -2134294425
	)
	public int field4366;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 347744275
	)
	@Export("mapScenes")
	public int mapScenes;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 1554196661
	)
	@Export("headIconsPk")
	public int headIconsPk;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 557907727
	)
	public int field4370;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1928213369
	)
	public int field4369;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1582876983
	)
	public int field4371;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 823602837
	)
	public int field4373;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 2013848631
	)
	public int field4374;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -431849749
	)
	public int field4375;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1535977443
	)
	public int field4376;

	public GraphicsDefaults() {
		this.compass = -1; // L: 7
		this.field4366 = -1; // L: 8
		this.mapScenes = -1; // L: 9
		this.headIconsPk = -1; // L: 10
		this.field4370 = -1; // L: 11
		this.field4369 = -1; // L: 12
		this.field4371 = -1; // L: 13
		this.field4373 = -1; // L: 14
		this.field4374 = -1; // L: 15
		this.field4375 = -1; // L: 16
		this.field4376 = -1; // L: 17
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lls;I)V",
		garbageValue = "-1316765164"
	)
	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field4365.group); // L: 20
		Buffer var3 = new Buffer(var2); // L: 21

		while (true) {
			int var4 = var3.readUnsignedByte(); // L: 23
			if (var4 == 0) { // L: 24
				return; // L: 51
			}

			switch(var4) { // L: 25
			case 1:
				var3.readMedium(); // L: 28
				break;
			case 2:
				this.compass = var3.method7652(); // L: 33
				this.field4366 = var3.method7652(); // L: 34
				this.mapScenes = var3.method7652(); // L: 35
				this.headIconsPk = var3.method7652(); // L: 36
				this.field4370 = var3.method7652(); // L: 37
				this.field4369 = var3.method7652(); // L: 38
				this.field4371 = var3.method7652(); // L: 39
				this.field4373 = var3.method7652(); // L: 40
				this.field4374 = var3.method7652(); // L: 41
				this.field4375 = var3.method7652(); // L: 42
				this.field4376 = var3.method7652(); // L: 43
			}
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IS)J",
		garbageValue = "12937"
	)
	public static long method6842(int var0) {
		return ViewportMouse.ViewportMouse_entityTags[var0]; // L: 52
	}
}
