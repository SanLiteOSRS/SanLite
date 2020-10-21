import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lo")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1450250857
	)
	@Export("graphicsTickTimeIdx")
	static int graphicsTickTimeIdx;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1995988465
	)
	@Export("compass")
	public int compass;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -395005955
	)
	public int field3835;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1288371471
	)
	@Export("mapScenes")
	public int mapScenes;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -768564219
	)
	@Export("headIconsPk")
	public int headIconsPk;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1062060293
	)
	public int field3836;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1307072609
	)
	public int field3839;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 534054869
	)
	public int field3841;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 2066068829
	)
	public int field3837;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 835992905
	)
	public int field3834;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 1361350511
	)
	public int field3842;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 643339115
	)
	public int field3844;

	public GraphicsDefaults() {
		this.compass = -1;
		this.field3835 = -1;
		this.mapScenes = -1;
		this.headIconsPk = -1;
		this.field3836 = -1;
		this.field3839 = -1;
		this.field3841 = -1;
		this.field3837 = -1;
		this.field3834 = -1;
		this.field3842 = -1;
		this.field3844 = -1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Liw;I)V",
		garbageValue = "-1821799353"
	)
	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field3833.group);
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
				this.compass = var3.method5851();
				this.field3835 = var3.method5851();
				this.mapScenes = var3.method5851();
				this.headIconsPk = var3.method5851();
				this.field3836 = var3.method5851();
				this.field3839 = var3.method5851();
				this.field3841 = var3.method5851();
				this.field3837 = var3.method5851();
				this.field3834 = var3.method5851();
				this.field3842 = var3.method5851();
				this.field3844 = var3.method5851();
			}
		}
	}
}
