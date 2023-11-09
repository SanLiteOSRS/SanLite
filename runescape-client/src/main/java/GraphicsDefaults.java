import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ru")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1457757201
	)
	public int field4715;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1554565485
	)
	public int field4708;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -335893661
	)
	public int field4709;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1547272309
	)
	public int field4710;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1799258585
	)
	public int field4712;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 173361429
	)
	public int field4707;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 898862615
	)
	public int field4713;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1005510493
	)
	public int field4714;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1560055347
	)
	public int field4711;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1184444635
	)
	public int field4716;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1334760175
	)
	public int field4717;

	public GraphicsDefaults() {
		this.field4715 = -1; // L: 7
		this.field4708 = -1; // L: 8
		this.field4709 = -1; // L: 9
		this.field4710 = -1; // L: 10
		this.field4712 = -1; // L: 11
		this.field4707 = -1; // L: 12
		this.field4713 = -1; // L: 13
		this.field4714 = -1; // L: 14
		this.field4711 = -1; // L: 15
		this.field4716 = -1; // L: 16
		this.field4717 = -1; // L: 17
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "-1842345605"
	)
	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field4706.group); // L: 20
		Buffer var3 = new Buffer(var2); // L: 21

		while (true) {
			int var4 = var3.readUnsignedByte(); // L: 23
			if (var4 == 0) { // L: 24
				return; // L: 51
			}

			switch(var4) { // L: 25
			case 1:
				var3.readMedium(); // L: 31
				break; // L: 32
			case 2:
				this.field4715 = var3.method9152(); // L: 36
				this.field4708 = var3.method9152(); // L: 37
				this.field4709 = var3.method9152(); // L: 38
				this.field4710 = var3.method9152(); // L: 39
				this.field4712 = var3.method9152(); // L: 40
				this.field4707 = var3.method9152(); // L: 41
				this.field4713 = var3.method9152(); // L: 42
				this.field4714 = var3.method9152(); // L: 43
				this.field4711 = var3.method9152(); // L: 44
				this.field4716 = var3.method9152(); // L: 45
				this.field4717 = var3.method9152(); // L: 46
			}
		}
	}
}
