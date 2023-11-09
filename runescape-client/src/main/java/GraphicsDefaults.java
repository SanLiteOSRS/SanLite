import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pw")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -2082911727
	)
	@Export("compass")
	public int compass;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1391423821
	)
	public int field4575;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -2081671237
	)
	@Export("mapScenes")
	public int mapScenes;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1543211827
	)
	@Export("headIconsPk")
	public int headIconsPk;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1634702607
	)
	public int field4572;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -437135967
	)
	public int field4576;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1374101135
	)
	public int field4577;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 637341399
	)
	public int field4578;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -827595631
	)
	public int field4573;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1043626131
	)
	public int field4580;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 2077238163
	)
	public int field4581;

	public GraphicsDefaults() {
		this.compass = -1; // L: 7
		this.field4575 = -1; // L: 8
		this.mapScenes = -1; // L: 9
		this.headIconsPk = -1; // L: 10
		this.field4572 = -1; // L: 11
		this.field4576 = -1; // L: 12
		this.field4577 = -1; // L: 13
		this.field4578 = -1; // L: 14
		this.field4573 = -1; // L: 15
		this.field4580 = -1; // L: 16
		this.field4581 = -1; // L: 17
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lne;I)V",
		garbageValue = "1692757151"
	)
	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field4569.group); // L: 20
		Buffer var3 = new Buffer(var2); // L: 21

		while (true) {
			int var4 = var3.readUnsignedByte(); // L: 23
			if (var4 == 0) { // L: 24
				return; // L: 51
			}

			switch(var4) { // L: 25
			case 1:
				var3.readMedium(); // L: 46
				break;
			case 2:
				this.compass = var3.method8638(); // L: 31
				this.field4575 = var3.method8638(); // L: 32
				this.mapScenes = var3.method8638(); // L: 33
				this.headIconsPk = var3.method8638(); // L: 34
				this.field4572 = var3.method8638(); // L: 35
				this.field4576 = var3.method8638(); // L: 36
				this.field4577 = var3.method8638(); // L: 37
				this.field4578 = var3.method8638(); // L: 38
				this.field4573 = var3.method8638(); // L: 39
				this.field4580 = var3.method8638(); // L: 40
				this.field4581 = var3.method8638(); // L: 41
			}
		}
	}
}
