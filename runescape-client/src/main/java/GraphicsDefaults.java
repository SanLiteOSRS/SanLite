import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ms")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -739361475
	)
	@Export("compass")
	public int compass;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1809731737
	)
	public int field4008;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -300526741
	)
	@Export("mapScenes")
	public int mapScenes;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -992628361
	)
	@Export("headIconsPk")
	public int headIconsPk;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 73683081
	)
	public int field4011;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 956702641
	)
	public int field4012;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1020186077
	)
	public int field4013;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 952149899
	)
	public int field4014;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1217039673
	)
	public int field4010;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1826235811
	)
	public int field4018;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1004681241
	)
	public int field4016;

	public GraphicsDefaults() {
		this.compass = -1;
		this.field4008 = -1;
		this.mapScenes = -1;
		this.headIconsPk = -1;
		this.field4011 = -1;
		this.field4012 = -1;
		this.field4013 = -1;
		this.field4014 = -1;
		this.field4010 = -1;
		this.field4018 = -1;
		this.field4016 = -1;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lko;I)V",
		garbageValue = "-1881093126"
	)
	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field4002.group);
		Buffer var3 = new Buffer(var2);

		while (true) {
			int var4 = var3.readUnsignedByte();
			if (var4 == 0) {
				return;
			}

			switch(var4) {
			case 1:
				var3.readMedium();
				break;
			case 2:
				this.compass = var3.method6946();
				this.field4008 = var3.method6946();
				this.mapScenes = var3.method6946();
				this.headIconsPk = var3.method6946();
				this.field4011 = var3.method6946();
				this.field4012 = var3.method6946();
				this.field4013 = var3.method6946();
				this.field4014 = var3.method6946();
				this.field4010 = var3.method6946();
				this.field4018 = var3.method6946();
				this.field4016 = var3.method6946();
			}
		}
	}
}
