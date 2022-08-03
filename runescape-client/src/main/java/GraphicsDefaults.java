import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nr")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -574375465
	)
	@Export("compass")
	public int compass;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1982271929
	)
	public int field4378;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 366582553
	)
	@Export("mapScenes")
	public int mapScenes;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1097573955
	)
	@Export("headIconsPk")
	public int headIconsPk;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -77984305
	)
	public int field4381;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -990943999
	)
	public int field4388;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -504988893
	)
	public int field4377;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -783092915
	)
	public int field4384;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1562039901
	)
	public int field4383;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1813988143
	)
	public int field4386;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1185678015
	)
	public int field4385;

	public GraphicsDefaults() {
		this.compass = -1; // L: 7
		this.field4378 = -1; // L: 8
		this.mapScenes = -1; // L: 9
		this.headIconsPk = -1; // L: 10
		this.field4381 = -1; // L: 11
		this.field4388 = -1; // L: 12
		this.field4377 = -1; // L: 13
		this.field4384 = -1; // L: 14
		this.field4383 = -1; // L: 15
		this.field4386 = -1; // L: 16
		this.field4385 = -1; // L: 17
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Llc;I)V",
		garbageValue = "1550968028"
	)
	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field4373.group); // L: 20
		Buffer var3 = new Buffer(var2); // L: 21

		while (true) {
			int var4 = var3.readUnsignedByte(); // L: 23
			if (var4 == 0) { // L: 24
				return; // L: 51
			}

			switch(var4) { // L: 25
			case 1:
				var3.readMedium();
				break; // L: 46
			case 2:
				this.compass = var3.method7752(); // L: 28
				this.field4378 = var3.method7752(); // L: 29
				this.mapScenes = var3.method7752(); // L: 30
				this.headIconsPk = var3.method7752(); // L: 31
				this.field4381 = var3.method7752(); // L: 32
				this.field4388 = var3.method7752(); // L: 33
				this.field4377 = var3.method7752(); // L: 34
				this.field4384 = var3.method7752(); // L: 35
				this.field4383 = var3.method7752(); // L: 36
				this.field4386 = var3.method7752(); // L: 37
				this.field4385 = var3.method7752(); // L: 38
			}
		}
	}
}
