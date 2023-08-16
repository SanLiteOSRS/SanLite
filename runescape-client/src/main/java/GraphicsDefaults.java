import java.lang.management.GarbageCollectorMXBean;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rr")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("bi")
	@Export("garbageCollector")
	static GarbageCollectorMXBean garbageCollector;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 680246901
	)
	public int field4715;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 698289967
	)
	public int field4705;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1868418019
	)
	public int field4708;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 901147751
	)
	public int field4707;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1343841741
	)
	public int field4713;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1631909573
	)
	public int field4704;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -628957467
	)
	public int field4710;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -771646685
	)
	public int field4711;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -214665131
	)
	public int field4712;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1437295059
	)
	public int field4709;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1483300641
	)
	public int field4714;

	public GraphicsDefaults() {
		this.field4715 = -1; // L: 7
		this.field4705 = -1; // L: 8
		this.field4708 = -1; // L: 9
		this.field4707 = -1; // L: 10
		this.field4713 = -1; // L: 11
		this.field4704 = -1; // L: 12
		this.field4710 = -1; // L: 13
		this.field4711 = -1; // L: 14
		this.field4712 = -1; // L: 15
		this.field4709 = -1; // L: 16
		this.field4714 = -1; // L: 17
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)V",
		garbageValue = "497895580"
	)
	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field4703.group); // L: 20
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
				this.field4715 = var3.method9198(); // L: 36
				this.field4705 = var3.method9198(); // L: 37
				this.field4708 = var3.method9198(); // L: 38
				this.field4707 = var3.method9198(); // L: 39
				this.field4713 = var3.method9198(); // L: 40
				this.field4704 = var3.method9198(); // L: 41
				this.field4710 = var3.method9198(); // L: 42
				this.field4711 = var3.method9198(); // L: 43
				this.field4712 = var3.method9198(); // L: 44
				this.field4709 = var3.method9198(); // L: 45
				this.field4714 = var3.method9198(); // L: 46
			}
		}
	}
}
