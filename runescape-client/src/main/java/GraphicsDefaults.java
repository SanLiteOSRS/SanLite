import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("or")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("bw")
	static String field4623;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1866379087
	)
	@Export("compass")
	public int compass;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1782755257
	)
	public int field4621;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -698628845
	)
	@Export("mapScenes")
	public int mapScenes;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 748632551
	)
	@Export("headIconsPk")
	public int headIconsPk;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -524027179
	)
	public int field4616;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -956565367
	)
	public int field4617;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1683050753
	)
	public int field4620;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1291720385
	)
	public int field4619;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1754340917
	)
	public int field4622;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 369714537
	)
	public int field4613;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1394168669
	)
	public int field4624;

	public GraphicsDefaults() {
		this.compass = -1; // L: 7
		this.field4621 = -1; // L: 8
		this.mapScenes = -1; // L: 9
		this.headIconsPk = -1; // L: 10
		this.field4616 = -1; // L: 11
		this.field4617 = -1; // L: 12
		this.field4620 = -1; // L: 13
		this.field4619 = -1; // L: 14
		this.field4622 = -1; // L: 15
		this.field4613 = -1; // L: 16
		this.field4624 = -1; // L: 17
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lln;B)V",
		garbageValue = "16"
	)
	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field4610.group); // L: 20
		Buffer var3 = new Buffer(var2); // L: 21

		while (true) {
			int var4 = var3.readUnsignedByte(); // L: 23
			if (var4 == 0) { // L: 24
				return; // L: 51
			}

			switch(var4) { // L: 25
			case 1:
				var3.readMedium();
				break; // L: 43
			case 2:
				this.compass = var3.method8709(); // L: 28
				this.field4621 = var3.method8709(); // L: 29
				this.mapScenes = var3.method8709(); // L: 30
				this.headIconsPk = var3.method8709(); // L: 31
				this.field4616 = var3.method8709(); // L: 32
				this.field4617 = var3.method8709(); // L: 33
				this.field4620 = var3.method8709(); // L: 34
				this.field4619 = var3.method8709(); // L: 35
				this.field4622 = var3.method8709(); // L: 36
				this.field4613 = var3.method8709(); // L: 37
				this.field4624 = var3.method8709(); // L: 38
			}
		}
	}
}
