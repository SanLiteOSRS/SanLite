import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("on")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 331911785
	)
	@Export("compass")
	public int compass;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 14540353
	)
	public int field4588;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1948624063
	)
	@Export("mapScenes")
	public int mapScenes;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 874836143
	)
	@Export("headIconsPk")
	public int headIconsPk;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1669025027
	)
	public int field4585;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1632658967
	)
	public int field4587;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -795545201
	)
	public int field4591;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -358156643
	)
	public int field4589;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1086090773
	)
	public int field4590;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -285314151
	)
	public int field4586;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1259236517
	)
	public int field4592;

	public GraphicsDefaults() {
		this.compass = -1; // L: 7
		this.field4588 = -1; // L: 8
		this.mapScenes = -1; // L: 9
		this.headIconsPk = -1; // L: 10
		this.field4585 = -1; // L: 11
		this.field4587 = -1; // L: 12
		this.field4591 = -1; // L: 13
		this.field4589 = -1; // L: 14
		this.field4590 = -1; // L: 15
		this.field4586 = -1; // L: 16
		this.field4592 = -1; // L: 17
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lly;B)V",
		garbageValue = "8"
	)
	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field4578.group); // L: 20
		Buffer var3 = new Buffer(var2); // L: 21

		while (true) {
			int var4 = var3.readUnsignedByte(); // L: 23
			if (var4 == 0) { // L: 24
				return; // L: 51
			}

			switch(var4) { // L: 25
			case 1:
				var3.readMedium(); // L: 43
				break;
			case 2:
				this.compass = var3.method8568(); // L: 28
				this.field4588 = var3.method8568(); // L: 29
				this.mapScenes = var3.method8568(); // L: 30
				this.headIconsPk = var3.method8568(); // L: 31
				this.field4585 = var3.method8568(); // L: 32
				this.field4587 = var3.method8568(); // L: 33
				this.field4591 = var3.method8568(); // L: 34
				this.field4589 = var3.method8568(); // L: 35
				this.field4590 = var3.method8568(); // L: 36
				this.field4586 = var3.method8568(); // L: 37
				this.field4592 = var3.method8568(); // L: 38
			}
		}
	}
}
