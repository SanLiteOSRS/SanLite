import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lb")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1984805427
	)
	@Export("compass")
	public int compass;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1191054589
	)
	public int field3892;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 269750755
	)
	@Export("mapScenes")
	public int mapScenes;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -109749595
	)
	@Export("headIconsPk")
	public int headIconsPk;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1879938001
	)
	public int field3903;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 616409549
	)
	public int field3902;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 854150451
	)
	public int field3897;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -901027001
	)
	public int field3899;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 2096329335
	)
	public int field3900;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1403628021
	)
	public int field3901;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 1431986937
	)
	public int field3896;

	public GraphicsDefaults() {
		this.compass = -1;
		this.field3892 = -1;
		this.mapScenes = -1;
		this.headIconsPk = -1;
		this.field3903 = -1;
		this.field3902 = -1;
		this.field3897 = -1;
		this.field3899 = -1;
		this.field3900 = -1;
		this.field3901 = -1;
		this.field3896 = -1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljp;I)V",
		garbageValue = "1205783534"
	)
	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field3890.group);
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
				this.compass = var3.method6630();
				this.field3892 = var3.method6630();
				this.mapScenes = var3.method6630();
				this.headIconsPk = var3.method6630();
				this.field3903 = var3.method6630();
				this.field3902 = var3.method6630();
				this.field3897 = var3.method6630();
				this.field3899 = var3.method6630();
				this.field3900 = var3.method6630();
				this.field3901 = var3.method6630();
				this.field3896 = var3.method6630();
			}
		}
	}
}
