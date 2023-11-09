import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qg")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -2078402055
	)
	@Export("compass")
	public int compass;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1627062641
	)
	public int field4667;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 81858369
	)
	@Export("mapScenes")
	public int mapScenes;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1665506397
	)
	@Export("headIconsPk")
	public int headIconsPk;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -590792051
	)
	public int field4662;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1045610623
	)
	public int field4663;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1090321013
	)
	public int field4659;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 2045245727
	)
	public int field4665;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -685432839
	)
	public int field4666;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -830186267
	)
	public int field4668;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1909256731
	)
	public int field4658;

	public GraphicsDefaults() {
		this.compass = -1; // L: 7
		this.field4667 = -1; // L: 8
		this.mapScenes = -1; // L: 9
		this.headIconsPk = -1; // L: 10
		this.field4662 = -1; // L: 11
		this.field4663 = -1; // L: 12
		this.field4659 = -1; // L: 13
		this.field4665 = -1; // L: 14
		this.field4666 = -1; // L: 15
		this.field4668 = -1; // L: 16
		this.field4658 = -1; // L: 17
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lni;B)V",
		garbageValue = "92"
	)
	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field4656.group); // L: 20
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
				this.compass = var3.method9095(); // L: 36
				this.field4667 = var3.method9095(); // L: 37
				this.mapScenes = var3.method9095(); // L: 38
				this.headIconsPk = var3.method9095(); // L: 39
				this.field4662 = var3.method9095(); // L: 40
				this.field4663 = var3.method9095(); // L: 41
				this.field4659 = var3.method9095(); // L: 42
				this.field4665 = var3.method9095(); // L: 43
				this.field4666 = var3.method9095(); // L: 44
				this.field4668 = var3.method9095(); // L: 45
				this.field4658 = var3.method9095(); // L: 46
			}
		}
	}
}
