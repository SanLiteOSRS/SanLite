import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("or")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 1143172387
	)
	@Export("compass")
	public int compass;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -864189905
	)
	public int field4536;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 35824071
	)
	@Export("mapScenes")
	public int mapScenes;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 2039169195
	)
	@Export("headIconsPk")
	public int headIconsPk;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -2112358395
	)
	public int field4538;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1102270247
	)
	public int field4539;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1708342261
	)
	public int field4540;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1036565301
	)
	public int field4541;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 539674131
	)
	public int field4542;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 178036597
	)
	public int field4543;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1363465089
	)
	public int field4544;

	public GraphicsDefaults() {
		this.compass = -1; // L: 7
		this.field4536 = -1; // L: 8
		this.mapScenes = -1; // L: 9
		this.headIconsPk = -1; // L: 10
		this.field4538 = -1; // L: 11
		this.field4539 = -1; // L: 12
		this.field4540 = -1; // L: 13
		this.field4541 = -1; // L: 14
		this.field4542 = -1; // L: 15
		this.field4543 = -1; // L: 16
		this.field4544 = -1; // L: 17
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Llg;I)V",
		garbageValue = "-2108438411"
	)
	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field4533.group); // L: 20
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
				this.compass = var3.method8422(); // L: 33
				this.field4536 = var3.method8422(); // L: 34
				this.mapScenes = var3.method8422(); // L: 35
				this.headIconsPk = var3.method8422(); // L: 36
				this.field4538 = var3.method8422(); // L: 37
				this.field4539 = var3.method8422(); // L: 38
				this.field4540 = var3.method8422(); // L: 39
				this.field4541 = var3.method8422(); // L: 40
				this.field4542 = var3.method8422(); // L: 41
				this.field4543 = var3.method8422(); // L: 42
				this.field4544 = var3.method8422(); // L: 43
			}
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "70"
	)
	static void method7570(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 72
		if (var1 != null) {
			var1.remove(); // L: 74
		}
	} // L: 73 75
}
