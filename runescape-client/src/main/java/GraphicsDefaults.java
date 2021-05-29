import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lz")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1949566455
	)
	@Export("compass")
	public int compass;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1513831133
	)
	public int field3897;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 791427789
	)
	@Export("mapScenes")
	public int mapScenes;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -14842639
	)
	@Export("headIconsPk")
	public int headIconsPk;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 765584361
	)
	public int field3900;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1577822991
	)
	public int field3901;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1223274063
	)
	public int field3905;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -1228774673
	)
	public int field3903;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -353348843
	)
	public int field3904;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1865970227
	)
	public int field3898;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 1606283035
	)
	public int field3906;

	public GraphicsDefaults() {
		this.compass = -1;
		this.field3897 = -1;
		this.mapScenes = -1;
		this.headIconsPk = -1;
		this.field3900 = -1;
		this.field3901 = -1;
		this.field3905 = -1;
		this.field3903 = -1;
		this.field3904 = -1;
		this.field3898 = -1;
		this.field3906 = -1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljv;B)V",
		garbageValue = "-61"
	)
	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field3892.group);
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
				this.compass = var3.method6583();
				this.field3897 = var3.method6583();
				this.mapScenes = var3.method6583();
				this.headIconsPk = var3.method6583();
				this.field3900 = var3.method6583();
				this.field3901 = var3.method6583();
				this.field3905 = var3.method6583();
				this.field3903 = var3.method6583();
				this.field3904 = var3.method6583();
				this.field3898 = var3.method6583();
				this.field3906 = var3.method6583();
			}
		}
	}
}
